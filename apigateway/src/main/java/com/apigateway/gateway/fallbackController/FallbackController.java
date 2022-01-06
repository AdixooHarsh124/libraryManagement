package com.apigateway.gateway.fallbackController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/bookServiceFallback")
	public String bookServiceFallback() {
		return "Book Service is down";
	}
	
	@GetMapping("/subscriberServiceFallback")
	public String subscriberServiceFallback() {
		return "Book Service is down";
	}
}
