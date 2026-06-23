package ComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CalcAcad1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField textField = new JTextField();
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcAcad1 frame = new CalcAcad1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcAcad1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]", "[][grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel, "cell 0 0 12 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1, "flowx,cell 0 1 2 1,alignx right");
		contentPane.add(textField, "cell 2 1 4 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2, "cell 0 2 2 1,alignx right");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 2 4 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo do Plano:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_3, "cell 1 3,alignx trailing");
		
		JComboBox ComboBoxPlano = new JComboBox();
		ComboBoxPlano.setModel(new DefaultComboBoxModel(TipoDePlano.values()));
		contentPane.add(ComboBoxPlano, "cell 2 3 7 1,growx");
		
		JLabel lblNewLabel_4 = new JLabel("Duração:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_4, "cell 1 4,alignx trailing");
		
		JComboBox ComboBoxDuracao = new JComboBox();
		ComboBoxDuracao.setModel(new DefaultComboBoxModel(Duracao.values()));
		contentPane.add(ComboBoxDuracao, "cell 2 4 7 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Frequência Semanal:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_5, "cell 1 5,alignx trailing");
		
		JComboBox ComboBoxFrequencia = new JComboBox();
		ComboBoxFrequencia.setModel(new DefaultComboBoxModel(FrenquenciaSemanal.values()));
		contentPane.add(ComboBoxFrequencia, "cell 2 5 7 1,growx");
		
		JLabel lblNewLabel_7 = new JLabel("");
		contentPane.add(lblNewLabel_7, "cell 6 7");

		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				    	if (textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
				            javax.swing.JOptionPane.showMessageDialog(null, "Preencha nome e telefone!");
				            return;
				        }
				    	
				    	double valor = 0;
				    	
				    	Duracao Dur = (Duracao) ComboBoxDuracao.getSelectedItem();
				    	FrenquenciaSemanal Frequencia = (FrenquenciaSemanal) ComboBoxFrequencia.getSelectedItem();
				    	TipoDePlano Plano = (TipoDePlano) ComboBoxPlano.getSelectedItem();
				    	
				    	
				    	if(Dur == Duracao.Mensal) {
				    		valor = 80;
							
						}else if(Dur == Duracao.Semestral) {
							valor = 120;
		
						}else if(Dur == Duracao.Anual) {
							valor = 180;
						}
				    	
				    	
				    	//
				    	
				    	if(Frequencia == FrenquenciaSemanal.TresvezesSemanais) {
				    		valor = (valor * 0.20) + valor;
				    	}
				    	
				    	else if(Frequencia == FrenquenciaSemanal.CincoVezesSemanais) {
				    		valor = (valor * 0.50) + valor;
				    	}
				    	
				    	//
				    	
				    	if(Plano == TipoDePlano.Intermediario) {
				    		valor = (valor * 0.10) + valor;
				    		
				    	}else if(Plano == TipoDePlano.Preimium) {
				    		valor = (valor * 0.20) + valor;
				    	}
				    	

				            
				        
				        lblNewLabel_7.setText("R$"+ valor);
				    }
				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton, "cell 2 7");
		
		JLabel lblNewLabel_6 = new JLabel("Valor Final:");
		contentPane.add(lblNewLabel_6, "cell 5 7");
		
		
	}

}