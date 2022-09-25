package org.dows.sms.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgMcStrategy;

@Mapper
public interface MsgMcStrategyMapper extends MybatisCrudMapper<MsgMcStrategy> {
}
