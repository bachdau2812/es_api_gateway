package com.dauducbach.api_gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
@ActiveProfiles("test")
class ApiGatewayApplicationTests {

	@MockitoBean
    public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory;

	@MockitoBean
	public ReactiveRedisTemplate<String, String> reactiveRedisTemplate;

	@Test
	void contextLoads() {
	}

}
