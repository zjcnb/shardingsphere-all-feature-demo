package com.shardingsphere.readwrite;

import com.shardingsphere.readwrite.entity.User;
import com.shardingsphere.readwrite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ShardingSphereReadWriteApplicationTests {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void ShardingSphereReadWriteTest() {
        User user = userMapper.select();
        System.out.println();
        System.out.println();
        System.out.println("name is :" + user.getName() + " , " + "sharding_key is :" + user.getShardingKey());
        System.out.println();
        System.out.println();
    }
}
