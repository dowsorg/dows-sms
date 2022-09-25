package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgDirective;


/**
 * 消息指令job(MsgDirective)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Mapper
public interface MsgDirectiveMapper extends MybatisCrudMapper<MsgDirective> {

}
