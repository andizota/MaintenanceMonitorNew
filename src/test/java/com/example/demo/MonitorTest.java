package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class MonitorTest {

    MonitorService monitorService;

    @BeforeEach
    public void before(){
        monitorService = new MonitorService("-");
    }

    @Test
    public void GetMessage()
    {

    }

    





}
