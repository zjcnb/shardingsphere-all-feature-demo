package com.shardingsphere.readwrite.mapper;

import com.shardingsphere.readwrite.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	User select(User user);
}
