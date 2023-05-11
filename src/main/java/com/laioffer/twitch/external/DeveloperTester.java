package com.laioffer.twitch.external;

import com.laioffer.twitch.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DeveloperTester implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(DeveloperTester.class);
    private final UserService userService;

    public DeveloperTester(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void run(ApplicationArguments args){
        userService.register("default", "123456", "John", "Smith");
    }
}


























