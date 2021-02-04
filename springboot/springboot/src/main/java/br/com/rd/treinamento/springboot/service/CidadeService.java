package br.com.rd.treinamento.springboot.service;

import br.com.rd.treinamento.springboot.dto.Cidade;
import br.com.rd.treinamento.springboot.entity.CidadeEntity;
import br.com.rd.treinamento.springboot.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeEntity> getCidades(){
        List<CidadeEntity> cidades =cidadeRepository.findAll();
        return cidades;
    }

    public CidadeEntity getCidadeById(BigInteger id){
        Optional<CidadeEntity> optional =cidadeRepository.findById(id);
        return optional.get();
    }

    @Transactional
    public String inserirCidade (Cidade cidade){
        CidadeEntity cidadeEntity = new CidadeEntity();

        cidadeEntity.setIdUf(cidade.getIdUf());
        cidadeEntity.setCdCidaadeIbge(cidade.getCdCidaadeIbge());
        cidadeEntity.setDsCidade(cidade.getDsCidade());

        cidadeRepository.save(cidadeEntity);

        return "Inserção realizada com sucesso!";
    }

    @Transactional
    public String alterarCidade (Cidade cidade, BigInteger idCidade){
        CidadeEntity cidadeEntity =getCidadeById(idCidade);

        cidadeEntity.setIdUf(cidade.getIdUf());
        cidadeEntity.setCdCidaadeIbge(cidade.getCdCidaadeIbge());
        cidadeEntity.setDsCidade(cidade.getDsCidade());

        cidadeRepository.save(cidadeEntity);

        return "Alteração realizada com sucesso";
    }

    @Transactional
    public String deletarCidade (BigInteger idCidade){

        cidadeRepository.deleteById(idCidade);

        return  "Exclusão realizada com sucesso";
    }


}
