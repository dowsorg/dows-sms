package org.dows.sms.api.v2.sms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.dows.sms.api.enums.MsgTyp;
import org.dows.sms.api.v2.Message;
import org.dows.sms.api.v2.MsgModel;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * 批量短信消息
 * 发送签名相同、短信内容相同的消息至多个不同的手机号
 */
@Data
@ToString
@ApiModel
public class MarketSmsMsg extends SmsMsg implements Message {

    @Valid
    @NotEmpty
    @ApiModelProperty(value = "手机号列表", required = true)
    private List<String> phoneNumbers;

    /**
     * 统一标准转换，数据拉平，后面所有操作直接该集合对象
     *
     * @return
     */
    @Override
    public List<MsgModel> convert2MsgModel() {
        List<MsgModel> msgModels = new ArrayList<>();
        phoneNumbers.stream().forEach(p -> {
            MsgModel msgModel = clone();
//            msgModel.setPushTyp(getPushTyp());
//            msgModel.setMsgTyp(getMsgTyp());
            msgModel.setAppId(getAppId());
            msgModel.setCustomId(getCustomId());
            msgModel.setContent(getContent());
            msgModel.setTopic(getTopic());
            msgModels.add(msgModel);
        });
        return msgModels;
    }

/*    @Override
    public MsgModel convert2SubMsgModel(Class<? extends MsgModel> subMsgModelClass) {
        return this;
    }*/

    /**
     * @return
     */
    public MsgTyp getMsgTyp() {
        return MsgTyp.MARKET;
    }


    @Override
    public MarketSmsMsg clone() {
        try {
            MarketSmsMsg clone = (MarketSmsMsg) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

