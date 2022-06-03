package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Dirt
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface DirtRepository : JpaRepository<Dirt, UUID> {
}
