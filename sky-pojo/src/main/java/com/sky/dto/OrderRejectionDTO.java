package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "订单拒绝数据传输对象")
public class OrderRejectionDTO implements Serializable {

	@ApiModelProperty(value = "订单ID", example = "12345")
	private Long id;

	@ApiModelProperty(value = "订单拒绝原因", example = "库存不足")
	private String rejectionReason;

}