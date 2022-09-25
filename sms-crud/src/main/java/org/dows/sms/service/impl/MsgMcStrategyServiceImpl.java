package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgMcStrategy;
import org.dows.sms.mapper.mysql.MsgMcStrategyMapper;
import org.dows.sms.service.MsgMcStrategyService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgMsgMcStrategyServiceIm
 * @Description: TODO
 * @date 2021/12/1010:25
 */
@Service
public class MsgMcStrategyServiceImpl extends MybatisCrudServiceImpl<MsgMcStrategyMapper, MsgMcStrategy> implements MsgMcStrategyService {
}
