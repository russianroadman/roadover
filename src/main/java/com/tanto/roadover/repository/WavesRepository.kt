package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Waves
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WavesRepository : JpaRepository<Waves, UUID> {
}
