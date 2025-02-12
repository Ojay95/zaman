package com.zaman.repository;

import com.zaman.entity.UserNotificationSettings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserNotificationSettingsRepository extends JpaRepository <UserNotificationSettings, Long> {
    Optional<UserNotificationSettings> findByUserId(Long userId);
}
