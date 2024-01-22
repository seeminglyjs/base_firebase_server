package com.project.base_firebase_server.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_connection_test")
public class TestEntity {

    @Id
    @Column(name = "con_num", nullable = false)
    private int conNum;
    @Column(name = "con_name")
    private String conName;
}
