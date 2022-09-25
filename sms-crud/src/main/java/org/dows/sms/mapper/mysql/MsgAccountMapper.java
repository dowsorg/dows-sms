package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgAccount;


/**
 * 消息账号(MsgAccount)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:36
 */
@Mapper
public interface MsgAccountMapper extends MybatisCrudMapper<MsgAccount> {

}
