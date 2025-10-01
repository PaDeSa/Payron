package com.dsp.gl.hr;

import com.dsp.gl.commons.BaseEntity;
import com.dsp.gl.finance.Salary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;


@Setter
@Getter
@Entity
public class Timesheet extends BaseEntity {


    private int leavedays;
    private String approvedBy;
    private String rejectedBy;
    private String openedBy;


    private LocalDate month;
    private int year;

    @Enumerated(EnumType.STRING)
    private TimesheetStatus status = TimesheetStatus.DRAFT;

    @Embedded
    private Salary salary;

}
