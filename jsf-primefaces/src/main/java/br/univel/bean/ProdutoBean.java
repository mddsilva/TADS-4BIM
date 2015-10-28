package br.univel.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.univel.model.Produto;

@Stateless
public class ProdutoBean {

	/**
	 * Default constructor.
	 */
	public ProdutoBean() {
	}
	@PersistenceContext(unitName = "jsf-primefaces-persistence-unit")
	EntityManager dao;

	public List<Produto> findAllProduto() {
		TypedQuery<Produto> findAllQuery = dao
				.createQuery("SELECT DISTINCT p FROM Produto p ORDER BY p.id",
						Produto.class);
		/*
		 * if (startPosition != null) {
		 * findAllQuery.setFirstResult(startPosition); } if (maxResult != null)
		 * { findAllQuery.setMaxResults(maxResult); }
		 */
		return findAllQuery.getResultList();
	}

}