package com.controller;

import com.service.TabBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class TabBookController {
    @Autowired
    private TabBookService tabBookService;
    @RequestMapping
    public List<Map> selectBookAll(){
        tabBookService.selectBookAll();
        return null;
    }



}
