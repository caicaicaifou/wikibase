--liquibase formatted sql
--changeset Aki:1.1

DROP TABLE
IF
    EXISTS `ebook`;
CREATE TABLE `ebook` (
    `id` BIGINT NOT NULL COMMENT 'id',
    `name` VARCHAR ( 50 ) COMMENT '名称',
    `category1_id` BIGINT COMMENT '分类1',
    `category2_id` BIGINT COMMENT '分类2',
    `description` VARCHAR ( 200 ) COMMENT '描述',
    `cover` VARCHAR ( 200 ) COMMENT '封面',
    `doc_count` INT COMMENT '文档数',
    `view_count` INT COMMENT '阅读数',
    `vote_count` INT COMMENT '点赞数',
PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT '电子书';