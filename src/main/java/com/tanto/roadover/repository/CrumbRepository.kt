package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Crumb
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CrumbRepository : JpaRepository<Crumb, UUID> {
}
