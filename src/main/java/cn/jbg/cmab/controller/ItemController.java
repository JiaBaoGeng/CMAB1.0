package cn.jbg.cmab.controller;

import cn.jbg.cmab.bean.Item;
import cn.jbg.cmab.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by jbg on 2018/3/16.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/ItemController")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/queryItems",method = RequestMethod.GET)
    public List<Item> queryItems(@RequestBody Map params){
        return itemService.queryItems(params);
    }

}