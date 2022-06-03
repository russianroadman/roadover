package com.tanto.roadover.service

import com.tanto.roadover.entity.*
import com.tanto.roadover.enums.DirtType
import com.tanto.roadover.enums.QualityViolation
import org.springframework.stereotype.Service

@Service
class QualityServiceImpl: QualityService {

    override fun getQuality(defect: AlongsideCrack): QualityViolation {
        return if (defect.value == 0.0) {
            QualityViolation.LOW
        } else if (defect.value < 15.0) {
            QualityViolation.MID
        } else {
            QualityViolation.HIGH
        }
    }

    override fun getQuality(defect: Bitumen): QualityViolation {
        return if (defect.value < 5) {
            QualityViolation.LOW
        } else if (defect.value <= 20) {
            QualityViolation.MID
        } else {
            QualityViolation.HIGH
        }
    }

    override fun getQuality(defect: CrossCrack): QualityViolation {
        return if (
            defect.width < 6.0 && defect.length < 35.0
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 6.0 && defect.length > 35.0 ||
            defect.width in 6.0..19.0 && defect.length < 35.0 ||
            defect.width > 19.0 && defect.length <= 15.0
        ) {
            QualityViolation.MID
        } else if (
            defect.width in 6.0..19.0 && defect.length > 35.0 ||
            defect.width > 19.0 && defect.length > 15.0
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: CrossingCrack): QualityViolation {
        return if (
            defect.width < 6.0 && defect.length < 35.0
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 6.0 && defect.length > 35.0 ||
            defect.width in 6.0..19.0 && defect.length < 35.0 ||
            defect.width > 19.0 && defect.length <= 15.0
        ) {
            QualityViolation.MID
        } else if (
            defect.width in 6.0..19.0 && defect.length > 35.0 ||
            defect.width > 19.0 && defect.length > 15.0
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Crumb): QualityViolation {
        return if (
            defect.depth < 1 && defect.areaPercentage < 10
        ) {
            QualityViolation.LOW
        } else if (
            defect.depth < 1 && defect.areaPercentage < 30 ||
            defect.depth < 3 && defect.areaPercentage < 10
        ) {
            QualityViolation.MID
        } else if (
            defect.depth < 1 && defect.areaPercentage > 30 ||
            defect.depth < 3 && defect.areaPercentage > 10
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Deformation): QualityViolation {
        return if (
            defect.height < 1 && defect.length < 15
        ) {
            QualityViolation.LOW
        } else if (
            defect.height < 3 && defect.length < 30 ||
            defect.height < 1 && defect.length > 15 ||
            defect.height > 3 && defect.length < 15
        ) {
            QualityViolation.MID
        } else if (
            defect.height > 3 && defect.length > 15 ||
            defect.height > 1 && defect.length > 30
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Dirt): QualityViolation {
        return if (
            defect.dirtType == DirtType.HAS_DIRT
        ) {
            QualityViolation.LOW
        } else if (
            defect.dirtType == DirtType.MANEUVER_NEEDED
        ) {
            QualityViolation.MID
        } else if (
            defect.dirtType == DirtType.SLOWDOWN_NEEDED
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: FreezeLayer): QualityViolation {
        return if (
            defect.width < 1 ||
            defect.dense && defect.percentage < 5
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 5 ||
            defect.dense && defect.percentage < 15
        ) {
            QualityViolation.MID
        } else if (
            defect.width > 5 ||
            defect.dense && defect.percentage > 15
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Liquid): QualityViolation {
        return if (
            defect.width < 1 && defect.percentage < 20
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 1 && defect.percentage == 100.0 ||
            defect.width < 10 && defect.percentage < 20 ||
            defect.width > 10 && defect.percentage < 10
        ) {
            QualityViolation.MID
        } else if (
            defect.width < 10 && defect.percentage == 100.0 ||
            defect.width > 10 && defect.percentage > 10
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: LocalUnevenness): QualityViolation {
        return if (
            defect.difference < 5 && defect.area < 0.5
        ) {
            QualityViolation.LOW
        } else if (
            defect.difference < 5 && defect.area > 0.5 ||
            defect.depth > 5 && defect.area < 0.5
        ) {
            QualityViolation.MID
        } else if (
            defect.difference > 5 && defect.area > 0.5
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Pothole): QualityViolation {
        return if (
            defect.depth < 5 && defect.area < 0.5
        ) {
            QualityViolation.LOW
        } else if (
            defect.depth < 5 && defect.area > 0.5 ||
            defect.depth > 5 && defect.area < 0.5
        ) {
            QualityViolation.MID
        } else if (
            defect.depth > 5 && defect.area > 0.5
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: RoadWorkFailure): QualityViolation {
        return if (
            defect.height < 1 && defect.roadSiteLength < 15
        ) {
            QualityViolation.LOW
        } else if (
            defect.height < 3 && defect.roadSiteLength < 30 ||
            defect.height < 1 && defect.roadSiteLength > 15 ||
            defect.height > 3 && defect.roadSiteLength < 10
        ) {
            QualityViolation.MID
        } else if (
            defect.height > 3 && defect.roadSiteLength > 10 ||
            defect.height < 3 && defect.roadSiteLength > 30
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: SecondaryCrack): QualityViolation {
        return if (
            defect.width < 6 && defect.frequency > 10
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 6 && defect.frequency < 10 ||
            defect.width < 19 && defect.frequency > 10 ||
            defect.width > 19 && defect.frequency > 20
        ) {
            QualityViolation.MID
        } else if (
            defect.width > 19 && defect.frequency < 20 ||
            defect.width < 19 && defect.frequency < 10
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: StraightCrack): QualityViolation {
        return if (
            defect.width < 6.0 && defect.length < 35.0
        ) {
            QualityViolation.LOW
        } else if (
            defect.width < 6.0 && defect.length > 35.0 ||
            defect.width in 6.0..19.0 && defect.length < 35.0 ||
            defect.width > 19.0 && defect.length <= 15.0
        ) {
            QualityViolation.MID
        } else if (
            defect.width in 6.0..19.0 && defect.length > 35.0 ||
            defect.width > 19.0 && defect.length > 15.0
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Track): QualityViolation {
        return if (
            defect.depth < 1 && defect.length < 50
        ) {
            QualityViolation.LOW
        } else if (
            defect.depth < 3 && defect.length < 50 ||
            defect.depth < 1 && defect.length > 50 ||
            defect.depth > 3 && defect.length < 20
        ) {
            QualityViolation.MID
        } else if (
            defect.depth < 3 && defect.length > 50 ||
            defect.depth > 3 && defect.length < 20
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Waves): QualityViolation {
        return if (
            defect.difference < 1 && defect.roadSiteLength < 20
        ) {
            QualityViolation.LOW
        } else if (
            defect.difference < 3 && defect.roadSiteLength < 20 ||
            defect.difference < 1 && defect.roadSiteLength > 20 ||
            defect.difference > 3 && defect.roadSiteLength < 10
        ) {
            QualityViolation.MID
        } else if (
            defect.difference > 3 && defect.roadSiteLength > 10 ||
            defect.difference < 3 && defect.roadSiteLength > 20
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

    override fun getQuality(defect: Wear): QualityViolation {
        return if (
            defect.value <= 15
        ) {
            QualityViolation.LOW
        } else if (
            defect.value <= 30
        ) {
            QualityViolation.MID
        } else {
            QualityViolation.HIGH
        }
    }

    override fun getQuality(defect: WebCrack): QualityViolation {
        return if (
            defect.area < 0.5 && defect.crackWidth <= 6 && !defect.hasDirt
        ) {
            QualityViolation.LOW
        } else if (
            defect.area > 0.5 && defect.crackWidth <= 6 && !defect.hasDirt ||
            defect.area > 0.5
                && defect.area < 1
                && defect.crackWidth >= 6
                && defect.crackWidth <= 19
                && defect.hasDirt ||
            defect.area <= 0.5 && defect.crackWidth > 19
        ) {
            QualityViolation.MID
        } else if (
            defect.area > 1
                && defect.crackWidth >= 6
                && defect.crackWidth <= 19
                && defect.hasDirt ||
            defect.area > 0.5 && defect.crackWidth > 19 && defect.hasDirt
        ) {
            QualityViolation.HIGH
        } else {
            QualityViolation.EXTREME
        }
    }

}
