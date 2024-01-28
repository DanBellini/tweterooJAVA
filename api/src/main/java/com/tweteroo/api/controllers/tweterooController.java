package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class tweterooController {

    @PostMapping("/users")
    public String userRegister(@RequestBody String body) {

        return body;
    }

    @PostMapping("/tweets")
    public String postTweets(@RequestBody String body) {

        return body;
    }

    @GetMapping("/tweets")
    public String getTweets() {

        return "todos os tweets";
    }

    @GetMapping("/tweets/user/{userId}")
    public String filterTweetsUser(@PathVariable("userId") Long userId) {

        return "tweets do usuario userId";
    }

}
