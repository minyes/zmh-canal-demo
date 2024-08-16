DROP TABLE IF EXISTS product;
CREATE TABLE product  (
                          id  INT AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
                          product_id      INT            NOT NULL COMMENT '产品ID',
                          product_name         VARCHAR(200)   NOT NULL COMMENT '产品名称',
                          product_desc         VARCHAR(500)   NOT NULL COMMENT '产品描述',
                          category         VARCHAR(30)   NOT NULL COMMENT '产品分类',
                          price        DECIMAL(10, 2) NOT NULL COMMENT '产品价格',
                          image  VARCHAR(500)   NOT NULL COMMENT '图片地址'
) COMMENT ='产品表';