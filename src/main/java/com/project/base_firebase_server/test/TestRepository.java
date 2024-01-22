package com.project.base_firebase_server.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {
    TestEntity findTopByOrderByConNum();
}
