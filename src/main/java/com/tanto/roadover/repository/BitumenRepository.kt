package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Bitumen
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BitumenRepository : JpaRepository<Bitumen, UUID> {
}
