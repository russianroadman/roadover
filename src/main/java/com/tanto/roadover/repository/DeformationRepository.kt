package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Deformation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface DeformationRepository : JpaRepository<Deformation, UUID> {
}
