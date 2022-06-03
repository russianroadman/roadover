package com.tanto.roadover;

import com.tanto.roadover.service.QualityServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class QualityTests {

    @Autowired
    QualityServiceImpl qualityService;

    @Test
    void getQuality() {

    }
}


