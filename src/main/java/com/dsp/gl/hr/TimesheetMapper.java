package com.dsp.gl.hr;

public class TimesheetMapper {


    private TimesheetMapper() {
    }

    public static TimesheetResponeDto toTimesheetResponeDto(Timesheet timesheet) {
        return new TimesheetResponeDto();
    }

    public static Timesheet toTimesheet(TimesheetRequestDto timesheetRequestDto) {

        return null;
    }

    public static TimesheetRequestDto toTimesheetRequestDto(Timesheet timesheet) {
        return new TimesheetRequestDto(

        );
    }
}
