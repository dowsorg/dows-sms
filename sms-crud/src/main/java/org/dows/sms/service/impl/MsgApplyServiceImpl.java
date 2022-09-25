package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgApply;
import org.dows.sms.mapper.mysql.MsgApplyMapper;
import org.dows.sms.service.MsgApplyService;
import org.springframework.stereotype.Service;

/**
 * 消息接入申请(MsgApply)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Service
public class MsgApplyServiceImpl extends MybatisCrudServiceImpl<MsgApplyMapper, MsgApply> implements MsgApplyService {

}
