package com.github.jhugosc.FinTrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.jhugosc.FinTrack.model.Transacao;
import com.github.jhugosc.FinTrack.repository.TransacaoRepository;

@Service
public class TransacaoService {

@Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> getAllTransacao(){
        return transacaoRepository.findAll();
    }

    public Transacao addTransacao (Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public Transacao updateTransacao (Long id, Transacao transacao) {
        Optional<Transacao> transacaoExistente = transacaoRepository.findById(id);
        if (transacaoExistente.isPresent()) {
            transacao.setId(id);
            return transacaoRepository.save(transacao);
        }
        return null;
    }

    public void deleteTransacao (Long id) {
        transacaoRepository.deleteById(id);
    }
}
