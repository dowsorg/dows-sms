package org.dows.sms.api.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;


@Slf4j
public class ContentUtil {
    private static final int SIGN_BRACKET = 2;
    // 梦网科技计算流水号常量
    private static final long CALCULATE_MSG_ID_CONST = 17179869184L;

    public static String formatContent(String content, String sign, Integer isSigned) {
        {
            if (isSigned == 0) {
                return String.format("【%s】%s", sign, content);
            }
        }
        return content;
    }

    /**
     * 计算短信条数
     *
     * @param content
     * @param sign
     * @return
     */
    public static int calculateContent(String content, String sign) {
        int length = (!content.isEmpty() ? content.length() : 0) + (!sign.isEmpty() ? sign.length() : 0) + SIGN_BRACKET;
        if (length <= 70) {
            return 1;
        }
        return (length - 70) / 67 + 2;

    }

    /**
     * 拆分短信内容
     *
     * @param content
     * @param contentIndex
     * @param sign
     * @return
     */
    public static String divideContent(String content, int contentIndex, String sign) {
        int length = content.length() + sign.length() + SIGN_BRACKET;
        int firstLength = 70 - SIGN_BRACKET - sign.length();

        if (contentIndex == 0) {
            if (length <= 70) {
                return content;
            }
            return content.substring(0, firstLength);
        }

        if ((67 * contentIndex + firstLength) < content.length()) {
            return content.substring(67 * (contentIndex - 1) + firstLength, 67 * contentIndex + firstLength);
        }
        return content.substring(67 * (contentIndex - 1) + firstLength, content.length());
    }

    /**
     * 梦网:
     * 假如发送包中有M个手机号，并且短信需要折分为N条，平台返回了一个流水号spmsgid.
     * 那么第M个手机第N条短信的流水号为：
     * (spmsgid+(M-1))+(N-1)* 17179869184
     *
     * @param msgId
     * @param phoneIndex
     * @param contentIndex
     * @return
     */
    public static long calculateMsgId(long msgId, int phoneIndex, int contentIndex) {
        return (msgId + phoneIndex) + contentIndex * CALCULATE_MSG_ID_CONST;
    }

    public static Integer binarysearchKey(List<String> list, float targetNum) {
        Collections.sort(list, (o1, o2) -> (Integer.valueOf(o1) - Integer.valueOf(o2)));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int left = 0, right = 0;
        //比最大的值还大
        if (targetNum > Integer.valueOf(list.get(list.size() - 1))) {
            return null;
        }
        for (right = list.size() - 1; left != right; ) {
            int midIndex = (right + left) / 2;
            int mid = (right - left);
            int midValue = Integer.valueOf(list.get(midIndex));
            if (targetNum == midValue) {
                return midIndex;
            }
            if (targetNum > midValue) {
                left = midIndex;
            } else {
                right = midIndex;
            }

            if (mid <= 1) {
                break;
            }
        }
        int rightnum = Integer.valueOf(list.get(right));

        int result = rightnum;
        log.info("计算值为：{}策略向上靠近，取值为：{}", targetNum, result);
        return result;
    }

    public static String encode(String sign) {
        String s = "";
        try {
            s = Base64.getEncoder().encodeToString(sign.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }

}
