package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgBillJob;
import org.dows.sms.mapper.mysql.MsgBillJobMapper;
import org.dows.sms.service.MsgBillJobService;
import org.springframework.stereotype.Service;

/**
 * @Title: MsgBillJobServiceImpl
 * @Description: TODO
 * @date 2021/11/2614:47
 */
@Service
public class MsgBillJobServiceImpl extends MybatisCrudServiceImpl<MsgBillJobMapper, MsgBillJob> implements MsgBillJobService {


}
