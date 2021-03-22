package com.ivoronline.springboot_aop_log_startend.controllers;

import com.ivoronline.springboot_aop_log_startend.log.LogStartEnd;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @LogStartEnd
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
