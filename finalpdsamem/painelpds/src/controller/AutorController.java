package controller;

import model.*;
import view.*;
import javax.swing.*;

public class AutorController {

    private AutorTableModel model;
    private JanelaAutor view;

    public AutorController(AutorTableModel model, JanelaAutor view) {
        this.model = model;
        this.view = view;
        

        // O Controller de verdade define o modelo na tabela da sua tela
        view.getTable().setModel(model);

        // O Controller ouve os cliques dos botões da sua tela original
        view.getBtnAdicionar().addActionListener(e -> adicionar());
    }

    private void adicionar() {
        // O Controller valida os campos da tela
        if (view.getTxtNome().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "Preencha o nome!");
            return;
        }

        // O Controller cria o objeto e adiciona na tabela
        Autor a = new Autor(
            view.getTxtNome().getText(),
            Integer.parseInt(view.getTxtCpf().getText()),
            view.getTxtEmail().getText(),
            view.getComboGenero().getSelectedItem().toString(),
            view.getTxtNacionalidade().getText()
        );
        

        model.adicionar(a);
    }
}