package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelProperties;
import org.dows.sms.mapper.mysql.ChannelPropertiesMapper;
import org.dows.sms.service.ChannelPropertiesService;
import org.springframework.stereotype.Service;


/**
 * 通道配置文件(ChannelProperties)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Service
public class ChannelPropertiesServiceImpl extends MybatisCrudServiceImpl<ChannelPropertiesMapper, ChannelProperties> implements ChannelPropertiesService {

}
