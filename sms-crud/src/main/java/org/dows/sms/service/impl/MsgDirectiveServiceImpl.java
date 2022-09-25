package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgDirective;
import org.dows.sms.mapper.mysql.MsgDirectiveMapper;
import org.dows.sms.service.MsgDirectiveService;
import org.springframework.stereotype.Service;


/**
 * 消息指令job(MsgDirective)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Service
public class MsgDirectiveServiceImpl extends MybatisCrudServiceImpl<MsgDirectiveMapper, MsgDirective> implements MsgDirectiveService {

}
