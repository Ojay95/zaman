package com.zaman.repository;

import com.zaman.entity.PrayerTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrayerTimeRepository extends JpaRepository <PrayerTime, Long> {
    List<PrayerTime> findByDate (LocalDate date);
}
