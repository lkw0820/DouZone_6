package com.kosa.kapple.mapper;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.kosa.kapple.service.ServiceKW;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class MapperKWTest {

    @Autowired
    private MapperKW mapper;
    @Autowired
    private ServiceKW service;
    @Test
    void test1() {
        System.out.println(service.allContracts());
    }
}