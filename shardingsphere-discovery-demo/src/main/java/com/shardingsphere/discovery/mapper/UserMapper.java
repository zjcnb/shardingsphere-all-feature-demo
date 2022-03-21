package com.shardingsphere.discovery.mapper;

import com.shardingsphere.common.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	User select();
}
