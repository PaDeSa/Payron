package com.dsp.gl;

import com.dsp.gl.users.Role;
import com.dsp.gl.users.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PayronApp implements CommandLineRunner {
    @Autowired
    private final RoleRepository roleRepository;

    public PayronApp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(PayronApp.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        List<String> names = List.of("HR","FINANCE", "ADMIN", "EMPLOYEE","SUPERVISOR");

        names.forEach( name ->{
            if(!roleRepository.existsByRoleName(name)){
                Role role = new Role();
                role.setRoleName(name);
                roleRepository.save(role);
            }
        });
    }
}


