package com.tanto.roadover.repository;

import com.tanto.roadover.entity.WebCrack
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WebCrackRepository : JpaRepository<WebCrack, UUID> {
}
