package com.shardingsphere.readwrite.entity;


public class User {
    private Long id;
    
    private String name;
    
    private Integer shardingKey;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getShardingKey() {
        return shardingKey;
    }
    
    public void setShardingKey(Integer shardingKey) {
        this.shardingKey = shardingKey;
    }
}
