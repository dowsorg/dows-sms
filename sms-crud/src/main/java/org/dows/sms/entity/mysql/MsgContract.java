package org.dows.sms.entity.mysql;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 消息合同(MsgContract)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:37
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "MsgContract对象", description = "消息合同")
public class MsgContract implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("通道编号")
    //@NotEmpty(message = "商户号不能为空")
    private String channelNo;
    @ApiModelProperty("通道码")
    //@NotEmpty(message = "商户号不能为空")
    private String channelCode;
    @ApiModelProperty("通道名称")
    @TableField(whereStrategy = FieldStrategy.NOT_EMPTY)
    //@NotEmpty(message = "商户号不能为空")
    private String channelName;
    @ApiModelProperty("请求的消息类型")
    //@NotEmpty(message = "商户号不能为空")
    private Integer msgTyp;
    @ApiModelProperty("签名")
    //@NotEmpty(message = "商户号不能为空")
    private String sign;
    @ApiModelProperty("消息单价")
    private BigDecimal unitPrice;
    @ApiModelProperty("合同签订日期")
    private Date signingTime;
    @ApiModelProperty("合同签订人")
    private String signerName;
    @ApiModelProperty("签订人邮箱")
    private String signerEmail;
    @ApiModelProperty("签订人手机号")
    private String signerPhone;
    @ApiModelProperty("合同名称")
    private String contractName;
    @ApiModelProperty("合同码")
    private String contractCode;
    @ApiModelProperty("合同生效时间")
    private Date contractComtime;
    @ApiModelProperty("合同时效时间")
    private Date contractDeadline;
    @ApiModelProperty("合同状态（0：生效，1：时效）")
    private Integer contractStatus;
    @ApiModelProperty("商户号")
    //@NotEmpty(message = "商户号不能为空")
//    @TenantNoQuery
    private String merchantNo;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @ApiModelProperty("合同编号")
    private String contracrNo;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
}
