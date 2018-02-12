package com.wzg.springBoot.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCtrl {
	@RequestMapping("hi")
	String index() {
		return "hi";
	}
}
