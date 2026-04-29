import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAcademia extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private final ButtonGroup grupoPlano = new ButtonGroup();
    private final ButtonGroup grupoDuracao = new ButtonGroup();
    private final ButtonGroup grupoFreq = new ButtonGroup();

    private JRadioButton rbBasico;
    private JRadioButton rbInter;
    private JRadioButton rbPremium;
    private JRadioButton rbMensal;
    private JRadioButton rbSemestral;
    private JRadioButton rbAnual;
    private JRadioButton rb2x;
    private JRadioButton rb3x;
    private JRadioButton rb5x;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaAcademia frame = new TelaAcademia();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TelaAcademia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 20);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 20);
        contentPane.add(txtNome);

        JLabel lblTel = new JLabel("Telefone:");
        lblTel.setBounds(20, 50, 80, 20);
        contentPane.add(lblTel);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 50, 200, 20);
        contentPane.add(txtTelefone);

        // Plano
        rbBasico = new JRadioButton("Básico");
        rbBasico.setBounds(20, 90, 100, 20);
        contentPane.add(rbBasico);
        grupoPlano.add(rbBasico);

        rbInter = new JRadioButton("Intermediário");
        rbInter.setBounds(120, 90, 130, 20);
        contentPane.add(rbInter);
        grupoPlano.add(rbInter);

        rbPremium = new JRadioButton("Premium");
        rbPremium.setBounds(270, 90, 100, 20);
        contentPane.add(rbPremium);
        grupoPlano.add(rbPremium);

        // Duração
        rbMensal = new JRadioButton("Mensal");
        rbMensal.setBounds(20, 120, 100, 20);
        contentPane.add(rbMensal);
        grupoDuracao.add(rbMensal);

        rbSemestral = new JRadioButton("Semestral");
        rbSemestral.setBounds(120, 120, 120, 20);
        contentPane.add(rbSemestral);
        grupoDuracao.add(rbSemestral);

        rbAnual = new JRadioButton("Anual");
        rbAnual.setBounds(270, 120, 100, 20);
        contentPane.add(rbAnual);
        grupoDuracao.add(rbAnual);

        // Frequência
        rb2x = new JRadioButton("2x");
        rb2x.setBounds(20, 150, 100, 20);
        contentPane.add(rb2x);
        grupoFreq.add(rb2x);

        rb3x = new JRadioButton("3x");
        rb3x.setBounds(120, 150, 100, 20);
        contentPane.add(rb3x);
        grupoFreq.add(rb3x);

        rb5x = new JRadioButton("5x");
        rb5x.setBounds(270, 150, 100, 20);
        contentPane.add(rb5x);
        grupoFreq.add(rb5x);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(20, 200, 120, 30);
        contentPane.add(btnCalcular);

        lblResultado = new JLabel("Valor final: ");
        lblResultado.setBounds(160, 200, 250, 30);
        contentPane.add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {

        if (txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha tudo!");
            return;
        }

        String plano = rbBasico.isSelected() ? "basico"
                : rbInter.isSelected() ? "inter"
                : rbPremium.isSelected() ? "premium" : "";

        String freq = rb2x.isSelected() ? "2x"
                : rb3x.isSelected() ? "3x"
                : rb5x.isSelected() ? "5x" : "";

        String duracao = rbMensal.isSelected() ? "mensal"
                : rbSemestral.isSelected() ? "semestral"
                : rbAnual.isSelected() ? "anual" : "";

        double valor = PlanoAcademia.calcular(plano, freq, duracao);

        lblResultado.setText("Valor final: R$ " + valor);
    }
}