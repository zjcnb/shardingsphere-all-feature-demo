package com.shardingsphere.sharding.db.table;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shardingsphere.sharding.db.table")
@ComponentScan("com.shardingsphere")
public class ShardingSphereShardingDbTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingSphereShardingDbTableApplication.class, args);
	}
}
