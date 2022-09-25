package org.dows.sms.api;

import org.dows.sms.api.enums.MsgTyp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 消息模型
 */

public interface MsgModel extends Serializable, Cloneable {
    MsgTyp getMsgTyp();

    String getSign();

    List<String> getPhoneNos();


    MsgModel setPhoneNos(List<String> phoneNos);

    String getCallbackApi();

    /**
     * 业务回调接口
     *
     * @param callbackApi
     * @return
     */

    MsgModel setCallbackApi(String callbackApi);


    /**
     * 通道列表: 格式为 jiweiMarketSender/jiweiIndustrySender/jiweiVoiceSender/...
     */
    List<String> getChannelSenderCodeList();

    /**
     * 通道列表: 格式为 jiweiMarketSender/jiweiIndustrySender/jiweiVoiceSender/...
     *
     * @param channelSenderCodeList
     */

    MsgModel setChannelSenderCodeList(List<String> channelSenderCodeList);

    /**
     * mq 消息是否异步
     *
     * @return
     */
    boolean isAsync();


    MsgModel setAsync(boolean isAsync);

    String getRequestId();


    MsgModel setRequestId(String requestId);

    int getRetryCount();


    MsgModel setRetryCount(int retryCount);

    int getSentCounter();


    MsgModel setSentCounter(int sentCounter);

    //已经使用过了通道
    List<String> getUsedChannelSender();


    MsgModel setUsedChannelSender(List<String> usedChannelSender);

    Date getSendTime();


    MsgModel setSendTime(Date sendTime);

    String getContent();

    String getCustomId();

    String getPhoneNumber();


    Boolean reSendFlag();

    MsgModel setReSendFlag(boolean flag);

//    List<SmsList> getSmsList();
//    MsgModel setSmsList(List<SmsList> smsLists);

//    UserInfo getUserInfo();
//    MsgModel setUserInfo(UserInfo userInfo);
}

