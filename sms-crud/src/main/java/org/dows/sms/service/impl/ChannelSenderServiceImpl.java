package org.dows.sms.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelInstance;
import org.dows.sms.entity.mysql.ChannelSender;
import org.dows.sms.mapper.mysql.ChannelSenderMapper;
import org.dows.sms.service.ChannelInstanceService;
import org.dows.sms.service.ChannelSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 通道消息发送器(ChannelSender)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Service
@Slf4j
public class ChannelSenderServiceImpl extends MybatisCrudServiceImpl<ChannelSenderMapper, ChannelSender> implements ChannelSenderService {
    @Autowired
    private ChannelInstanceService channelInstanceService;
    @Autowired
    private ChannelSenderMapper channelSenderMapper;

    @Override
    public boolean save(ChannelSender entity) {
        setNoData(entity);
        channelSenderMapper.insert(entity);
        return true;
    }

    @Override
    public boolean updateById(ChannelSender entity) {
        setNoData(entity);
        channelSenderMapper.updateById(entity);
        return true;
    }

    ChannelSender setNoData(ChannelSender entity) {
        String channelId = entity.getChannelNo();
        ChannelInstance ci = channelInstanceService.getById(channelId);
        if (ci == null) {
            //throw new SmsException("ChannelNo为：" + channelId + "的可用数据不存在");
        }
        entity.setChannelCode(ci.getChannelCode());
        entity.setChannelName(ci.getChannelName());
        return entity;
    }

}
