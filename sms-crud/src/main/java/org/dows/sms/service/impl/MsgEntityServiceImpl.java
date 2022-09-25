package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgEntity;
import org.dows.sms.mapper.mysql.MsgEntityMapper;
import org.dows.sms.service.MsgEntityService;
import org.springframework.stereotype.Service;


/**
 * 消息模型定义(MsgEntity)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-18 20:42:58
 */
@Service
public class MsgEntityServiceImpl extends MybatisCrudServiceImpl<MsgEntityMapper, MsgEntity> implements MsgEntityService {

}
