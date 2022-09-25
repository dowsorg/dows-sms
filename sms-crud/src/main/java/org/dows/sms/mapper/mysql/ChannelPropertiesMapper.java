package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.ChannelProperties;


/**
 * 通道配置文件(ChannelProperties)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Mapper
public interface ChannelPropertiesMapper extends MybatisCrudMapper<ChannelProperties> {

}
