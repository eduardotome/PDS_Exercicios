package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pessoa;
import model.PessoaTableModel;
import view.JanelaPessoa;

public class PessoaController {
	
	private PessoaTableModel pessoaModel;
	private JanelaPessoa view;
	
	public PessoaController(PessoaTableModel modelo, JanelaPessoa view) {
		this.pessoaModel = modelo;
		this.view = view;
		
		this.view.getTable().setModel(modelo);
		this.view.getBtnAdicionar().addActionListener(e -> eventoBotaoAdicionar());
		this.view.getBtnRemover().addActionListener(e -> eventoBotaoRemover());
		this.view.getBtnVisualizar().addActionListener(e -> eventoBotaoVisualizar());
		
	}
	

	private void eventoBotaoVisualizar() {
		
	}


	public void eventoBotaoRemover() {
		int linhaSelecionada = this.view.getTable().getSelectedRow();
		pessoaModel.remover(linhaSelecionada);

	}
	
	public void eventoBotaoAdicionar() {
		String nome = this.view.getTxtNome().getText();
		String cpf = this.view.getTxtCPF().getText();
		int idade = Integer.parseInt( this.view.getTextField().getText());
		String email = this.view.getTxtEmail().getText();
		
		
		Pessoa p = new Pessoa(nome, cpf, idade, email);
		pessoaModel.adicionarPessoa(p);
		
		this.view.getTxtNome().setText("");
		this.view.getTxtCPF().setText("");
		this.view.getTextField().setText("");
		this.view.getTxtEmail().setText("");
	}

}
