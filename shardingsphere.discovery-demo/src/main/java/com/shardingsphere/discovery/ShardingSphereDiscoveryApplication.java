package com.shardingsphere.discovery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shardingsphere.discovery")
@ComponentScan("com.shardingsphere")
public class ShardingSphereDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingSphereDiscoveryApplication.class, args);
	}
}
