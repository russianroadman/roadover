package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Report
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*

interface ReportRepository : JpaRepository<Report, UUID> {



}
