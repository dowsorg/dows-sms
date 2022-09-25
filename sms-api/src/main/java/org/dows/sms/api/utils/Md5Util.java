package org.dows.sms.api.utils;

import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;

public class Md5Util {

    public static String MD5Encode(String text) {
        return getMd5("MD5", 0, "utf-8", text);
    }

    public static String getMd5(String Md5OrSHA, int type, String encoding, String text) {
        String md5Str = null;
        if (null == encoding) {
            encoding = "utf-8";
        }
        if (null == Md5OrSHA) {
            Md5OrSHA = "MD5";
        }
        try {
            StringBuffer buf = new StringBuffer();
            MessageDigest md = MessageDigest.getInstance(Md5OrSHA);
            md.update(text.getBytes(encoding));
            byte[] b = md.digest();

            for (int offset = 0; offset < b.length; ++offset) {
                int i = b[offset];
                if (i < 0) {
                    i += 256;
                }

                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));
            }

            if (type == 0) {
                md5Str = buf.toString();
            } else {
                md5Str = buf.toString().substring(8, 24);
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        return md5Str;
    }

    public static String getDes(String deskey, int type, String str, String encoding) {
        if (null == encoding) {
            encoding = "utf-8";
        }

        try {
            byte[] desbyte = deskey.getBytes();
            byte[] arrB = new byte[8];

            for (int i = 0; i < desbyte.length && i < arrB.length; ++i) {
                arrB[i] = desbyte[i];
            }

            Key key = new SecretKeySpec(arrB, "DES");
            byte[] byStr = str.getBytes(encoding);
            Cipher cipher = Cipher.getInstance("DES");
            if (type == 0) {
                cipher.init(1, key);
                byte[] btArrC = cipher.doFinal(byStr);
                int iLen = btArrC.length;
                StringBuffer sb = new StringBuffer(iLen * 2);

                for (int i = 0; i < iLen; ++i) {
                    int intTmp;
                    for (intTmp = btArrC[i]; intTmp < 0; intTmp += 256) {
                    }

                    if (intTmp < 16) {
                        sb.append("0");
                    }

                    sb.append(Integer.toString(intTmp, 16));
                }

                return sb.toString();
            } else {
                cipher.init(2, key);
                int iLen = byStr.length;
                byte[] arrOut = new byte[iLen / 2];

                for (int i = 0; i < iLen; i += 2) {
                    String strTmp = new String(byStr, i, 2);
                    arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
                }

                return new String(cipher.doFinal(arrOut));
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /**
     * 签名字符??
     *
     * @param text         签名的字符串
     * @param key          密钥
     * @param inputCharset 编码格式
     * @return 签名结果
     */
    public static String sign(String text, String key, String inputCharset) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, inputCharset));
    }

    public static String signMd5(String text, String inputCharset) {
        return DigestUtils.md5Hex(getContentBytes(text, inputCharset));
    }

    /**
     * 签名字符
     *
     * @param text         签名的字符串
     * @param sign         签名结果
     * @param key          密钥
     * @param inputCharset 编码格式
     * @return 签名结果
     */
    public static boolean verify(String text, String sign, String key, String inputCharset) {
        text = text + key;
        String mysign = DigestUtils.md5Hex(getContentBytes(text, inputCharset));
        return mysign.equals(sign);
    }

    /**
     * @param content
     * @param charset
     * @return throws SignatureException
     * @throws UnsupportedEncodingException
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错??指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }

    public static String encrypt32(String encryptStr) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(encryptStr.getBytes());
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }
            encryptStr = hexValue.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return encryptStr;
    }

}
