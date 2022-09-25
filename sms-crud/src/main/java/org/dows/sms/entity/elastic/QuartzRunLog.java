package org.dows.sms.entity.elastic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信发送请求原始清单
 */

@Document(indexName = "msg_quartz_run_log")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuartzRunLog implements Serializable {
    @Id
    @Field(type = FieldType.Auto, store = true, index = false)
    private String id;
    @ApiModelProperty(value = "任务名称", required = false)
    private String jobName;
    @ApiModelProperty(value = "任务所属分组", required = false)
    private String jobGroupName;
    @ApiModelProperty(value = "任务描述", required = false)
    private String description;
    @ApiModelProperty(value = "任务状态 0正在执行1执行成功2执行异常失败", required = false)
    private String jobStatus;
    @ApiModelProperty(value = "任务开始时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @ApiModelProperty(value = "任务下次执行时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date nextFireTime;
    @ApiModelProperty(value = "任务前次执行时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date previousFireTime;
    @ApiModelProperty(value = "任务cron表达式", required = false)
    private String jobTime;
    private Date dt;

    private String exceptionDetail;
    private String params;

}
