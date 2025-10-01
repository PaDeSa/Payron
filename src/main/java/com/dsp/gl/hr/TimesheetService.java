package com.dsp.gl.hr;

import com.dsp.gl.exeption.RoleNotFoundException;
import com.dsp.gl.exeption.TimesheetAlreadyExistException;
import com.dsp.gl.exeption.TimesheetNotFoundException;

import java.util.Optional;

public interface TimesheetService {

    TimesheetResponeDto openTimesheetByHR(Long id, String role ) throws RoleNotFoundException;
    Optional<TimesheetRequestDto> submitTimesheet(Long id , TimesheetRequestDto timesheetRequestDto) throws TimesheetAlreadyExistException;
    TimesheetResponeDto operateBySupervisor(Long timesheetId, Long supervisorID, boolean approve )throws  RuntimeException;
    TimesheetResponeDto operateByHRTimesheet( Long hrId, Long timesheetId,boolean approve);
    TimesheetResponeDto getTimesheetById(Long id) throws TimesheetNotFoundException;
    TimesheetResponeDto getOrCreateCurrentTimesheet(Long userId);
}
