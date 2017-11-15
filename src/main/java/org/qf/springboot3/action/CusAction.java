package org.qf.springboot3.action;

import org.qf.springboot3.pojo.CusSms;
import org.qf.springboot3.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class CusAction {

   //注入服务层
   @Autowired
   private CusService cusService;

   @RequestMapping("/reg")
   @ResponseBody
   public String reg(){
      CusSms pojo = new CusSms();
      pojo.setCname("广告团队");
      pojo.setToken(UUID.randomUUID().toString());
      cusService.registerCus(pojo);
      return "ok";
   }

   @RequestMapping("/find")
   @ResponseBody
   public CusSms find(Long id){
      return cusService.findById(id);
   }

}