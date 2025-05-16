package com.github.jhugosc.FinTrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jhugosc.FinTrack.model.Transacao;

public interface TransacaoRepository extends JpaRepository <Transacao, Long>{

}
