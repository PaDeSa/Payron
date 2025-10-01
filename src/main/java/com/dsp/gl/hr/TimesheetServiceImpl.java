package com.dsp.gl.hr;

import com.dsp.gl.exeption.RoleNotFoundException;
import com.dsp.gl.exeption.TimesheetAlreadyExistException;
import com.dsp.gl.exeption.TimesheetNotFoundException;


import java.util.Optional;



public class TimesheetServiceImpl implements TimesheetService {

    @Override
    public TimesheetResponeDto openTimesheetByHR(Long id, String role) throws RoleNotFoundException {
        return null;
    }

    @Override
    public Optional<TimesheetRequestDto> submitTimesheet(Long id, TimesheetRequestDto timesheetRequestDto) throws TimesheetAlreadyExistException {
        return Optional.empty();
    }

    @Override
    public TimesheetResponeDto operateBySupervisor(Long timesheetId, Long supervisorID, boolean approve) throws RuntimeException {
        return null;
    }

    @Override
    public TimesheetResponeDto operateByHRTimesheet(Long hrId, Long timesheetId, boolean approve) {
        return null;
    }

    @Override
    public TimesheetResponeDto getTimesheetById(Long id) throws TimesheetNotFoundException {
        return null;
    }

    @Override
    public TimesheetResponeDto getOrCreateCurrentTimesheet(Long userId) {
        return null;
    }
}