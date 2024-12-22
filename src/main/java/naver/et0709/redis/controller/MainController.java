package naver.et0709.redis.controller;

import lombok.RequiredArgsConstructor;
import naver.et0709.redis.service.RedisService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/redis")
public class MainController {
    private final RedisService redisService;

    @PostMapping("")
    public void startRedis(@RequestBody HashMap<String, String> body) {
        redisService.setValues(body.get("name"), body.get("age"));
    }

    @GetMapping("")
    public String startRedis(@RequestParam String name) {
        return redisService.getValues(name);
    }
}
