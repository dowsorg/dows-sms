package org.dows.sms.entity.elastic;

import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

import static cn.hutool.core.date.DatePattern.PURE_DATETIME_PATTERN;

@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "msg_phone_info_query")
@ApiModel(value = "业务方请求记录", description = "业务方调用短信服务相关的请求记录数据")
public class PhoneInfoQuery {
    @ApiModelProperty("业务方查询设置超时时间")
    Integer timeoutNum;
    @ApiModelProperty("业务方设置查询时间单位")
    String numUnit;
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;
    private Boolean deleted;
    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String mobile;
    /**
     * 太一账号
     */
    @ApiModelProperty("太一账号")
    private String subUserId;
    @ApiModelProperty("应用id")
    private String appId;
    /**
     * 调用时间
     */
    @ApiModelProperty("调用时间")
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 调用类型
     */
    @ApiModelProperty("调用类型")
    private String queryType;
    /**
     * 计费次数 0/1 查询服务商为1
     */
    @ApiModelProperty("计费次数")
    private String fareCount;
    @ApiModelProperty("调用第三方请求时间")
    @Field(type = FieldType.Date, format = DateFormat.date_optional_time)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSZ", timezone = "GMT+8")
    private Date interReqTime;
    @ApiModelProperty("调用第三方响应事件")
    @Field(type = FieldType.Date, format = DateFormat.date_optional_time)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSZ", timezone = "GMT+8")
    private Date interRespTime;
    @ApiModelProperty("调用第三方放回结果")
    private Integer interResult;
    @ApiModelProperty("订单号")
    private String orderId;
    @ApiModelProperty("第三方返回errorCode")
    private String errorCode;
    private String tenantId;
    private String createTimeStr;
    private String remoteReqTime;
    private String remoteRespTime;

    public String getCreateTimeStr() {

        return DateUtil.format(new Date(), PURE_DATETIME_PATTERN);
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }
}
