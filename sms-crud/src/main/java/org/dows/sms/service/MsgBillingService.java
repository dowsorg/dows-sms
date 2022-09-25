package org.dows.sms.service;

import org.dows.framework.crud.mybatis.MybatisCrudService;
import org.dows.sms.entity.mysql.MsgBilling;


/**
 * 消息账单（job每天24点定时生成前一天数据）(MsgBilling)表服务接口
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
public interface MsgBillingService extends MybatisCrudService<MsgBilling> {

}
