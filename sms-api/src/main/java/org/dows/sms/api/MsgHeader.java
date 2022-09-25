package org.dows.sms.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dows.sms.api.enums.MsgTyp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MsgHeader {
    //    // 应用编号或ID
//    private String appId;
//    // 租户编号或ID
//    private String tenantNo;
    // 消息类型
    private MsgTyp msgTyp;
    // 指令常量值，只有3个
    private Integer msgDirective;
    //
//    // uid ?
//    private String uid;
    // ?
    // private String userInfo;
    //private UserInfo userInfo;


}
