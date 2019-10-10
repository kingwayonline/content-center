package com.lgak.config;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

public class FallBackTest {
    public static ClientHttpResponse testFallBack(HttpRequest request, byte[] body, ClientHttpRequestExecution execution, BlockException exception) {
        SentinelClientHttpResponse ClientHttpResponse = new SentinelClientHttpResponse();
        return ClientHttpResponse;

    }

}
