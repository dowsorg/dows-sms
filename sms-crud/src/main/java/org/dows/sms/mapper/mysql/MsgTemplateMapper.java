package org.dows.sms.mapper.mysql;


import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.sms.entity.mysql.MsgTemplate;


/**
 * 消息模板(MsgTemplate)
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:39
 */
@Mapper
public interface MsgTemplateMapper extends MybatisCrudMapper<MsgTemplate> {

}
