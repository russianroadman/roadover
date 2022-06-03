package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Wear
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WearRepository : JpaRepository<Wear, UUID> {
}
