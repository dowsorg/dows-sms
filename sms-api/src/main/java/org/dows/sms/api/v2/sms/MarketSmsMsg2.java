package org.dows.sms.api.v2.sms;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;
import org.dows.sms.api.enums.MsgTyp;
import org.dows.sms.api.v2.Message;
import org.dows.sms.api.v2.MsgModel;

import java.util.ArrayList;
import java.util.List;


/**
 * 批量短信消息
 * 发送相同签名、不同的短信内容至多个不同手机号
 */
@Data
@ToString
@ApiModel
public class MarketSmsMsg2 extends SmsMsg implements Message {

    List<MsgModel> msgModels;

    /**
     * 统一标准转换，数据拉平
     *
     * @return
     */
    @Override
    public List<MsgModel> convert2MsgModel() {
        List<MsgModel> msgEntities = new ArrayList<>();
        MsgModel msgModel = clone();
        msgEntities.add(msgModel);
        return msgEntities;
    }

    /*@Override
    public MsgModel convert2SubMsgModel(Class<? extends MsgModel> subMsgModelClass) {
        return this;
    }*/

    public MsgTyp getMsgTyp() {
        return MsgTyp.MARKET;
    }

    @Override
    public MarketSmsMsg2 clone() {
        try {
            MarketSmsMsg2 clone = (MarketSmsMsg2) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

