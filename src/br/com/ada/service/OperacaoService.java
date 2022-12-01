package br.com.ada.service;

import br.com.ada.domain.Produto;

import java.util.List;

public interface OperacaoService {

    void realizarCompra(List<Produto> produtos);

}
