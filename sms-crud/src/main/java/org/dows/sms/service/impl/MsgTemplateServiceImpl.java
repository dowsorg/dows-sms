package org.dows.sms.service.impl;


import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgTemplate;
import org.dows.sms.mapper.mysql.MsgTemplateMapper;
import org.dows.sms.service.MsgTemplateService;
import org.springframework.stereotype.Service;


/**
 * 消息模板(MsgTemplate)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:39
 */
@Service
public class MsgTemplateServiceImpl extends MybatisCrudServiceImpl<MsgTemplateMapper, MsgTemplate> implements MsgTemplateService {

}
