package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Pothole
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PotholeRepository : JpaRepository<Pothole, UUID> {
}
