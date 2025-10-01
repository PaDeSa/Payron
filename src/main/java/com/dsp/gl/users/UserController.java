package com.dsp.gl.users;

import com.dsp.gl.commons.AbstractController;
import com.dsp.gl.commons.ApiConstants;
import com.dsp.gl.commons.ApiResponse;
import com.dsp.gl.commons.DataResponse;
import com.dsp.gl.exeption.RoleNotFoundException;
import com.dsp.gl.exeption.UserAlreadyExistException;
import com.dsp.gl.exeption.UserNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiConstants.BASE_PATH+"/users")
@Slf4j
public class UserController extends AbstractController {
    private final UserService userService; //couplage faible

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Inscription d'un utilisateur")
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<UserResponseDto>> register(@RequestBody @Valid UserRequestDto request) throws UserAlreadyExistException {
        return getResponseEntity(userService.register(request));
    }

    @Operation(summary = "recuperation la liste des utilisateurs")
    @GetMapping("/all")  // admin
    public ResponseEntity<ApiResponse<DataResponse>> getAllUsers(
        @RequestParam(name = "page",defaultValue = ApiConstants.PAGE)int page,

        @RequestParam(name = "size",defaultValue = ApiConstants.SIZE)int size
    ) {
       return getResponseEntity(userService.getAllUsers(page,size));
    }

    @Operation(summary = "recuperation d'un utilisateur depuis l'id")
    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> getUser(
            @Parameter(name = "id",required = true)
            @PathVariable Long id) throws UserNotFoundException {
        return getResponseEntity(userService.getUser(id));
    }

    //ajouter de api-addRole
    @Operation(summary = "Ajout d'un role a un utilisateur")
    @PostMapping("/addRole/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> addRole(
            @Parameter(name = "id",required = true)
            @PathVariable Long id,
            @RequestBody @Valid RoleRequestDto request) throws UserNotFoundException, RoleNotFoundException {
        return getResponseEntity(userService.addRole(id,request));
    }
    // suppression un role par l'admin

    @Operation(summary = "Suppression d'un role a un utilisateur")
    @PostMapping("/deleteRole/{id}")
    public ResponseEntity<ApiResponse<UserResponseDto>> deleteRoleUser(
            @Parameter(name = "id",required = true)
            @PathVariable Long id,
            @RequestBody @Valid RoleRequestDto request) throws UserNotFoundException , RoleNotFoundException {
        return getResponseEntity(userService.deleteRoleUser(id,request));
    }
}
