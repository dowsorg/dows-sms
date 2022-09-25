package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgJob;


/**
 * 消息job,申请审核通过后会创建一个job,根据cron自动执行发送(MsgJob)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:38
 */
@Mapper
public interface MsgJobMapper extends MybatisCrudMapper<MsgJob> {
}
