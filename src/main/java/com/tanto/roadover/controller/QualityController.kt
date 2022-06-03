package com.tanto.roadover.controller

import com.tanto.roadover.entity.*
import com.tanto.roadover.enums.QualityViolation
import com.tanto.roadover.service.QualityService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/quality")
class QualityController(
    private val qualityService: QualityService
) {

    @PostMapping("/AlongsideCrack")
    fun alongsideCrack(@RequestBody body: AlongsideCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Bitumen")
    fun bitumen(@RequestBody body: Bitumen): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/CrossCrack")
    fun crossCrack(@RequestBody body: CrossCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/CrossingCrack")
    fun crossingCrack(@RequestBody body: CrossingCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Crumb")
    fun crumb(@RequestBody body: Crumb): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Deformation")
    fun deformation(@RequestBody body: Deformation): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Dirt")
    fun dirt(@RequestBody body: Dirt): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/FreezeLayer")
    fun freezeLayer(@RequestBody body: FreezeLayer): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Liquid")
    fun liquid(@RequestBody body: Liquid): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/LocalUnevenness")
    fun localUnevenness(@RequestBody body: LocalUnevenness): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Pothole")
    fun pothole(@RequestBody body: Pothole): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/RoadWorkFailure")
    fun roadWorkFailure(@RequestBody body: RoadWorkFailure): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/SecondaryCrack")
    fun secondaryCrack(@RequestBody body: SecondaryCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/StraightCrack")
    fun straightCrack(@RequestBody body: StraightCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Track")
    fun track(@RequestBody body: Track): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Waves")
    fun waves(@RequestBody body: Waves): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/Wear")
    fun wear(@RequestBody body: Wear): QualityViolation {
        return qualityService.getQuality(body)
    }

    @PostMapping("/WebCrack")
    fun webCrack(@RequestBody body: WebCrack): QualityViolation {
        return qualityService.getQuality(body)
    }

}
