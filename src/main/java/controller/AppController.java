package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class AppController {
    public static void main(String[] org) {
        SpringApplication.run(AppController.class, org);
    }

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return "hellow world!!!";
    }
}
