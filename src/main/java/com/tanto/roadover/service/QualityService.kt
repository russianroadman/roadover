package com.tanto.roadover.service

import com.tanto.roadover.entity.*
import com.tanto.roadover.enums.QualityViolation

interface QualityService {

    fun getQuality(defect: AlongsideCrack): QualityViolation

    fun getQuality(defect: Bitumen): QualityViolation

    fun getQuality(defect: CrossCrack): QualityViolation

    fun getQuality(defect: CrossingCrack): QualityViolation

    fun getQuality(defect: Crumb): QualityViolation

    fun getQuality(defect: Deformation): QualityViolation

    fun getQuality(defect: Dirt): QualityViolation

    fun getQuality(defect: FreezeLayer): QualityViolation

    fun getQuality(defect: Liquid): QualityViolation

    fun getQuality(defect: LocalUnevenness): QualityViolation

    fun getQuality(defect: Pothole): QualityViolation

    fun getQuality(defect: RoadWorkFailure): QualityViolation

    fun getQuality(defect: SecondaryCrack): QualityViolation

    fun getQuality(defect: StraightCrack): QualityViolation

    fun getQuality(defect: Track): QualityViolation

    fun getQuality(defect: Waves): QualityViolation

    fun getQuality(defect: Wear): QualityViolation

    fun getQuality(defect: WebCrack): QualityViolation

}
