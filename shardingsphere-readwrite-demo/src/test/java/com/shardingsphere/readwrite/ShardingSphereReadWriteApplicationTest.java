package com.shardingsphere.readwrite;

import com.shardingsphere.common.entity.User;
import com.shardingsphere.readwrite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ShardingSphereReadWriteApplicationTest {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void readTest() {
        User selectUser = new User();
        selectUser.setShardingKey(1);
        User user = userMapper.select(selectUser);
        System.out.println();
        System.out.println();
        System.out.println("name is :" + user.getName() + " , " + "sharding_key is :" + user.getShardingKey());
        System.out.println();
        System.out.println();
    }
    
    @Test
    public void writeTest() {
        User user = new User();
        user.setName("master-a");
        user.setShardingKey(2);
        userMapper.insert(user);
    }
}
