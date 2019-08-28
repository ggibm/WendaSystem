package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nowcoder on 2016/7/15.
 */
@Controller
public class TestController {


    @RequestMapping(path = {"/test"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String index(Model model) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        model.addAttribute("model", list);
        return "test";
    }

    public void test(){
        String string = "string";
    }

}
