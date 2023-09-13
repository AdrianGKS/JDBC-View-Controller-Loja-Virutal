package br.com.adrian.loja;

import br.com.adrian.loja.view.ProdutoCategoriaFrame;

import javax.swing.JFrame;
import java.sql.SQLException;


public class TestaOperacaoComView {

	public static void main(String[] args) throws SQLException {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
