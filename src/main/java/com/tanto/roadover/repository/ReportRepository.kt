package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Report
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ReportRepository : JpaRepository<Report, UUID> {
}
