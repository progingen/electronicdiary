import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class form3 extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form3 frame = new form3();
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
	public form3() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 573, 372);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0418\u043C\u044F");
		label.setBounds(10, 11, 46, 14);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(164, 8, 175, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0421\u043A\u043E\u043B\u044C\u043A\u043E \u0441\u043E\u0431\u0430\u043A?");
		label_1.setBounds(10, 36, 94, 14);
		getContentPane().add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 33, 175, 20);
		getContentPane().add(comboBox);
	}
}
