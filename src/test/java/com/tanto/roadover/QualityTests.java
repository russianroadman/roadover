package com.tanto.roadover;

import com.tanto.roadover.entity.AlongsideCrack;
import com.tanto.roadover.entity.Bitumen;
import com.tanto.roadover.entity.CrossCrack;
import com.tanto.roadover.enums.QualityViolation;
import com.tanto.roadover.service.QualityServiceImpl;
import org.junit.jupiter.api.Assertions;
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
    void alongsideCrackQuality_LOW() {
        AlongsideCrack defect = new AlongsideCrack();
        defect.setValue(0.0);
        Assertions.assertEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void alongsideCrackQuality_MID() {
        AlongsideCrack defect = new AlongsideCrack();
        defect.setValue(10.0);
        Assertions.assertEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void alongsideCrackQuality_HIGH() {
        AlongsideCrack defect = new AlongsideCrack();
        defect.setValue(90.0);
        Assertions.assertEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
    }

    /**
     * Bitumen
     * */
    @Test
    void bitumenQuality_LOW() {
        Bitumen defect = new Bitumen();
        defect.setValue(3.0);
        Assertions.assertEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void bitumenQuality_MID() {
        Bitumen defect = new Bitumen();
        defect.setValue(15.0);
        Assertions.assertEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void bitumenQuality_HIGH() {
        Bitumen defect = new Bitumen();
        defect.setValue(50.0);
        Assertions.assertEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
    }

    /**
     * CrossCrack
     * */
    @Test
    void crossCrackQuality_LOW() {
        CrossCrack defect = new CrossCrack();
        defect.setLength(0.0);
        defect.setWidth(0.0);
        Assertions.assertEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void crossCrackQuality_MID() {
        CrossCrack defect = new CrossCrack();
        defect.setLength(0.0);
        defect.setWidth(0.0);
        Assertions.assertEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
    }

    @Test
    void crossCrackQuality_HIGH() {
        CrossCrack defect = new CrossCrack();
        defect.setLength(0.0);
        defect.setWidth(0.0);
        Assertions.assertEquals(
                QualityViolation.HIGH, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.LOW, qualityService.getQuality(defect)
        );
        Assertions.assertNotEquals(
                QualityViolation.MID, qualityService.getQuality(defect)
        );
    }
}


