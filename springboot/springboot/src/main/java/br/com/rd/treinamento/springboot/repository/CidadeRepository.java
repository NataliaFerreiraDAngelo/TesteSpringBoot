package br.com.rd.treinamento.springboot.repository;


import br.com.rd.treinamento.springboot.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, BigInteger> {

}
