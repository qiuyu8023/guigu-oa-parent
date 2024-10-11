package com.atguigu.code;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testRedisConnection() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        String key = "test:key";
        String value = "Hello Redis";

        // Set a value in Redis
        ops.set(key, value);

        // Get the value from Redis
        String retrievedValue = ops.get(key);

        // Assert that the value was set and retrieved correctly
        assertNotNull(retrievedValue);
        assertEquals(value, retrievedValue);
    }
}
