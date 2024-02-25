package com.manager.modusync.usuario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioInteface;

    public UsuarioService(UsuarioRepository usuarioInteface) {
        this.usuarioInteface = usuarioInteface;
    }

    public List<Usuario> getUsuario() {
        return usuarioInteface.findAll();
    }
    public String olaMundo() {
        return  "ola mundo";
    }

}
