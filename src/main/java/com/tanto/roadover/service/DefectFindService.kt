package com.tanto.roadover.service

import com.tanto.roadover.entity.*
import java.util.*
import javax.persistence.EntityGraph

interface DefectFindService {

    fun findAlongsideCrackByReportId(id: UUID, graph: EntityGraph<AlongsideCrack>?): AlongsideCrack?

    fun findBitumenByReportId(id: UUID, graph: EntityGraph<Bitumen>?): Bitumen?

    fun findCrossCrackByReportId(id: UUID, graph: EntityGraph<CrossCrack>?): CrossCrack?

    fun findCrossingCrackByReportId(id: UUID, graph: EntityGraph<CrossingCrack>?): CrossingCrack?

    fun findCrumbByReportId(id: UUID, graph: EntityGraph<Crumb>?): Crumb?

    fun findDeformationByReportId(id: UUID, graph: EntityGraph<Deformation>?): Deformation?

    fun findDirtByReportId(id: UUID, graph: EntityGraph<Dirt>?): Dirt?

    fun findFreezeLayerByReportId(id: UUID, graph: EntityGraph<FreezeLayer>?): FreezeLayer?

    fun findLiquidByReportId(id: UUID, graph: EntityGraph<Liquid>?): Liquid?

    fun findLocalUnevennessByReportId(id: UUID, graph: EntityGraph<LocalUnevenness>?): LocalUnevenness?

    fun findPotholeByReportId(id: UUID, graph: EntityGraph<Pothole>?): Pothole?

    fun findRoadWorkFailureByReportId(id: UUID, graph: EntityGraph<RoadWorkFailure>?): RoadWorkFailure?

    fun findSecondaryCrackByReportId(id: UUID, graph: EntityGraph<SecondaryCrack>?): SecondaryCrack?

    fun findStraightCrackByReportId(id: UUID, graph: EntityGraph<StraightCrack>?): StraightCrack?

    fun findTrackByReportId(id: UUID, graph: EntityGraph<Track>?): Track?

    fun findWavesByReportId(id: UUID, graph: EntityGraph<Waves>?): Waves?

    fun findWearByReportId(id: UUID, graph: EntityGraph<Wear>?): Wear?

    fun findWebCrackByReportId(id: UUID, graph: EntityGraph<WebCrack>?): WebCrack?

}
