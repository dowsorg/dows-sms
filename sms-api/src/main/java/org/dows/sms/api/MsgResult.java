package org.dows.sms.api;

import java.util.List;

public interface MsgResult {
    String getRequestId();

    MsgResult setRequestId(String requestId);

    Boolean getResult();

    /**
     * 语音短信数量超限集合(未发送)
     */
    List<String> getExceedPhones();


}
