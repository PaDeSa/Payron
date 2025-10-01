package com.dsp.gl.hr;

public enum TimesheetStatus {
        DRAFT ("DRAFT"),
        SUBMITTED ("SUBMITTED"),
        SUPERVISOR_APPROVED("SUPERVISOR_APPROVED"),
        SUPERVISOR_REJECTED("SUPERVISOR_REJECTED"),
        HR_APPROVED ("HR_APPROVED"),
        HR_REJECTED("HR_REJECTED"),
        FINANCE_APPROVED ("FINANCE_VALIDATED"),
        FINANCE_REJECTED("FINANCE_REJECTED"),
        PAID ("PAID"),
        OPEN("OPEN");

    private final String value;
    TimesheetStatus(String value) {
        this.value = value;
    }
}
