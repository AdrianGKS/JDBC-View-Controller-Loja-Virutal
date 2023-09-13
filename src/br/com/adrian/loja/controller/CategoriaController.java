package br.com.adrian.loja.controller;

import br.com.adrian.loja.dao.CategoriaDAO;
import br.com.adrian.loja.factory.ConnectionFactory;
import br.com.adrian.loja.modelo.Categoria;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO =  new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
