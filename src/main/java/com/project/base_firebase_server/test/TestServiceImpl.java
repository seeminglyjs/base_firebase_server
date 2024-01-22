package com.project.base_firebase_server.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestRepository testRepository;

    @Override
    public TestEntity getTestEntity() {
        return testRepository.findTopByOrderByConNum();
    }
}
