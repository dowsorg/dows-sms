//package org.dows.sms.api;
//
//import lombok.ToString;
//
//import java.util.Date;
//import java.util.List;
//
//@ToString
//public abstract class SmsMsg implements MsgModel {
//
//    protected List<String> phoneNos;
////    private UserInfo userInfo;
//    private List<String> channelSenderCodeList;
//    private boolean async = true;
//    private String requestId;
//    private int retryCount;
//    // 回调接口，用于通知请求方
//    private int sentCounter;
//    private String callbackApi;
//    //已经使用过了通道,按拼接
//    private List<String> usedChannelSender;
//
//    private Date sendTime;
//
//    private boolean reSendFlag;
//
//    private List<SmsList> smsList;
//
//    @Override
//    public MsgModel setSmsList(List<SmsList> smsLists) {
//        return this;
//    }
//
//    @Override
//    public List<SmsList> getSmsList() {
//        return null;
//    }
//
//    @Override
//    public MsgModel setReSendFlag(boolean flag) {
//        this.reSendFlag = flag;
//        return this;
//    }
//
//    @Override
//    public Boolean reSendFlag() {
//        return reSendFlag;
//    }
//
//    @Override
//    public List<String> getUsedChannelSender() {
//        return usedChannelSender;
//    }
//
//    @Override
//    public MsgModel setUsedChannelSender(List<String> usedChannelSender) {
//        this.usedChannelSender = usedChannelSender;
//        return this;
//    }
//
//    @Override
//    public Date getSendTime() {
//        return sendTime;
//    }
//
//    @Override
//    public MsgModel setSendTime(Date sendTime) {
//        this.sendTime = sendTime;
//        return this;
//    }
//
//    @Override
//    public String getPhoneNumber() {
//        return null;
//    }
//
//    @Override
//    public MsgModel setPhoneNos(List<String> phoneNos) {
//        this.phoneNos = phoneNos;
//        return this;
//    }
//
//    @Override
//    public UserInfo getUserInfo() {
//        return userInfo;
//    }
//
//    @Override
//    public MsgModel setUserInfo(UserInfo userInfo) {
//        this.userInfo = userInfo;
//        return this;
//    }
//
//    @Override
//    public String getCustomId() {
//        return null;
//    }
//
//    @Override
//    public String getSign() {
//        return null;
//    }
//
//    @Override
//    public List<String> getChannelSenderCodeList() {
//        return channelSenderCodeList;
//    }
//
//    @Override
//    public MsgModel setChannelSenderCodeList(List<String> channelSenderCodeList) {
//        this.channelSenderCodeList = channelSenderCodeList;
//        return this;
//    }
//
//    @Override
//    public boolean isAsync() {
//        return async;
//    }
//
//    @Override
//    public MsgModel setAsync(boolean async) {
//        this.async = async;
//        return this;
//    }
//
//    @Override
//    public String getRequestId() {
//        return requestId;
//    }
//
//    @Override
//    public MsgModel setRequestId(String requestId) {
//        this.requestId = requestId;
//        return this;
//    }
//
//    @Override
//    public int getRetryCount() {
//        return retryCount;
//    }
//
//    @Override
//    public MsgModel setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//        return this;
//    }
//
//    @Override
//    public int getSentCounter() {
//        return sentCounter;
//    }
//
//    @Override
//    public MsgModel setSentCounter(int sentCounter) {
//        this.sentCounter = sentCounter;
//        return this;
//    }
//
//    @Override
//    public String getCallbackApi() {
//        return callbackApi;
//    }
//
//    @Override
//    public MsgModel setCallbackApi(String callbackApi) {
//        this.callbackApi = callbackApi;
//        return this;
//    }
//
//
//}
