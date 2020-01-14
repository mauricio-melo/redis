package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@RedisHash(value = "User")
@RedisHash(value = "User", timeToLive = 30L)
public class User implements Serializable {

    @Id
    private String id;

    private String name;

//    @TimeToLive(unit = TimeUnit.SECONDS)
//    private Long timeout;
}