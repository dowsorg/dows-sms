package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.ChannelSender;


/**
 * 通道消息发送器(ChannelSender)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Mapper
public interface ChannelSenderMapper extends MybatisCrudMapper<ChannelSender> {

}
