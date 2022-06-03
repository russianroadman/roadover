package com.tanto.roadover.service

import com.tanto.roadover.entity.AlongsideCrack
import com.tanto.roadover.entity.Bitumen
import com.tanto.roadover.entity.CrossCrack
import com.tanto.roadover.entity.CrossingCrack
import com.tanto.roadover.entity.Crumb
import com.tanto.roadover.entity.Deformation
import com.tanto.roadover.entity.Dirt
import com.tanto.roadover.entity.FreezeLayer
import com.tanto.roadover.entity.Liquid
import com.tanto.roadover.entity.LocalUnevenness
import com.tanto.roadover.entity.Pothole
import com.tanto.roadover.entity.RoadWorkFailure
import com.tanto.roadover.entity.SecondaryCrack
import com.tanto.roadover.entity.Track
import com.tanto.roadover.entity.Waves
import com.tanto.roadover.entity.Wear
import com.tanto.roadover.entity.WebCrack
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

    fun getQuality(defect: Track): QualityViolation

    fun getQuality(defect: Waves): QualityViolation

    fun getQuality(defect: Wear): QualityViolation

    fun getQuality(defect: WebCrack): QualityViolation

}
