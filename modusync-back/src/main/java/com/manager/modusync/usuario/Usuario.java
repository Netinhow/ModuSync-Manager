package com.manager.modusync.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "usuario")
@Table
@Getter
@Setter
public class Usuario {

    @Id
    @SequenceGenerator(
            name = "usuario_sequence",
            sequenceName = "usuario_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "usuario_sequence"
    )

    private Long id;
    private String nome;
    private String ip;

    public Usuario() {
    }

    @SuppressWarnings(value = "unused")
    public Usuario(Long id, String nome, String ip) {
        this.id = id;
        this.nome = nome;
        this.ip = ip;
    }

    public Usuario(String nome, String ip) {
        this.nome = nome;
        this.ip = ip;
    }
}
