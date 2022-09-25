package org.dows.sms.service;

import org.dows.framework.crud.mybatis.MybatisCrudService;
import org.dows.sms.entity.mysql.MsgJob;


/**
 * 消息job,申请审核通过后会创建一个job,根据cron自动执行发送(MsgJob)表服务接口
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
public interface MsgJobService extends MybatisCrudService<MsgJob> {

}
