package com.github.jhugosc.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.github.jhugosc.FinTrack.model.Transacao;
import com.github.jhugosc.FinTrack.service.TransacaoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/fintrack")
public class TransacaoController {

    @Autowired
    TransacaoService transacaoService;

    @GetMapping
    public List<Transacao> getAllTransacaos(){
        return transacaoService.getAllTransacao();        
    }

    @PostMapping
    public Transacao addTransacao (@RequestBody Transacao transacao) {
        return transacaoService.addTransacao(transacao);
    }

    @PutMapping("/{id}")
    public Transacao updateTransacao (@PathVariable Long id, @RequestBody Transacao transacao) {
        return transacaoService.updateTransacao(id, transacao);
    }

    @DeleteMapping("/{id}")
    public void deleteTransacao (@PathVariable Long id) {
        transacaoService.deleteTransacao(id);
    }
}
