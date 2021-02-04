package br.com.rd.treinamento.springboot.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "TB_CIDADE")
@Data
public class CidadeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIDADE")
    private BigInteger idCidade;

    @Column(name = "ID_UF")
    private BigInteger idUf;

    @Column(name = "CD_CIDADE_IBGE")
    private String cdCidaadeIbge;

    @Column(name = "DS_CIDADE")
    private String dsCidade;

}
