package com.dsp.gl.hr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Month;
import java.util.Optional;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    @Query("SELECT t FROM Timesheet t WHERE t.id = :idTimesheet")
    Optional<Timesheet> findById(Long idTimesheet);

    @Query("SELECT t FROM Timesheet t WHERE t.id = :id AND t.month = :month")
    Optional<Timesheet> findByIdAndMonth(Long id, Month month);

    @Query("SELECT t FROM Timesheet t WHERE t.id = :id AND t.month = :month AND t.status = :status")
    Optional<Timesheet> findByIdAndMonthAndStatus(Long id, Month month, TimesheetStatus status);


}