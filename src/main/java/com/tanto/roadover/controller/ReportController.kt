package com.tanto.roadover.controller

import com.tanto.roadover.entity.*
import com.tanto.roadover.repository.*
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("api/v1/reporting")
class ReportController(
    private val reportRepository: ReportRepository,
    private val alongsideCrackRepository: AlongsideCrackRepository,
    private val bitumenRepository: BitumenRepository,
    private val crossCrackRepository: CrossCrackRepository,
    private val crossingCrackRepository: CrossingCrackRepository,
    private val crumbRepository: CrumbRepository,
    private val deformationRepository: DeformationRepository,
    private val dirtRepository: DirtRepository,
    private val freezeLayerRepository: FreezeRepository,
    private val liquidRepository: LiquidRepository,
    private val localUnevennessRepository: LocalUnevennessRepository,
    private val potholeRepository: PotholeRepository,
    private val roadWorkFailureRepository: RoadWorkFailureRepository,
    private val secondaryCrackRepository: SecondaryCrackRepository,
    private val straightCrackRepository: StraightCrackRepository,
    private val trackRepository: TrackRepository,
    private val wavesRepository: WavesRepository,
    private val wearRepository: WearRepository,
    private val webCrackRepository: WebCrackRepository
) {

    @PostMapping("/create")
    fun createReport(@RequestBody report: Report): Report {
        return reportRepository.save(report)
    }

    @PostMapping("/{reportId}/addAlongsideCrack")
    fun add(
        @RequestBody defect: AlongsideCrack,
        @PathVariable reportId: UUID
    ): AlongsideCrack {
        val report = reportRepository.findById(reportId).get()
        return alongsideCrackRepository
            .save(defect.also { defect.report = report })
    }


    @PostMapping("/{reportId}/addBitumen")
    fun add(
        @RequestBody defect: Bitumen,
        @PathVariable reportId: UUID
    ): Bitumen {
        val report = reportRepository.findById(reportId).get()
        return bitumenRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addCrossCrack")
    fun add(
        @RequestBody defect: CrossCrack,
        @PathVariable reportId: UUID
    ): CrossCrack {
        val report = reportRepository.findById(reportId).get()
        return crossCrackRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addCrossingCrack")
    fun add(
        @RequestBody defect: CrossingCrack,
        @PathVariable reportId: UUID
    ): CrossingCrack {
        val report = reportRepository.findById(reportId).get()
        return crossingCrackRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addCrumb")
    fun add(
        @RequestBody defect: Crumb,
        @PathVariable reportId: UUID
    ): Crumb {
        val report = reportRepository.findById(reportId).get()
        return crumbRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addDeformation")
    fun add(
        @RequestBody defect: Deformation,
        @PathVariable reportId: UUID
    ): Deformation {
        val report = reportRepository.findById(reportId).get()
        return deformationRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addDirt")
    fun add(
        @RequestBody defect: Dirt,
        @PathVariable reportId: UUID
    ): Dirt {
        val report = reportRepository.findById(reportId).get()
        return dirtRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addFreezeLayer")
    fun add(
        @RequestBody defect: FreezeLayer,
        @PathVariable reportId: UUID
    ): FreezeLayer {
        val report = reportRepository.findById(reportId).get()
        return freezeLayerRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addLiquid")
    fun add(
        @RequestBody defect: Liquid,
        @PathVariable reportId: UUID
    ): Liquid {
        val report = reportRepository.findById(reportId).get()
        return liquidRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addLocalUnevenness")
    fun add(
        @RequestBody defect: LocalUnevenness,
        @PathVariable reportId: UUID
    ): LocalUnevenness {
        val report = reportRepository.findById(reportId).get()
        return localUnevennessRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addPothole")
    fun add(
        @RequestBody defect: Pothole,
        @PathVariable reportId: UUID
    ): Pothole {
        val report = reportRepository.findById(reportId).get()
        return potholeRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addRoadWorkFailure")
    fun add(
        @RequestBody defect: RoadWorkFailure,
        @PathVariable reportId: UUID
    ): RoadWorkFailure {
        val report = reportRepository.findById(reportId).get()
        return roadWorkFailureRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addSecondaryCrack")
    fun add(
        @RequestBody defect: SecondaryCrack,
        @PathVariable reportId: UUID
    ): SecondaryCrack {
        val report = reportRepository.findById(reportId).get()
        return secondaryCrackRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addStraightCrack")
    fun add(
        @RequestBody defect: StraightCrack,
        @PathVariable reportId: UUID
    ): StraightCrack {
        val report = reportRepository.findById(reportId).get()
        return straightCrackRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addTrack")
    fun add(
        @RequestBody defect: Track,
        @PathVariable reportId: UUID
    ): Track {
        val report = reportRepository.findById(reportId).get()
        return trackRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addWaves")
    fun add(
        @RequestBody defect: Waves,
        @PathVariable reportId: UUID
    ): Waves {
        val report = reportRepository.findById(reportId).get()
        return wavesRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addWear")
    fun add(
        @RequestBody defect: Wear,
        @PathVariable reportId: UUID
    ): Wear {
        val report = reportRepository.findById(reportId).get()
        return wearRepository
            .save(defect.also { defect.report = report })
    }

    @PostMapping("/{reportId}/addWebCrack")
    fun add(
        @RequestBody defect: WebCrack,
        @PathVariable reportId: UUID
    ): WebCrack {
        val report = reportRepository.findById(reportId).get()
        return webCrackRepository
            .save(defect.also { defect.report = report })
    }

}
