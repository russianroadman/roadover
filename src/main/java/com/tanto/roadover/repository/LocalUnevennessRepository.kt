package com.tanto.roadover.repository;

import com.tanto.roadover.entity.LocalUnevenness
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LocalUnevennessRepository : JpaRepository<LocalUnevenness, UUID> {
}
