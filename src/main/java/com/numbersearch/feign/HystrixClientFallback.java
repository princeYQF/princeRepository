package com.numbersearch.feign;

import org.springframework.stereotype.Component;

import com.numbersearch.entity.InputStr;


@Component
public class HystrixClientFallback implements NumberSearchFeignClient {


@Override
public InputStr numberSearch(String str) {
	InputStr inputStr = new InputStr();
	inputStr.setStr(str);
	inputStr.setRequestState("请求失败：服务器异常");
    return inputStr;
}
}