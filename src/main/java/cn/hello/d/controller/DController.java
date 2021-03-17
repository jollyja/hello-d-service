package cn.hello.d.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DController {

    @PostMapping(path = "/d/done")
    public Map<String, String> done(@RequestBody Map<String, String> req) {
        Map<String, String> res = new HashMap<>();
        res.put("abc", "def");
        return res;
    }



}
