package com.fatec.sigvs.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.sigvs.model.Catalogo;
import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.IImagemRepository;
import com.fatec.sigvs.model.Imagem;
import com.fatec.sigvs.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	IProdutoRepository repositoryProduto;

	@Autowired
	IImagemRepository repositoryImagem;

	@Override
	public List<Catalogo> consultaCatalogo() {
		Catalogo c = null;
		List<Catalogo> lista = new ArrayList<>();
		List<Produto> listaProduto = repositoryProduto.findAll();
		List<Imagem> listaImagem = repositoryImagem.findAll();

		for (Produto p : listaProduto) {
			for (Imagem i : listaImagem) {
				if (p.getId().equals(i.getId())) {
					c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(),
							p.getCusto(), p.getQuantidadeNoEstoque(), i.getArquivo());
					lista.add(c);
				}
			}
		}
		return lista;
	}

	@Override
	public List<Produto> consultaPorDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> cadastrar(Produto produto) {
		logger.info("----------> Servico 'Cadastrar produto' iniciado <---------");
		return Optional.ofNullable(repositoryProduto.save(produto));
	}

	@Override
	public Optional<Produto> consultaPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> atualizar(Long id, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub

	}
}
