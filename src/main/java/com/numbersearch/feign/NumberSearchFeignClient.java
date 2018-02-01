package com.numbersearch.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.numbersearch.entity.InputStr;


@FeignClient(name = "springcloud-provider-numberSearch", fallback = HystrixClientFallback.class)
public interface NumberSearchFeignClient {
  @RequestMapping(value = "/numbersearch/{str}", method = RequestMethod.GET)
  public InputStr numberSearch(@PathVariable("str") String str);
}
