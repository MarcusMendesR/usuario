package com.marcus.usuario.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {
    private Long id;
    private String rua;
    private Long numero;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
}
