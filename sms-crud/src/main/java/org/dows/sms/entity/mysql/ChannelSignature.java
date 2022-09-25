package org.dows.sms.entity.mysql;

import com.baomidou.mybatisplus.annotation.FieldFill;
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
 * 通道签名(ChannelSignature)表实体类
 *
 * @author VX:PN15855012581
 * @since 2021-11-11 12:02:35
 */
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ChannelSignature对象", description = "通道签名")
public class ChannelSignature implements CrudEntity {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("是否有效 0：无效 1有效")
    @TableField(fill = FieldFill.INSERT)
    private Boolean disable;
    @ApiModelProperty("签名编号")

    private String singnatureNo;

    //@NotEmpty(message = "通道ID不能为空", groups = {InsertValid.class, UpdateValid.class})
    @ApiModelProperty("通道ID")
    private String channelNo;
    @ApiModelProperty("通道名称")
    private String channelName;
    @ApiModelProperty("通道码")
    private String channelCode;

    //@NotNull(message = "必须是数字(1:industry,2:market,3:voice)")
    @ApiModelProperty("消息类型（1:营销，2:行业，3:语音）")
//    @Min(value = 1, message = "消息类型为1,2,3", groups = {InsertValid.class, UpdateValid.class})
//    @Max(value = 3, message = "消息类型为1,2,3", groups = {InsertValid.class, UpdateValid.class})
    private Integer msgTyp;
    @ApiModelProperty("签名")
    //@NotEmpty(message = "签名不能为空", groups = {InsertValid.class, UpdateValid.class})
    private String signature;
    @ApiModelProperty("签名码")
    //@NotEmpty(message = "签名码不能为空", groups = {InsertValid.class, UpdateValid.class})
    private String signatureCode;
    @ApiModelProperty("消息价格")
    private BigDecimal price;
    @ApiModelProperty("通道账号")
    //@NotEmpty(message = "通道账号不能为空", groups = {InsertValid.class, UpdateValid.class})
    private String signAccount;

    @ApiModelProperty("通道密码")
    //@NotEmpty(message = "通道密码不能为空", groups = {InsertValid.class, UpdateValid.class})
    private String signPwd;
    @ApiModelProperty("审核状态(0:停用/未通過,1:啓用/通過)")
    private Integer checked;
    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date dt;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateDt;
    @ApiModelProperty("签名类型。0系统签名1用户自定义")
//    @Min(value = 0, message = "签名类型取值为0,1", groups = {InsertValid.class, UpdateValid.class})
//    @Max(value = 1, message = "签名类型取值为0,1", groups = {InsertValid.class, UpdateValid.class})
    private Integer signTyp;
}
