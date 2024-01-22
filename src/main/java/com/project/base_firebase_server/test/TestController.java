package com.project.base_firebase_server.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;
    @GetMapping("/test/db/con")
    public String getTestDbCon(Model model){
        TestEntity testEntity = testService.getTestEntity();
        // 모델에 데이터 추가
        model.addAttribute("testEntity", testEntity);
        return "/test/test";
    }

}
