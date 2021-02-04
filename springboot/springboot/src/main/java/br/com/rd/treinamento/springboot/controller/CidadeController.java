package br.com.rd.treinamento.springboot.controller;

import br.com.rd.treinamento.springboot.dto.Cidade;
import br.com.rd.treinamento.springboot.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/listacidades")
    public ResponseEntity getCidades(){return ResponseEntity.status(HttpStatus.OK).body(cidadeService.getCidades());}

    @GetMapping("/cidade/{idCidade}")
    public ResponseEntity getCidadeById(@PathVariable("idCidade") BigInteger idCidade){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.getCidadeById(idCidade));
    }

    @PostMapping("/cadastrarcidade")
    public ResponseEntity cadastrarCidade(@RequestBody Cidade cidade){

        String retorno = cidadeService.inserirCidade(cidade);

        return ResponseEntity.status(HttpStatus.OK).body(retorno);
    }

    @PutMapping("/cidade/{idCidade}")
    public ResponseEntity alterarCidade(@RequestBody Cidade cidade, @PathVariable("idCidade")BigInteger idCidade){

        String retorno = cidadeService.alterarCidade(cidade, idCidade);

        return ResponseEntity.status(HttpStatus.OK).body(retorno);
    }

    @DeleteMapping("/cidade/{idCidade}")
    public ResponseEntity deletarCidade(@PathVariable("idCidade") BigInteger idCidade){
        String retorno = cidadeService.deletarCidade(idCidade);

        return ResponseEntity.status(HttpStatus.OK).body(retorno);
    }

}
