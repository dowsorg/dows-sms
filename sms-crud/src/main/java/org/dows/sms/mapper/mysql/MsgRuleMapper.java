package org.dows.sms.mapper.mysql;


import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgRule;


/**
 * 手机号提取规则(MsgRule)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
@Mapper
public interface MsgRuleMapper extends MybatisCrudMapper<MsgRule> {

}
