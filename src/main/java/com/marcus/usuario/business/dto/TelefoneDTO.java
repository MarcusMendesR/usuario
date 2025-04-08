package com.marcus.usuario.business.dto;

import org.checkerframework.checker.units.qual.A;

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
public class TelefoneDTO {
    private String ddd;
    private String numero;
}
