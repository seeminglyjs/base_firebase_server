package com.project.base_firebase_server.test;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataLoader implements CommandLineRunner {

    /**
     * 최초 H2에 데이터 삽입 해당 부분은 주석처리 추후 주석 및 제거처리 필요
     * 
     */
    private final TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {
        // 기본 데이터를 추가할 코드 작성
        TestEntity defaultEntity = TestEntity.builder()
                .conNum(1)
                .conName("Default Connection")
                .build();

        testRepository.save(defaultEntity);
    }
}