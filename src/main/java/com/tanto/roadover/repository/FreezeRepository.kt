package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Freeze
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FreezeRepository : JpaRepository<Freeze, UUID> {
}
