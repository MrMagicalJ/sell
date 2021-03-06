package com.lwj.sell.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品表实体
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    /** 商品名称 */
    private String productName;
    /** 商品单价 */
    private BigDecimal productPrice;
    /** 商品库存 */
    private int productStock;
    /** 商品描述 */
    private String productDescription;
    /** 商品小图 */
    private String productIcon;
    /** 商品状态,0正常1下架 */
    private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;

}
