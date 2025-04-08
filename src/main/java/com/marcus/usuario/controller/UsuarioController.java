package com.marcus.usuario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcus.usuario.business.UsuarioService;
import com.marcus.usuario.business.dto.UsuarioDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;
   
    @PostMapping
    public ResponseEntity<UsuarioDTO> salvaUsuario(@RequestBody UsuarioDTO usuarioDTO){
     return  ResponseEntity.ok(usuarioService.salvaUsuario(usuarioDTO));
    }
}
