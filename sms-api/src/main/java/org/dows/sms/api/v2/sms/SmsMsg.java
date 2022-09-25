package org.dows.sms.api.v2.sms;

import org.dows.sms.api.enums.PushTyp;
import org.dows.sms.api.v2.Message;
import org.dows.sms.api.v2.MsgModel;

/**
 * 短信消息抽象类
 */
public abstract class SmsMsg extends MsgModel implements Message {
    @Override
    public PushTyp getPushTyp() {
        return PushTyp.SMS;
    }

}
