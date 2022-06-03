package com.tanto.roadover.repository;

import com.tanto.roadover.entity.FreezeLayer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FreezeRepository : JpaRepository<FreezeLayer, UUID> {
}
