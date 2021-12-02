package com.shardingsphere.sharding.db.table.entity;

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
    
    public User() {}
    
    public User(Long id, String name, Integer shardingKey) {
        this.id = id;
        this.name = name;
        this.shardingKey = shardingKey;
    }
    
    public User(String name, Integer shardingKey) {
        this.name = name;
        this.shardingKey = shardingKey;
    }
    
    public User(Long id, Integer shardingKey) {
        this.id = id;
        this.shardingKey = shardingKey;
    }
}
