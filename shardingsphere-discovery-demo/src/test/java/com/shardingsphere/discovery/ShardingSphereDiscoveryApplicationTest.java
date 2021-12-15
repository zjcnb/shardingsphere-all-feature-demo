package com.shardingsphere.discovery;

import com.shardingsphere.discovery.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ShardingSphereDiscoveryApplicationTest {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void test() {
        userMapper.select();
    }

}
