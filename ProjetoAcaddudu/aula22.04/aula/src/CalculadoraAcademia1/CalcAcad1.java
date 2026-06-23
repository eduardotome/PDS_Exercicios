package CalculadoraAcademia1;

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
		contentPane.add(lblNewLabel_3, "cell 1 3,alignx right");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Básico");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
			
			
			
			
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton, "cell 2 3,alignx left");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Intermediário");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_1, "cell 5 3,alignx left,aligny baseline");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Premium");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_2, "cell 8 3,alignx left");
		
		JLabel lblNewLabel_4 = new JLabel("Duração:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_4, "cell 1 4,alignx right");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Mensal");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_3, "cell 2 4,alignx left");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Semestral");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_4, "cell 5 4,alignx left");
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Anual");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_5, "cell 8 4,alignx left");
		
		JLabel lblNewLabel_5 = new JLabel("Frequência Semanal:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_5, "cell 1 5,alignx right");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("2 vezes");
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_6, "cell 2 5,alignx left");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("3 vezes");
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_7, "cell 5 5");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("5 vezes");
		buttonGroup_2.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(rdbtnNewRadioButton_8, "cell 8 5");
		
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

				        if (!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_1.isSelected() && !rdbtnNewRadioButton_2.isSelected()) {
				            javax.swing.JOptionPane.showMessageDialog(null, "Selecione um plano!");
				            return;
				        }

				        if (!rdbtnNewRadioButton_3.isSelected() && !rdbtnNewRadioButton_4.isSelected() && !rdbtnNewRadioButton_5.isSelected()) {
				            javax.swing.JOptionPane.showMessageDialog(null, "Selecione a duração!");
				            return;
				        }

				        if (!rdbtnNewRadioButton_6.isSelected() && !rdbtnNewRadioButton_7.isSelected() && !rdbtnNewRadioButton_8.isSelected()) {
				            javax.swing.JOptionPane.showMessageDialog(null, "Selecione a frequência!");
				            return;
				        }

				        
				        double valor = 0;

				        if (rdbtnNewRadioButton.isSelected()) { 
				            valor = 80;
				        } else if (rdbtnNewRadioButton_1.isSelected()) { 
				            valor = 120;
				        } else if (rdbtnNewRadioButton_2.isSelected()) { 
				            valor = 180;
				        }

				       
				        if (rdbtnNewRadioButton_7.isSelected()) { 
				            valor += valor * 0.20;
				        } else if (rdbtnNewRadioButton_8.isSelected()) { 
				            valor += valor * 0.50;
				        }

				        
				        if (rdbtnNewRadioButton_4.isSelected()) {
				            valor -= valor * 0.10;
				        } else if (rdbtnNewRadioButton_5.isSelected()) { 
				            valor -= valor * 0.20;
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
