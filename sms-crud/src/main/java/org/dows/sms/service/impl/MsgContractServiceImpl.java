package org.dows.sms.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.sms.entity.mysql.MsgContract;
import org.dows.sms.mapper.mysql.MsgContractMapper;
import org.dows.sms.service.MsgContractService;
import org.springframework.stereotype.Service;


/**
 * 消息合同(MsgContract)表服务实现类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Service
public class MsgContractServiceImpl extends MybatisCrudServiceImpl<MsgContractMapper, MsgContract> implements MsgContractService {

}
