package org.dows.sms.api.v2;

import org.dows.sms.api.enums.MsgTyp;
import org.dows.sms.api.enums.PushTyp;

import java.util.List;

/**
 * 消息接口
 */
public interface Message {
    /**
     * 获取msgModel（拉平标准化转化）
     *
     * @return
     */
    List<MsgModel> convert2MsgModel();

    /**
     * 转换为子类对象
     * @param subMsgModelClass
     * @return
     */
    /*< T extends MsgModel> T convert2SubMsgModel( Class<T> clazz);*/

    /**
     * 获取消息类型
     *
     * @return
     */
    MsgTyp getMsgTyp();

    /**
     * 获取推送方式
     *
     * @return
     */
    PushTyp getPushTyp();
}
