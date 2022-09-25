package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgMcExcludeSign;
import org.dows.sms.mapper.mysql.MsgMcExcludeSignMapper;
import org.dows.sms.service.MsgMcExcludeSignService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgMcExcludeSignServiceIm
 * @Description: TODO
 * @date 2021/12/1010:25
 */
@Service
public class MsgMcExcludeSignServiceImpl extends MybatisCrudServiceImpl<MsgMcExcludeSignMapper, MsgMcExcludeSign> implements MsgMcExcludeSignService {
}
