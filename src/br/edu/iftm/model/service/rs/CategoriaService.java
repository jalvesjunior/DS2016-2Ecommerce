package br.edu.iftm.model.service.rs;

import java.util.List;

import javax.inject.Inject;

import br.edu.iftm.model.dao.CategoriaDao;
import br.edu.iftm.model.domain.Categoria;
import br.edu.iftm.model.service.ICategoriaService;

public class CategoriaService implements ICategoriaService {

	@Inject
	private CategoriaDao categoriaDao;

	@Override
	public void salvar(Categoria categoria) {
		categoriaDao.salvar(categoria);
	}

	@Override
	public void atualizar(Categoria categoria) {
		categoriaDao.atualizar(categoria);
	}

	@Override
	public void excluir(Categoria categoria) {
		categoriaDao.excluir(categoria);
	}

	@Override
	public List<Categoria> buscar(Categoria categoria) {
		return categoriaDao.buscar(categoria);
	}
}