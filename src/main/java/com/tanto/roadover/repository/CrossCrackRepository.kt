package com.tanto.roadover.repository;

import com.tanto.roadover.entity.CrossCrack
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CrossCrackRepository : JpaRepository<CrossCrack, UUID> {
}
