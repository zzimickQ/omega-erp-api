package org.omega.omegaerp.bootloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"org.omega.omegaerp.models", "org.omega.hrm.models"})
//@EntityScan(basePackages = {"org.omega.omegaerp.models"})
@ComponentScan(basePackages = {"org.omega.omegaerp", "org.omega.hrm"})
@EnableJpaRepositories(basePackages = "org.omega.omegaerp.dal")
public class OmegaErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmegaErpApplication.class, args);
    }

}

