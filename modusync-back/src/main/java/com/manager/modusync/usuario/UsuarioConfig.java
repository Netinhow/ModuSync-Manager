package com.manager.modusync.usuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository) {
        return args -> {
          Usuario neto = new Usuario("Neto", "123");
          Usuario gabriel = new Usuario( "Gabriel", "456");

          usuarioRepository.saveAll(List.of(neto, gabriel));
        };
    }

}
