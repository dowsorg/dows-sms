package org.dows.sms.service.impl;

import cn.hutool.core.util.ObjectUtil;
import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelInstance;
import org.dows.sms.entity.mysql.ChannelSender;
import org.dows.sms.entity.mysql.MsgInstance;
import org.dows.sms.mapper.mysql.MsgInstanceMapper;
import org.dows.sms.service.ChannelInstanceService;
import org.dows.sms.service.ChannelSenderService;
import org.dows.sms.service.MsgInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息实列(MsgInstance)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Service
public class MsgInstanceServiceImpl extends MybatisCrudServiceImpl<MsgInstanceMapper, MsgInstance> implements MsgInstanceService {
    @Autowired
    private ChannelInstanceService channelInstanceService;
    @Autowired
    private ChannelSenderService channelSenderService;
    @Autowired
    private MsgInstanceMapper msgInstanceMapper;


    @Override
    public boolean save(MsgInstance entity) {
        setNoData(entity);
        msgInstanceMapper.insert(entity);
        return true;
    }

    @Override
    public boolean updateById(MsgInstance entity) {
        setNoData(entity);
        msgInstanceMapper.updateById(entity);
        return true;
    }

    MsgInstance setNoData(MsgInstance entity) {
        String channelId = entity.getChannelNo();
        ChannelInstance ci = channelInstanceService.getById(channelId);
        if (ci == null) {
            //throw new SmsException("ChannelNo为：" + channelId + "的可用数据不存在");
        }
        entity.setChannelCode(ci.getChannelCode());
        entity.setChannelName(ci.getChannelName());
        ChannelSender sender = channelSenderService.getById(ObjectUtil.isNotEmpty(entity.getSenderNo()) ? entity.getSenderNo() : entity.getId());
        if (sender == null) {
            //throw new SmsException("SenderNo为：" + entity.getSenderNo() + "的可用数据不存在");
        }
        entity.setSenderCode(sender.getSenderCode());
        return entity;
    }
}
