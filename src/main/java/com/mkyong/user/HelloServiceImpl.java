package com.mkyong.user;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	public String getHelloWorldMsg() {
		return "Hi, Alex, its me, ur Spring))";
	}

}