package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgMonitorConfig;
import org.dows.sms.mapper.mysql.MsgMonitorConfigMapper;
import org.dows.sms.service.MsgMonitorConfigService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgMonitorConfigServiceIm
 * @Description: TODO
 * @date 2021/12/1010:25
 */
@Service
public class MsgMonitorConfigServiceImpl extends MybatisCrudServiceImpl<MsgMonitorConfigMapper, MsgMonitorConfig> implements MsgMonitorConfigService {
}
