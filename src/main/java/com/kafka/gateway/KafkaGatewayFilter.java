package com.kafka.gateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class KafkaGatewayFilter  {
	
	/*
	 * private final Logger logger =
	 * LoggerFactory.getLogger(KafkaGatewayFilter.class);
	 * 
	 * @Override public boolean shouldFilter() { // TODO Auto-generated method stub
	 * return true; }
	 * 
	 * @Override public Object run() throws ZuulException { RequestContext ctx =
	 * RequestContext.getCurrentContext(); HttpServletRequest request =
	 * ctx.getRequest(); logger.info("[{}] request to [{}]", request.getMethod(),
	 * request.getRequestURL()); return null; }
	 * 
	 * @Override public String filterType() { return "pre"; }
	 * 
	 * @Override public int filterOrder() { return 1; }
	 */
}
