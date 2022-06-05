package com.tanto.roadover.controller

import com.tanto.roadover.entity.Defect
import com.tanto.roadover.entity.Report
import com.tanto.roadover.repository.*
import com.tanto.roadover.service.DefectFindService
import com.tanto.roadover.service.QualityService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("api/v1/observer")
class ObserverController(
    private val reportRepository: ReportRepository,
    private val defectFindService: DefectFindService,
    private val qualityService: QualityService
) {

    @GetMapping("/{id}")
    fun findReport(@PathVariable id: UUID): Report {
        return reportRepository.findById(id).get()
    }

    @GetMapping("/detailing/{id}")
    fun findReportDetailing(@PathVariable id: UUID): Map<String, Defect?> {
        return mapOf(
            "alongsideCrack" to defectFindService.findAlongsideCrackByReportId(id, null),
            "bitumen" to defectFindService.findBitumenByReportId(id, null),
            "crossCrack" to defectFindService.findCrossCrackByReportId(id, null),
            "crossingCrack" to defectFindService.findCrossingCrackByReportId(id, null),
            "crumb" to defectFindService.findCrumbByReportId(id, null),
            "deformation" to defectFindService.findDeformationByReportId(id, null),
            "dirt" to defectFindService.findDirtByReportId(id, null),
            "freezeLayer" to defectFindService.findFreezeLayerByReportId(id, null),
            "liquid" to defectFindService.findLiquidByReportId(id, null),
            "localUnevenness" to defectFindService.findLocalUnevennessByReportId(id, null),
            "pothole" to defectFindService.findPotholeByReportId(id, null),
            "roadWorkFailure" to defectFindService.findRoadWorkFailureByReportId(id, null),
            "secondaryCrack" to defectFindService.findSecondaryCrackByReportId(id, null),
            "straightCrack" to defectFindService.findStraightCrackByReportId(id, null),
            "track" to defectFindService.findTrackByReportId(id, null),
            "waves" to defectFindService.findWavesByReportId(id, null),
            "wear" to defectFindService.findWearByReportId(id, null),
            "webCrack" to defectFindService.findWebCrackByReportId(id, null)
        ).filterValues { it != null }
    }

    @GetMapping("/detailing-full/{id}")
    fun findReportDetailingWithQualityViolation(@PathVariable id: UUID): Map<String, Map<String, Any?>> {
        return mapOf(
            "alongsideCrack" to mapOf(
                "defect" to defectFindService.findAlongsideCrackByReportId(id, null),
                "violation" to defectFindService.findAlongsideCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "bitumen" to mapOf(
                "defect" to defectFindService.findBitumenByReportId(id, null),
                "violation" to defectFindService.findBitumenByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "crossCrack" to mapOf(
                "defect" to defectFindService.findCrossCrackByReportId(id, null),
                "violation" to defectFindService.findCrossCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "crossingCrack" to mapOf(
                "defect" to defectFindService.findCrossingCrackByReportId(id, null),
                "violation" to defectFindService.findCrossingCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "crumb" to mapOf(
                "defect" to defectFindService.findCrumbByReportId(id, null),
                "violation" to defectFindService.findCrumbByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "deformation" to mapOf(
                "defect" to defectFindService.findDeformationByReportId(id, null),
                "violation" to defectFindService.findDeformationByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "dirt" to mapOf(
                "defect" to defectFindService.findDirtByReportId(id, null),
                "violation" to defectFindService.findDirtByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "freezeLayer" to mapOf(
                "defect" to defectFindService.findFreezeLayerByReportId(id, null),
                "violation" to defectFindService.findFreezeLayerByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "liquid" to mapOf(
                "defect" to defectFindService.findLiquidByReportId(id, null),
                "violation" to defectFindService.findLiquidByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "localUnevenness" to mapOf(
                "defect" to defectFindService.findLocalUnevennessByReportId(id, null),
                "violation" to defectFindService.findLocalUnevennessByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "pothole" to mapOf(
                "defect" to defectFindService.findPotholeByReportId(id, null),
                "violation" to defectFindService.findPotholeByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "roadWorkFailure" to mapOf(
                "defect" to defectFindService.findRoadWorkFailureByReportId(id, null),
                "violation" to defectFindService.findRoadWorkFailureByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "secondaryCrack" to mapOf(
                "defect" to defectFindService.findSecondaryCrackByReportId(id, null),
                "violation" to defectFindService.findSecondaryCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "straightCrack" to mapOf(
                "defect" to defectFindService.findStraightCrackByReportId(id, null),
                "violation" to defectFindService.findStraightCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "track" to mapOf(
                "defect" to defectFindService.findTrackByReportId(id, null),
                "violation" to defectFindService.findTrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "waves" to mapOf(
                "defect" to defectFindService.findWavesByReportId(id, null),
                "violation" to defectFindService.findWavesByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "wear" to mapOf(
                "defect" to defectFindService.findWearByReportId(id, null),
                "violation" to defectFindService.findWearByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null },
            "webCrack" to mapOf(
                "defect" to defectFindService.findWebCrackByReportId(id, null),
                "violation" to defectFindService.findWebCrackByReportId(id, null)
                    ?.let { qualityService.getQuality(it) }).filterValues { it != null }
        ).filterValues { it.isNotEmpty() }
    }

}
