package org.dows.sms.api.v2.sms;

import org.dows.sms.api.enums.MsgTyp;
import org.dows.sms.api.v2.Message;
import org.dows.sms.api.v2.MsgModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 单条短信消息
 */
public class IndustrySmsMsg extends SmsMsg implements Message {

    @Override
    public List<MsgModel> convert2MsgModel() {
        List<MsgModel> msgModels = new ArrayList<>();
        msgModels.add(clone());
        return msgModels;
    }


    @Override
    public MsgTyp getMsgTyp() {
        return MsgTyp.INDUSTRY;
    }

    @Override
    public IndustrySmsMsg clone() {
        try {
            IndustrySmsMsg clone = (IndustrySmsMsg) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
