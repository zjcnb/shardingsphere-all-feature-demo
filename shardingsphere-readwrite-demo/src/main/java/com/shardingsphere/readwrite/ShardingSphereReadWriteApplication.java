package com.shardingsphere.readwrite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shardingsphere.readwrite")
@ComponentScan("com.shardingsphere")
public class ShardingSphereReadWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingSphereReadWriteApplication.class, args);
	}
}
