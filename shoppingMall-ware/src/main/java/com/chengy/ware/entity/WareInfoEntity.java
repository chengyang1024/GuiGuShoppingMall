package com.chengy.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 浠撳簱淇℃伅
 * 
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:33:51
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 浠撳簱鍚�
	 */
	private String name;
	/**
	 * 浠撳簱鍦板潃
	 */
	private String address;
	/**
	 * 鍖哄煙缂栫爜
	 */
	private String areacode;

}
