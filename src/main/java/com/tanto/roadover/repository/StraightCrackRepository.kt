package com.tanto.roadover.repository;

import com.tanto.roadover.entity.StraightCrack
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface StraightCrackRepository : JpaRepository<StraightCrack, UUID> {
}
