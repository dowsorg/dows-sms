package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgEntity;

/**
 * 消息模型定义(MsgEntity)
 *
 * @author VX:PN15855012581
 * @since 2021-11-18 20:42:58
 */
@Mapper
public interface MsgEntityMapper extends MybatisCrudMapper<MsgEntity> {

}
