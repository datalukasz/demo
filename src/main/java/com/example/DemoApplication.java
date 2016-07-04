package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class DemoApplication {

    int a = 5;

    @RequestMapping("/{someID}")
    public
    @ResponseBody
    int getAttr(@PathVariable(value = "someID") int id) {
        return id * id;
    }


    @RequestMapping("/")
    @ResponseBody
    firstClass home() {
        firstClass a = new firstClass();
        return new firstClass();
    }

    @RequestMapping("/gretting")
    public
    @ResponseBody
    Gretting getAtt() {
        long id = 0;
        String name = "Default";
        Gretting g = new Gretting();
        g.setId(id);
        g.setContent(name);
        return g;
    }

    @RequestMapping("/gretting/{id},{name}")
    public
    @ResponseBody
    Gretting getAttr(@PathVariable(value = "id") long id, @PathVariable(value = "name") String name) {
        Gretting g = new Gretting();
        g.setId(id);
        g.setContent(name);
        return g;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
    }
}
