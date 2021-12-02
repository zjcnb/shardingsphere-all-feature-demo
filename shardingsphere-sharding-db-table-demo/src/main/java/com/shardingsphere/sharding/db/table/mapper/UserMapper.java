package com.shardingsphere.sharding.db.table.mapper;

import com.shardingsphere.sharding.db.table.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	User select(User user);
	long insert(User user);
}
