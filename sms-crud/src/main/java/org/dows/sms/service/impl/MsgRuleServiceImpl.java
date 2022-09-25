package org.dows.sms.service.impl;


import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgRule;
import org.dows.sms.mapper.mysql.MsgRuleMapper;
import org.dows.sms.service.MsgRuleService;
import org.springframework.stereotype.Service;


/**
 * 手机号提取规则(MsgRule)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
@Service
public class MsgRuleServiceImpl extends MybatisCrudServiceImpl<MsgRuleMapper, MsgRule> implements MsgRuleService {

}
