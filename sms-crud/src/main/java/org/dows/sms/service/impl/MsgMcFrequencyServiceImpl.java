package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgMcFrequency;
import org.dows.sms.mapper.mysql.MsgMcFrequencyMapper;
import org.dows.sms.service.MsgMcFrequencyService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgMsgMcFrequencyServiceIm
 * @Description: TODO
 * @date 2021/12/1010:25
 */
@Service
public class MsgMcFrequencyServiceImpl extends MybatisCrudServiceImpl<MsgMcFrequencyMapper, MsgMcFrequency> implements MsgMcFrequencyService {
}
