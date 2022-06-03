package com.tanto.roadover.service

import com.tanto.roadover.entity.*
import com.tanto.roadover.enums.QualityViolation
import org.springframework.stereotype.Service

@Service
class QualityServiceImpl(

) : QualityService {

    override fun getQuality(defect: AlongsideCrack): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Bitumen): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: CrossCrack): QualityViolation {
        return if (defect.width < 6.0 && defect.length < 35.0) {
            QualityViolation.LOW
        } else if (
            (defect.width < 6.0 && defect.length > 35.0) ||
            (
                    (defect.width >= 6.0 || defect.width <= 19.0) &&
                            defect.length < 35.0
                    ) ||
            (defect.width > 19.0 && defect.length < 15.0)
        ) {
            QualityViolation.MID
        } else if (
            (
                (defect.width >= 6.0 || defect.width > 35.0) &&
                defect.length > 35.0
            ) ||
            (defect.width > 19.0 && defect.length > 15.0)
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.NONE
        }
    }

    override fun getQuality(defect: CrossingCrack): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Crumb): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Deformation): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Dirt): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Freeze): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Liquid): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: LocalUnevenness): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Pothole): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: RoadWorkFailure): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: SecondaryCrack): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Track): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Waves): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: Wear): QualityViolation {
        TODO("Not yet implemented")
    }

    override fun getQuality(defect: WebCrack): QualityViolation {
        TODO("Not yet implemented")
    }

}
