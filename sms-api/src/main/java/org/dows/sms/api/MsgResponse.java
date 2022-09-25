package org.dows.sms.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dows.sms.api.enums.MsgStatus;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgResponse<M extends MsgResult> implements Serializable {
    // 不同通道商返回的结果
    private M msgResult;
    // 统一不同通道商的状态及状态码
    private MsgStatus msgStatus;


}
