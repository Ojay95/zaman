package com.zaman.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor@Data
public class UserNotificationSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean fajrReminderEnabled;
    private boolean dhuhrReminderEnabled;
    private boolean asrReminderEnabled;
    private boolean maghribReminderEnabled;
    private boolean ishaReminderEnabled;

    private LocalDateTime reminderTimeFajr;
    private LocalDateTime reminderTimeDhuhr;
    private LocalDateTime reminderTimeAsr;
    private LocalDateTime reminderTimeMaghrib;
    private LocalDateTime reminderTimeIsha;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
