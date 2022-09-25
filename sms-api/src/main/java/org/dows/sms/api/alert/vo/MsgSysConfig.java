package org.dows.sms.api.alert.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Title: MsgSysConfig
 * @Description: 系统各项配置
 * @date 2022/2/1111:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("系统运行参数配置")
public class MsgSysConfig implements Serializable {
    // 通道负载均衡（权重:weight，随机:random，轮询:poll）
    @ApiModelProperty(" 通道负载均衡（权重:weight，随机:random，轮询:poll）")
    private String channelBlance;
    // 分片策略(按照redis成功率排分动态分片,根据通道数量平均分片)
    @ApiModelProperty("分片策略(按照redis成功率排分动态分片,根据通道数量平均分片)")
    private String sliceStrategy;
}
