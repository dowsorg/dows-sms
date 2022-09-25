package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgMcNotifyUser;
import org.dows.sms.mapper.mysql.MsgMcNotifyUserMapper;
import org.dows.sms.service.MsgMcNotifyUserService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgMsgMcNotifyUserServiceIm
 * @Description: TODO
 * @date 2021/12/1010:25
 */
@Service
public class MsgMcNotifyUserServiceImpl extends MybatisCrudServiceImpl<MsgMcNotifyUserMapper, MsgMcNotifyUser> implements MsgMcNotifyUserService {
}
