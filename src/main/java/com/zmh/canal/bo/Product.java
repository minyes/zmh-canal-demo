package com.zmh.canal.bo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;

/**
 * @Description: Product
 * @author: zhou ming hao
 * @date: 2024年08月15日 18:12
 */
@Data
@Document(indexName = "product",shards = 3,replicas = 1)//自动创建索引
@TableName("product")//CanalTable不存在，才这个
public class Product {

    /**
     * 全局唯一id
     */
    @Id
    private Long id;

    /**
     * 产品名称
     */
    @Field(type = FieldType.Text)
    private String productName;

    /**
     * 产品描述
     */
    @Field(type = FieldType.Text)
    private String productDesc;

    /**
     * 商品分类
     */
    @Field(type = FieldType.Keyword)
    private String category;

    /**
     * 商品价格
     */
    @Field(type = FieldType.Double)
    private BigDecimal price;

    /**
     * 图片地址
     */
    @Field(type = FieldType.Keyword, index = false)
    private String image;
}
