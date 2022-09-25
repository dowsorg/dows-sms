package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelStatus;
import org.dows.sms.mapper.mysql.ChannelStatusMapper;
import org.dows.sms.service.ChannelStatusService;
import org.springframework.stereotype.Service;


/**
 * 短信统一状态码(ChannelStatus)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Service
public class ChannelStatusServiceImpl extends MybatisCrudServiceImpl<ChannelStatusMapper, ChannelStatus> implements ChannelStatusService {

}
