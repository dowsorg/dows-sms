package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgAccount;
import org.dows.sms.mapper.mysql.MsgAccountMapper;
import org.dows.sms.service.MsgAccountService;
import org.springframework.stereotype.Service;

/**
 * 消息账号(MsgAccount)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Service
public class MsgAccountServiceImpl extends MybatisCrudServiceImpl<MsgAccountMapper, MsgAccount> implements MsgAccountService {

}
