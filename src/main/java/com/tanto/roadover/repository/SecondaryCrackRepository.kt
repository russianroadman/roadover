package com.tanto.roadover.repository;

import com.tanto.roadover.entity.SecondaryCrack
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SecondaryCrackRepository : JpaRepository<SecondaryCrack, UUID> {
}
