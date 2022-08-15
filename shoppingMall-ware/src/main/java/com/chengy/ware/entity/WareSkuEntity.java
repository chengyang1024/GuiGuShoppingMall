package com.chengy.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 鍟嗗搧搴撳瓨
 * 
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:33:51
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 浠撳簱id
	 */
	private Long wareId;
	/**
	 * 搴撳瓨鏁�
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 閿佸畾搴撳瓨
	 */
	private Integer stockLocked;

}
