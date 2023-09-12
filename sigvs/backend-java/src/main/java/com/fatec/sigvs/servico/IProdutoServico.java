package com.fatec.sigvs.servico;

import java.util.List;
import java.util.Optional;

import com.fatec.sigvs.model.Produto;

public interface IProdutoServico {
	public List<Produto>consultaCatalogo();
	public List<Produto>consultaPorDescricao();
	public Optional<Produto>cadastrar(Produto produto);
	public Optional<Produto>consultaPorId(String id);
	public Optional<Produto>atualizar(Long id, Produto produto);
	public void excluir(Long id);
}
