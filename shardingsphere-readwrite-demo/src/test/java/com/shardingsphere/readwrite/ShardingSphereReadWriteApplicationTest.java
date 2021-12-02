package com.shardingsphere.readwrite;

import com.shardingsphere.readwrite.entity.User;
import com.shardingsphere.readwrite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ShardingSphereReadWriteApplicationTest {
    
    @Autowired
    private UserMapper userMapper;
    
    /** Actual SQL: slave2 ::: select id, name, sharding_key from t_user order by id desc limit 1 **/
    @Test
    public void readTest() {
        User user = userMapper.select();
        System.out.println();
        System.out.println();
        System.out.println("name is :" + user.getName() + " , " + "sharding_key is :" + user.getShardingKey());
        System.out.println();
        System.out.println();
    }
    
    /** Actual SQL: master ::: insert into t_user(name, sharding_key) values (?, ?) ::: [master-1, 2] **/
    @Test
    public void writeTest() {
        User user = new User();
        user.setName("master-1");
        user.setShardingKey(2);
        userMapper.insert(user);
        System.out.println();
        System.out.println();
        System.out.println("insert id is : " + user.getId());
        System.out.println();
        System.out.println();
    }
}
