# shardingsphere-all-feature-demo
内置 ShardingSphere 5.x 所有功能且都是独立的 demo, API 配置均为最新, 本项目宗旨是让大家简单快捷的使用 ShardingSphere.


- shardingsphere-readwrite-demo         | ShardingSphere 的读写分离功能. 从库算法: 轮询和随机

- shardingsphere-sharding-db-table-demo | ShardingSphere 的分库分表功能. 根据 sharding_key 字段进行分库, 根据 id 字段进行分表, id 采用的是 ShardingSphere 提供的雪花算法生成. 
