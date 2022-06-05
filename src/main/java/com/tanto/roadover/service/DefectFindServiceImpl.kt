package com.tanto.roadover.service

import com.tanto.roadover.entity.*
import com.tanto.roadover.util.GType
import org.springframework.stereotype.Service
import java.util.*
import javax.persistence.EntityGraph
import javax.persistence.EntityManager

@Service
class DefectFindServiceImpl(
    private val em: EntityManager
) : DefectFindService {

    override fun findAlongsideCrackByReportId(id: UUID, graph: EntityGraph<AlongsideCrack>?): AlongsideCrack? {
        val query = em.createQuery(
            "select d from AlongsideCrack d join d.report r where r.id = :id",
            AlongsideCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findBitumenByReportId(id: UUID, graph: EntityGraph<Bitumen>?): Bitumen? {
        val query = em.createQuery(
            "select d from Bitumen d join d.report r where r.id = :id",
            Bitumen::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findCrossCrackByReportId(id: UUID, graph: EntityGraph<CrossCrack>?): CrossCrack? {
        val query = em.createQuery(
            "select d from CrossCrack d join d.report r where r.id = :id",
            CrossCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findCrossingCrackByReportId(id: UUID, graph: EntityGraph<CrossingCrack>?): CrossingCrack? {
        val query = em.createQuery(
            "select d from CrossingCrack d join d.report r where r.id = :id",
            CrossingCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findCrumbByReportId(id: UUID, graph: EntityGraph<Crumb>?): Crumb? {
        val query = em.createQuery(
            "select d from Crumb d join d.report r where r.id = :id",
            Crumb::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findDeformationByReportId(id: UUID, graph: EntityGraph<Deformation>?): Deformation? {
        val query = em.createQuery(
            "select d from Deformation d join d.report r where r.id = :id",
            Deformation::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findDirtByReportId(id: UUID, graph: EntityGraph<Dirt>?): Dirt? {
        val query = em.createQuery(
            "select d from Dirt d join d.report r where r.id = :id",
            Dirt::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findFreezeLayerByReportId(id: UUID, graph: EntityGraph<FreezeLayer>?): FreezeLayer? {
        val query = em.createQuery(
            "select d from FreezeLayer d join d.report r where r.id = :id",
            FreezeLayer::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findLiquidByReportId(id: UUID, graph: EntityGraph<Liquid>?): Liquid? {
        val query = em.createQuery(
            "select d from Liquid d join d.report r where r.id = :id",
            Liquid::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findLocalUnevennessByReportId(id: UUID, graph: EntityGraph<LocalUnevenness>?): LocalUnevenness? {
        val query = em.createQuery(
            "select d from LocalUnevenness d join d.report r where r.id = :id",
            LocalUnevenness::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findPotholeByReportId(id: UUID, graph: EntityGraph<Pothole>?): Pothole? {
        val query = em.createQuery(
            "select d from Pothole d join d.report r where r.id = :id",
            Pothole::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findRoadWorkFailureByReportId(id: UUID, graph: EntityGraph<RoadWorkFailure>?): RoadWorkFailure? {
        val query = em.createQuery(
            "select d from RoadWorkFailure d join d.report r where r.id = :id",
            RoadWorkFailure::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findSecondaryCrackByReportId(id: UUID, graph: EntityGraph<SecondaryCrack>?): SecondaryCrack? {
        val query = em.createQuery(
            "select d from SecondaryCrack d join d.report r where r.id = :id",
            SecondaryCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findStraightCrackByReportId(id: UUID, graph: EntityGraph<StraightCrack>?): StraightCrack? {
        val query = em.createQuery(
            "select d from StraightCrack d join d.report r where r.id = :id",
            StraightCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findTrackByReportId(id: UUID, graph: EntityGraph<Track>?): Track? {
        val query = em.createQuery(
            "select d from Track d join d.report r where r.id = :id",
            Track::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findWavesByReportId(id: UUID, graph: EntityGraph<Waves>?): Waves? {
        val query = em.createQuery(
            "select d from Waves d join d.report r where r.id = :id",
            Waves::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findWearByReportId(id: UUID, graph: EntityGraph<Wear>?): Wear? {
        val query = em.createQuery(
            "select d from Wear d join d.report r where r.id = :id",
            Wear::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }

    override fun findWebCrackByReportId(id: UUID, graph: EntityGraph<WebCrack>?): WebCrack? {
        val query = em.createQuery(
            "select d from WebCrack d join d.report r where r.id = :id",
            WebCrack::class.java
        ).setParameter("id", id)
        if (graph != null){
            query.setHint(GType.LOAD, graph)
        }
        return query.resultList.firstOrNull()
    }


}
