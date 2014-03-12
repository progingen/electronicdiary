import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable.PrintMode;
import javax.swing.JButton;


public class form7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form7 frame = new form7();
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
	public form7() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0412\u044B\u043F\u0438\u0441\u043A\u0430 \u0438\u0437 \u0434\u0438\u043F\u043B\u043E\u043C\u0430");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 160, 20);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u0424\u0418\u041E \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u0430");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label.setBounds(10, 42, 100, 20);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(120, 42, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0424\u0430\u043A\u0443\u043B\u044C\u0442\u0435\u0442");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(10, 62, 100, 20);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 62, 200, 20);
		contentPane.add(comboBox);
		
		JLabel label_2 = new JLabel("\u0421\u043F\u0435\u0446\u0438\u0430\u043B\u044C\u043D\u043E\u0441\u0442\u044C");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_2.setBounds(10, 82, 100, 20);
		contentPane.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(120, 82, 200, 20);
		contentPane.add(comboBox_1);
		
		JLabel label_3 = new JLabel("\u0424\u043E\u0440\u043C\u0430 \u043E\u0431\u0443\u0447\u0435\u043D\u0438\u044F");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_3.setBounds(10, 102, 100, 20);
		contentPane.add(label_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(120, 102, 200, 20);
		contentPane.add(comboBox_2);
		
		JLabel label_4 = new JLabel("\u0421\u0440\u043E\u043A \u043E\u0431\u0443\u0447\u0435\u043D\u0438\u044F");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_4.setBounds(10, 122, 100, 20);
		contentPane.add(label_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_3.setBounds(120, 122, 200, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblNn = new JLabel("\u2116 n/n");
		lblNn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNn.setBounds(10, 153, 40, 20);
		contentPane.add(lblNn);
		
		JLabel label_5 = new JLabel("\u0414\u0438\u0441\u0438\u043F\u043B\u0438\u043D\u0430");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_5.setBounds(60, 153, 110, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u041E\u0442\u0447\u0435\u0442\u043D\u043E\u0441\u0442\u044C");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_6.setBounds(180, 153, 96, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u041E\u0446\u0435\u043D\u043A\u0430");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(286, 153, 80, 20);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u0411\u0430\u043B\u043B\u044B (\u0411\u0410\u0420\u0421)");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_8.setBounds(376, 153, 98, 20);
		contentPane.add(label_8);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setBounds(10, 175, 40, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_4.setBounds(60, 175, 110, 20);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_5.setBounds(180, 175, 96, 20);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_6.setBounds(286, 175, 80, 20);
		contentPane.add(comboBox_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setBounds(376, 175, 98, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setBounds(330, 42, 100, 20);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0412 \u043F\u0435\u0447\u0430\u0442\u044C");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBounds(330, 62, 100, 20);
		contentPane.add(button_1);
	}
}
