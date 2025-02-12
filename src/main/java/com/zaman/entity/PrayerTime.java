package com.zaman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrayerTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String fajr;
    private String dhuhr;
    private String asr;
    private String maghrib;
    private String isha;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

}