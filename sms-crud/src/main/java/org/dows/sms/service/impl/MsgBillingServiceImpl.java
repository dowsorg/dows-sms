package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgBilling;
import org.dows.sms.mapper.mysql.MsgBillingMapper;
import org.dows.sms.service.MsgBillingService;
import org.springframework.stereotype.Service;


/**
 * 消息账单（job每天24点定时生成前一天数据）(MsgBilling)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Service
public class MsgBillingServiceImpl extends MybatisCrudServiceImpl<MsgBillingMapper, MsgBilling> implements MsgBillingService {

}
