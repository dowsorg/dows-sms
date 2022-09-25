package org.dows.sms.api.v2.wechat;

import lombok.Data;

import java.util.List;

/**
 * @Title: WeixinMessage
 * @Description: TODO
 * @date 2022/1/2715:34
 */
@Data
public class WeixinMessage {
    /**
     * 文本内容，最长不超过2048个字节，必须是utf8编码(必填)
     */
    private String content;

    /**
     * userid的列表，提醒群中的指定成员(@某个成员)，@all表示提醒所有人，如果开发者获取不到userid，可以使用mentioned_mobile_list
     * (非必填)
     */
    private List<String> mentionedList;

    /**
     * 手机号列表，提醒手机号对应的群成员(@某个成员)，@all表示提醒所有人
     */
    private List<String> mentionedMobileList;
}
