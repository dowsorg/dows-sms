package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgContract;

import java.util.List;


/**
 * 消息合同(MsgContract)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Mapper
public interface MsgContractMapper extends MybatisCrudMapper<MsgContract> {

    @Update("      update\n" +
            "        sms_channel_contract\n" +
            "        set\n" +
            "        contract_status=if((now() &gt; contract_deadline and contract_deadline is not null) or (now() &lt; contract_comtime and contract_comtime is not null ),false,true);\n" +
            "  ")
    boolean updateStatus();

    @Select("  select\n" +
            "        name,sms_type,unit_price,sms_code\n" +
            "        from\n" +
            "        sms_channel_contract a\n" +
            "        right join\n" +
            "        (select concat(name,sms_type)as tab,max(created_time) as time from sms_channel_contract group by tab) b\n" +
            "        on\n" +
            "        concat(name,sms_type)=b.tab and a.created_time=b.time;")
    List<MsgContract> getUnitPrice();


}
