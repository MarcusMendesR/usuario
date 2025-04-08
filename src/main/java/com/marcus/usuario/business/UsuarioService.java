package com.marcus.usuario.business;

import org.springframework.stereotype.Service;

import com.marcus.usuario.business.converter.UsuarioConverter;
import com.marcus.usuario.business.dto.UsuarioDTO;
import com.marcus.usuario.infrastructure.entity.Usuario;
import com.marcus.usuario.infrastructure.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }

}
