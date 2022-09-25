package org.dows.sms.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MsgRequest<M extends MsgModel> {
    // 请求时间
    private final Date requestTime = Calendar.getInstance().getTime();
    // 消息头
    private MsgHeader msgHeader;
    // 请求体
    private M msgBody;
    // 关了本次会话
    private MsgSession msgSession;
}
