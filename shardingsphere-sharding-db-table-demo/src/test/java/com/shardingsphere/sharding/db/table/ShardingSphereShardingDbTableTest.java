package com.shardingsphere.sharding.db.table;

import com.shardingsphere.common.entity.User;
import com.shardingsphere.sharding.db.table.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShardingSphereShardingDbTableTest {
    
    @Autowired
    private UserMapper userMapper;
    
    /**  ds1 ::: insert into t_user0(name, sharding_key, id) values (?, ?, ?) ::: [SphereEx, 1, 673282875164438528] **/
    @Test
    public void insertTest() {
        User user = new User();
        user.setName("SphereEx");
        user.setShardingKey(1);
        userMapper.insert(user);
        System.out.println();
        System.out.println();
        System.out.println("insert id is : " + user.getId());
        System.out.println();
        System.out.println();
    }
    
    /** ds1 ::: select id, name, sharding_key from t_user0 where id = ? and sharding_key = ? ::: [673282875164438528, 1] **/
    @Test
    public void readTest() {
        User user = new User(673282875164438528L, 1);
        User newUser = userMapper.select(user);
        System.out.println();
        System.out.println();
        System.out.println("name is :" + newUser.getName() + " , " + "sharding_key is :" + newUser.getShardingKey());
        System.out.println();
        System.out.println();
    }
}
