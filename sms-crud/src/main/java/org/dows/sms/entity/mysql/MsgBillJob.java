package org.dows.sms.entity.mysql;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

import java.util.Date;

@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgBillJob对象", description = "账单任务")
public class MsgBillJob implements CrudEntity {
    private Long id;

    private String jobNo;

    private String cronExpr;

    private String ruleExpr;

    private Integer status;

    private Boolean deleted;

    private Date dt;

    private String templateNo;

    private String signature;

    private String jobName;

    private String jobGroupName;


}