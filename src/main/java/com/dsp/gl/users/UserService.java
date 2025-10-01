package com.dsp.gl.users;


import com.dsp.gl.commons.DataResponse;
import com.dsp.gl.exeption.RoleNotFoundException;
import com.dsp.gl.exeption.UserAlreadyExistException;
import com.dsp.gl.exeption.UserNotFoundException;

public interface UserService {
    UserResponseDto register(UserRequestDto user) throws UserAlreadyExistException;
    DataResponse getAllUsers(int page, int size);
    UserResponseDto getUser(Long id) throws UserNotFoundException;
    UserResponseDto addRole(Long id,RoleRequestDto role) throws UserNotFoundException;
    UserResponseDto deleteRoleUser(Long id, RoleRequestDto role) throws UserNotFoundException, RoleNotFoundException;
}
