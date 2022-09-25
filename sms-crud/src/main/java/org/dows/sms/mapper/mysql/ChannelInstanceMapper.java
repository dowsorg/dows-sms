package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.ChannelInstance;


/**
 * 通道实列(ChannelInstance)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:33
 */
@Mapper
public interface ChannelInstanceMapper extends MybatisCrudMapper<ChannelInstance> {

}
