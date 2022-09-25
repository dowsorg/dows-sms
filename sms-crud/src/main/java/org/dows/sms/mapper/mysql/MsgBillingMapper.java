package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgBilling;


/**
 * 消息账单（job每天24点定时生成前一天数据）(MsgBilling)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Mapper
public interface MsgBillingMapper extends MybatisCrudMapper<MsgBilling> {

}
