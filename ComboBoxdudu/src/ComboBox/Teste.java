package ComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
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
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Meses");
		contentPane.add(lblNewLabel, "cell 0 1");
		
		JComboBox ComboBoxMeses = new JComboBox(); //usado para 
		ComboBoxMeses.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro"}));
		contentPane.add(ComboBoxMeses, "cell 2 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Combustivel");
		contentPane.add(lblNewLabel_1, "cell 0 3");
		
		JComboBox <Tipo_Combustivel>ComboBoxCombustivel = new JComboBox<Tipo_Combustivel>(); //usado para 
		ComboBoxCombustivel.addItem(Tipo_Combustivel.Diesel);
		ComboBoxCombustivel.addItem(Tipo_Combustivel.Gasolina);
		
		contentPane.add(ComboBoxCombustivel, "cell 2 3,growx");
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mesesSelecionado = (String) ComboBoxMeses.getSelectedItem();
				
				Tipo_Combustivel tipo = (Tipo_Combustivel) ComboBoxCombustivel.getSelectedItem();
				
				if(mesesSelecionado.equals("Janeiro")) {
					if(tipo == Tipo_Combustivel.Diesel) {
						
					}
				}
				
				
				
			}
		});
		contentPane.add(btnNewButton, "cell 2 5");

	}

}
