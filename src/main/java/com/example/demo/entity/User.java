package com.example.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@RedisHash(value = "User")
//@RedisHash(value = "User", timeToLive = 30L)
public class User implements Serializable {

    @Id
    private String id;

    private String name;

    @TimeToLive(unit = TimeUnit.MINUTES)
    private Long timeout;
}