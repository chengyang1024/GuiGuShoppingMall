package com.chengy.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 搴撳瓨宸ヤ綔鍗�
 * 
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:33:51
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
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
	 * sku_name
	 */
	private String skuName;
	/**
	 * 璐拱涓暟
	 */
	private Integer skuNum;
	/**
	 * 宸ヤ綔鍗昳d
	 */
	private Long taskId;
	/**
	 * 浠撳簱id
	 */
	private Long wareId;
	/**
	 * 1-宸查攣瀹�  2-宸茶В閿�  3-鎵ｅ噺
	 */
	private Integer lockStatus;

}
