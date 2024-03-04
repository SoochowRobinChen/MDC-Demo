package com.robinchen.MDCDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class FilterConfig implements Filter {
    private final String CORRELATION_ID = "X-Correlation-Id";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        MDC.put(CORRELATION_ID, httpRequest.getHeader(CORRELATION_ID));
        log.info("Intercept coming request and set MDC context information");
        // pass the request
        chain.doFilter(request, response);
    }
}
