package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Liquid
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LiquidRepository : JpaRepository<Liquid, UUID> {
}
