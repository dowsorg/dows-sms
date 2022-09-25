package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.ChannelInstance;
import org.dows.sms.entity.mysql.ChannelSignature;
import org.dows.sms.mapper.mysql.ChannelSignatureMapper;
import org.dows.sms.service.ChannelInstanceService;
import org.dows.sms.service.ChannelSignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 通道签名(ChannelSignature)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Service
public class ChannelSignatureServiceImpl extends MybatisCrudServiceImpl<ChannelSignatureMapper, ChannelSignature> implements ChannelSignatureService {
    @Autowired
    private ChannelInstanceService channelInstanceService;
    @Autowired
    private ChannelSignatureMapper channelSignatureMapper;

    @Override
    public boolean save(ChannelSignature entity) {
        setNoData(entity);
        channelSignatureMapper.insert(entity);
        return true;
    }

    @Override
    public boolean updateById(ChannelSignature entity) {
        setNoData(entity);
        channelSignatureMapper.updateById(entity);
        return true;
    }

    ChannelSignature setNoData(ChannelSignature entity) {
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
