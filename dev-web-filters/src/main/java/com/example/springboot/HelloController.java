package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import de.mhus.lib.core.M;
import de.mhus.lib.core.service.TimerIfc;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

    @RequestMapping("/test1")
    public String test1() {
        
        TimerIfc timer = M.l(TimerIfc.class);

        return "Timer " + timer;
    }
    
}
