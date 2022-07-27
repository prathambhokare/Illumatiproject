package com.psl.lmsserver.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component
public class GenericFilter extends OncePerRequestFilter {
	
	    @Override
	    protected void doFilterInternal(HttpServletRequest httpRequest, HttpServletResponse httpResponse, FilterChain filterChain) throws ServletException, IOException {
	     	httpResponse.setHeader("X-FRAME-OPTIONS", "sameorigin");
	    	httpResponse.setHeader("Content-Security-Policy", "frame-ancestors 'self'");
	        filterChain.doFilter(httpRequest, httpResponse);
	    }
}