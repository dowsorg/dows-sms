package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgJob;
import org.dows.sms.mapper.mysql.MsgJobMapper;
import org.dows.sms.service.MsgJobService;
import org.springframework.stereotype.Service;


/**
 * 消息job,申请审核通过后会创建一个job,根据cron自动执行发送(MsgJob)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
@Service
public class MsgJobServiceImpl extends MybatisCrudServiceImpl<MsgJobMapper, MsgJob> implements MsgJobService {

}
