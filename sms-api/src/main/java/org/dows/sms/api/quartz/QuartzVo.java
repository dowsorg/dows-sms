package org.dows.sms.api.quartz;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Title: QuartzVo
 * @Description: TODO
 * @date 2021/11/2414:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "quartz任务实体")
@Builder
public class QuartzVo extends QuartzQueryVo {

    @ApiModelProperty(value = "任务名称", required = false)
    private String jobName;
    @ApiModelProperty(value = "任务所属分组", required = false)
    private String jobGroupName;
    @ApiModelProperty(value = "任务描述", required = false)
    private String description;
    @ApiModelProperty(value = "任务状态", required = false)
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


}
