package com.mathdenizi.notes.repositories;

import com.mathdenizi.notes.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}