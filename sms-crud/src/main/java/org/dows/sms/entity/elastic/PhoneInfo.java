package org.dows.sms.entity.elastic;

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

import java.io.Serializable;
import java.util.Date;

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "msg_phone_info")
@ApiModel(value = "手机号状态信息", description = "查询第三方接口得到的相关信息")
public class PhoneInfo implements Serializable {


    private Boolean deleted;
    @ApiModelProperty("主键")
    @Id
    private String mobile;
    /**
     * 最新更新时间戳，毫秒
     */
    @ApiModelProperty("最新更新时间戳")
    private String lastTime;
    /**
     * 手机号所属区域。样例：省-市
     */
    @ApiModelProperty("手机号所属区域")
    private String area;
    /**
     * 手机号运营商类型。样例：中国移动
     */
    @ApiModelProperty("手机号运营商类型")
    private String numberType;
    /**
     * 检测结果：0 空号，1 实号，2 停机，3 库无，4 沉默号，5 风险号
     */
    @ApiModelProperty("检测结果")
    private String status;
    /**
     * 首次查询服务商接口时间
     */
    @ApiModelProperty("首次查询服务商接口时间")
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date firstQueryTime;
    /**
     * 最近一次查询服务商接口时间
     */
    @ApiModelProperty("最近一次查询服务商接口时间")
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateQueryTime;


}
