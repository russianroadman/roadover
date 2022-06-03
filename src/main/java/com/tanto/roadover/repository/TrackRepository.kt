package com.tanto.roadover.repository;

import com.tanto.roadover.entity.Track
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface TrackRepository : JpaRepository<Track, UUID> {
}
