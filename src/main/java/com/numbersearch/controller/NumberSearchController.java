package com.numbersearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.numbersearch.entity.InputStr;
import com.numbersearch.feign.NumberSearchFeignClient;


@RestController
public class NumberSearchController {

  @Autowired
  private NumberSearchFeignClient numberFeignClient;

  @GetMapping("/numbersearch/{str}")
  public InputStr numberSearch(@PathVariable("str") String str) {
    return this.numberFeignClient.numberSearch(str);
  }
}
