package org.dows.sms.mapper.mysql;


import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgApply;


/**
 * 消息接入申请(MsgApply)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Mapper
public interface MsgApplyMapper extends MybatisCrudMapper<MsgApply> {

}
