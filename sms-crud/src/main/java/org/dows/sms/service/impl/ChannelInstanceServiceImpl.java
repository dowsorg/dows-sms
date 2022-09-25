package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelInstance;
import org.dows.sms.mapper.mysql.ChannelInstanceMapper;
import org.dows.sms.service.ChannelInstanceService;
import org.springframework.stereotype.Service;


/**
 * 通道实列(ChannelInstance)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:32
 */
@Service
public class ChannelInstanceServiceImpl extends MybatisCrudServiceImpl<ChannelInstanceMapper, ChannelInstance> implements ChannelInstanceService {

}
