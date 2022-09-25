package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.ChannelSignature;


/**
 * 通道签名(ChannelSignature)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Mapper
public interface ChannelSignatureMapper extends MybatisCrudMapper<ChannelSignature> {

}
