CREATE TABLE IF NOT EXISTS tb_message (
  id int(11) unsigned  NOT NULL AUTO_INCREMENT COMMENT '自增长 ID',
  content varchar(500) COMMENT '消息内容',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='消息信息表';


