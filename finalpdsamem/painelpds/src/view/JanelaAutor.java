package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class JanelaAutor extends JFrame {

    private JTextField txtNome, txtCpf, txtEmail, txtNacionalidade;
    private JComboBox<String> comboGenero;
    private JButton btnCadastrar, btnVerTabela, btnLimpar;
    
    private int linhaSendoEditada = -1;

    protected static DefaultTableModel tableModelShared = new DefaultTableModel(
        new String[]{"Nome", "CPF", "E-mail", "Gênero", "Nacionalidade"}, 0
    );

    public JanelaAutor() {
        this(-1); 
    }

    public JanelaAutor(int linhaParaEditar) {
        this.linhaSendoEditada = linhaParaEditar;
        
        setTitle("Capas Vivas - Cadastro de Autor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 820); 
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(new MigLayout("fill, insets 0", "[center]", "[center]"));
        contentPane.setBackground(new Color(162, 244, 197));
        setContentPane(contentPane);

        JPanel cardCadastro = new JPanel(new MigLayout("wrap, insets 20 80 20 80, hidemode 3", "[center, grow]", "[]2[]8[]2[]4[]2[]4[]2[]4[]2[]4[]12[]5[]"));
        cardCadastro.setBackground(new Color(235, 253, 242));
        
        cardCadastro.setPreferredSize(new Dimension(720, 740)); 
        cardCadastro.setBorder(BorderFactory.createLineBorder(new Color(210, 245, 225), 1));
        contentPane.add(cardCadastro, "width 720!, height 740!");

        // Logo
        JLabel logo = new JLabel("");
        try {
            logo.setIcon(new ImageIcon(JanelaAutor.class.getResource("/Imagens/Logo.png")));
        } catch (Exception e) {
            logo.setText("[ LOGO - CAPAS VIVAS ]");
            logo.setFont(new Font("Segoe UI", Font.BOLD, 16));
            logo.setForeground(new Color(20, 80, 40));
        }
        cardCadastro.add(logo, "gapbottom 0");

        // Título
        JLabel lblTitulo = new JLabel(linhaSendoEditada == -1 ? "Cadastro de Autor" : "Editar Dados do Autor");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(11, 71, 32));
        cardCadastro.add(lblTitulo, "gapbottom 5");

        // Campos
        cardCadastro.add(criarLabel("Nome:"), "alignx left, gapleft 10");
        txtNome = criarTextField();
        cardCadastro.add(txtNome, "growx, h 34!, gapleft 10, gapright 10");

        cardCadastro.add(criarLabel("CPF:"), "alignx left, gapleft 10");
        txtCpf = criarTextField();
        cardCadastro.add(txtCpf, "growx, h 34!, gapleft 10, gapright 10");

        cardCadastro.add(criarLabel("E-mail:"), "alignx left, gapleft 10");
        txtEmail = criarTextField();
        cardCadastro.add(txtEmail, "growx, h 34!, gapleft 10, gapright 10");

        cardCadastro.add(criarLabel("Gênero Literário Principal:"), "alignx left, gapleft 10");
        comboGenero = new JComboBox<>(new String[]{"Fantasia", "Ficção Científica", "Aventura", "Romance", "Terror", "Drama"});
        comboGenero.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        comboGenero.setBackground(Color.WHITE);
        comboGenero.setBorder(BorderFactory.createLineBorder(new Color(150, 220, 180), 1));
        cardCadastro.add(comboGenero, "growx, h 34!, gapleft 10, gapright 10");

        cardCadastro.add(criarLabel("Nacionalidade:"), "alignx left, gapleft 10");
        txtNacionalidade = criarTextField();
        cardCadastro.add(txtNacionalidade, "growx, h 34!, gapleft 10, gapright 10");

        if (linhaSendoEditada != -1) {
            txtNome.setText(tableModelShared.getValueAt(linhaSendoEditada, 0).toString());
            txtCpf.setText(tableModelShared.getValueAt(linhaSendoEditada, 1).toString());
            txtEmail.setText(tableModelShared.getValueAt(linhaSendoEditada, 2).toString());
            comboGenero.setSelectedItem(tableModelShared.getValueAt(linhaSendoEditada, 3).toString());
            txtNacionalidade.setText(tableModelShared.getValueAt(linhaSendoEditada, 4).toString());
        }

        // Botão Principal
        btnCadastrar = new JButton(linhaSendoEditada == -1 ? "Cadastrar Autor" : "Salvar Alterações");
        btnCadastrar.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnCadastrar.setBackground(linhaSendoEditada == -1 ? new Color(11, 71, 32) : new Color(20, 110, 60)); 
        btnCadastrar.setForeground(Color.WHITE);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cardCadastro.add(btnCadastrar, "width 70%!, h 42!, gaptop 5");

        // Painel de Opções Inferiores
        JPanel panelOpcoes = new JPanel(new MigLayout("insets 0", "[grow][grow]", "[]"));
        panelOpcoes.setOpaque(false);
        cardCadastro.add(panelOpcoes, "width 70%!, gaptop 2");

        btnVerTabela = new JButton("Visualizar Tabela");
        btnVerTabela.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnVerTabela.setBackground(new Color(0, 102, 204)); 
        btnVerTabela.setForeground(Color.WHITE);
        btnVerTabela.setFocusPainted(false);
        btnVerTabela.setBorderPainted(false);
        btnVerTabela.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btnLimpar = new JButton(linhaSendoEditada == -1 ? "Limpar / Novo" : "Cancelar");
        btnLimpar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnLimpar.setBackground(new Color(120, 140, 130)); 
        btnLimpar.setForeground(Color.WHITE);
        btnLimpar.setFocusPainted(false);
        btnLimpar.setBorderPainted(false);
        btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panelOpcoes.add(btnVerTabela, "growx, h 35!");
        panelOpcoes.add(btnLimpar, "growx, h 35!");

        // Ações dos botões originais
        btnCadastrar.addActionListener(e -> {
            if (validarCampos()) {
                if (linhaSendoEditada == -1) {
                    Object[] novaLinha = {
                        txtNome.getText(), txtCpf.getText(), txtEmail.getText(),
                        comboGenero.getSelectedItem().toString(), txtNacionalidade.getText()
                    };
                    tableModelShared.addRow(novaLinha);
                    JOptionPane.showMessageDialog(this, "Autor cadastrado com sucesso!");
                    limparCampos();
                } else {
                    tableModelShared.setValueAt(txtNome.getText(), linhaSendoEditada, 0);
                    tableModelShared.setValueAt(txtCpf.getText(), linhaSendoEditada, 1);
                    tableModelShared.setValueAt(txtEmail.getText(), linhaSendoEditada, 2);
                    tableModelShared.setValueAt(comboGenero.getSelectedItem().toString(), linhaSendoEditada, 3);
                    tableModelShared.setValueAt(txtNacionalidade.getText(), linhaSendoEditada, 4);
                    
                    JOptionPane.showMessageDialog(this, "Autor updated com sucesso!");
                    new JanelaTabelaAutor().setVisible(true);
                    this.dispose();
                }
            }
        });

        btnLimpar.addActionListener(e -> {
            if (linhaSendoEditada == -1) {
                limparCampos();
            } else {
                new JanelaTabelaAutor().setVisible(true);
                this.dispose();
            }
        });

        btnVerTabela.addActionListener(e -> {
            new JanelaTabelaAutor().setVisible(true);
            this.dispose();
        });
    }

    private boolean validarCampos() {
        if (txtNome.getText().trim().isEmpty() || txtCpf.getText().trim().isEmpty() || txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha Nome, CPF e E-mail.");
            return false;
        }
        return true;
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtNacionalidade.setText("");
        comboGenero.setSelectedIndex(0);
    }

    private JLabel criarLabel(String texto) {
        JLabel lbl = new JLabel(texto);
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbl.setForeground(new Color(11, 71, 32));
        return lbl;
    }

    private JTextField criarTextField() {
        JTextField txt = new JTextField();
        txt.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txt.setBorder(BorderFactory.createLineBorder(new Color(150, 220, 180), 1));
        return txt;
    }

    // ====================================================================
    // MÉTODOS ADICIONADOS PARA INTEGRAR COM O CONTROLLER SEM ERROS
    // ====================================================================
    public JTextField getTxtNome() { return txtNome; }
    public JTextField getTxtCpf() { return txtCpf; }
    public JTextField getTxtEmail() { return txtEmail; }
    public JTextField getTxtNacionalidade() { return txtNacionalidade; }
    public JComboBox<String> getComboGenero() { return comboGenero; }
    public JButton getBtnAdicionar() { return btnCadastrar; } 
    public JButton getBtnVisualizar() { return btnVerTabela; } 
    public JButton getBtnRemover() { return new JButton(); }
    public JTable getTable() { return new JTable(); }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new JanelaAutor().setVisible(true);
        });
    }
}

// ====================================================================
// CLASSE DA TABELA (Mantida intacta e sem alterações)
// ====================================================================
class JanelaTabelaAutor extends JFrame {

    private JTable table;

    public JanelaTabelaAutor() {
        setTitle("Capas Vivas - Lista de Autores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel(new MigLayout("fill, insets 25", "[grow]", "[grow][]"));
        contentPane.setBackground(new Color(235, 253, 242));
        setContentPane(contentPane);

        JLabel lblTitulo = new JLabel("Autores Cadastrados no Sistema");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setForeground(new Color(11, 71, 32));
        contentPane.add(lblTitulo, "wrap, gapbottom 10");

        table = new JTable(JanelaAutor.tableModelShared);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, "grow, wrap, gapbottom 15");

        JPanel panelAcoes = new JPanel(new MigLayout("insets 0", "[][][]", "[]"));
        panelAcoes.setOpaque(false);
        contentPane.add(panelAcoes, "align center");

        JButton btnEditar = criarBotaoTabela("Editar Selecionado", new Color(20, 110, 60));
        JButton btnRemover = criarBotaoTabela("Remover Autor", new Color(150, 40, 40));
        JButton btnVoltar = criarBotaoTabela("Voltar para o Cadastro", new Color(11, 71, 32));

        panelAcoes.add(btnEditar, "w 160!, h 38!");
        panelAcoes.add(btnRemover, "w 150!, h 38!");
        panelAcoes.add(btnVoltar, "w 180!, h 38!");

        btnRemover.addActionListener(e -> {
            int linhaSelecionada = table.getSelectedRow();
            if (linhaSelecionada >= 0) {
                int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover este autor?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirmacao == JOptionPane.YES_OPTION) {
                    JanelaAutor.tableModelShared.removeRow(linhaSelecionada);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um autor na tabela para remover.");
            }
        });

        btnEditar.addActionListener(e -> {
            int líneaSelecionada = table.getSelectedRow();
            if (líneaSelecionada >= 0) {
                new JanelaAutor(líneaSelecionada).setVisible(true);
                this.dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um autor na tabela para editar.");
            }
        });

        btnVoltar.addActionListener(e -> {
            new JanelaAutor().setVisible(true);
            this.dispose();
        });
    }

    private JButton criarBotaoTabela(String texto, Color cor) {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(cor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }
}