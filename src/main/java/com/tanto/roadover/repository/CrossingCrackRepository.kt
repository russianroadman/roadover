package com.tanto.roadover.repository;

import com.tanto.roadover.entity.CrossingCrack
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CrossingCrackRepository : JpaRepository<CrossingCrack, UUID> {
}
