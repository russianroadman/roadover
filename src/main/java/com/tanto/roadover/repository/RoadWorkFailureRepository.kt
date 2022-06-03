package com.tanto.roadover.repository;

import com.tanto.roadover.entity.RoadWorkFailure
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RoadWorkFailureRepository : JpaRepository<RoadWorkFailure, UUID> {
}
