package br.com.rd.treinamento.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {
    private BigInteger idCidade;
    private BigInteger idUf;
    private String cdCidaadeIbge;
    private String dsCidade;
}
