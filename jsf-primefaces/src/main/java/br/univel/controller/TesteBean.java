package br.univel.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.univel.bean.ProdutoBean;
import br.univel.model.Produto;

@ManagedBean(name="ProdutoController")
@RequestScoped
public class TesteBean {
 
    @EJB ProdutoBean produtoBean;
     
    List<Produto> produtos;
 
    @PostConstruct
    public void init() {
    produtos = produtoBean.findAllProduto();
    }
}