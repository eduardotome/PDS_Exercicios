package main;

import controller.AutorController;
import model.AutorTableModel;
import view.JanelaAutor;

public class Main {

    public static void main(String[] args) {
        // Inicializa o Modelo e a sua Janela original
        AutorTableModel model = new AutorTableModel();
        JanelaAutor view = new JanelaAutor();
        
        // Passa os dois para o novo Controller limpo
        new AutorController(model, view);

        // Abre a tela bonita na tela
        view.setVisible(true);
    }
}