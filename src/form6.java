import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;


public class form6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form6 frame = new form6();
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
	public form6() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 800, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u042D\u043A\u0437\u0430\u043C\u0435\u043D\u0430\u0446\u0438\u043E\u043D\u043D\u0430\u044F \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(10, 10, 250, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0424\u0430\u043A\u0443\u043B\u044C\u0442\u0435\u0442");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(10, 41, 100, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0421\u043F\u0435\u0446\u0438\u0430\u043B\u044C\u043D\u043E\u0441\u0442\u044C");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_2.setBounds(10, 66, 100, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0414\u0438\u0441\u0446\u0438\u043F\u043B\u0438\u043D\u0430");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_3.setBounds(10, 91, 100, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0414\u0430\u0442\u0430");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_4.setBounds(10, 116, 100, 20);
		contentPane.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0438 \u0438 \u0418\u0422"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setBounds(120, 41, 300, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "\u041F\u0440\u0438\u043A\u043B\u0430\u0434\u043D\u0430\u044F \u043C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430 \u0438 \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u0438\u043A\u0430", "\u0424\u0443\u043D\u0434\u0430\u043C\u0435\u043D\u0442\u0430\u043B\u044C\u043D\u0430\u044F \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u0438\u043A\u0430 \u0438 \u0418\u0422", "\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430 \u0438 \u043A\u043E\u043C\u043F\u044C\u044E\u0442\u0435\u0440\u043D\u044B\u0435 \u043D\u0430\u0443\u043A\u0438", "\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u043D\u0430\u044F \u0438\u043D\u0436\u0435\u043D\u0435\u0440\u0438\u044F"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_1.setBounds(120, 67, 300, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "\u0421\u0438\u0441\u0442\u0435\u043C\u043D\u043E\u0435 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435", "\u041E\u041E\u041F", "\u0410\u043D\u0433\u043B\u0438\u0439\u0441\u043A\u0438\u0439 \u044F\u0437\u044B\u043A", "\u041A\u043E\u043C\u043F\u044C\u044E\u0442\u0435\u0440\u043D\u044B\u0439 \u0438 \u0441\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0430\u043D\u0430\u043B\u0438\u0437 \u0434\u0430\u043D\u043D\u044B\u0445"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_2.setBounds(120, 92, 300, 20);
		contentPane.add(comboBox_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(120, 117, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_5 = new JLabel("\u0421\u0435\u043C\u0435\u0441\u0442\u0440");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_5.setBounds(430, 45, 85, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0413\u0440\u0443\u043F\u043F\u0430");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_6.setBounds(430, 70, 85, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u042D\u043A\u0437\u0430\u043C\u0435\u043D\u0430\u0442\u043E\u0440");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(430, 95, 85, 20);
		contentPane.add(label_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "\u041F\u0435\u0440\u0432\u044B\u0439", "\u0412\u0442\u043E\u0440\u043E\u0439"}));
		comboBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_3.setBounds(525, 42, 135, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "101", "102", "103", "104", "105", "201", "202", "203", "204", "205", "301", "302", "303", "304", "305", "401", "402", "403", "404", "405", "101\u041C (\u041C\u0430\u0433\u0438\u0441\u0442\u0440\u044B)", "102\u041C (\u041C\u0430\u0433\u0438\u0441\u0442\u0440\u044B)", "201\u041C (\u041C\u0430\u0433\u0438\u0441\u0442\u0440\u044B)", "202\u041C (\u041C\u0430\u0433\u0438\u0441\u0442\u0440\u044B)"}));
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_4.setBounds(525, 67, 135, 20);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "\u0420\u0443\u0431\u0446\u043E\u0432\u0430 \u041E.\u0412.", "\u0424\u0438\u0440\u0441\u043E\u0432\u0430 \u0421.\u0410.", "\u0428\u0430\u043C\u0430\u0435\u0432 \u0410.\u0412."}));
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox_5.setBounds(525, 92, 135, 20);
		contentPane.add(comboBox_5);
		
		JButton button = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C \u0441\u043F\u0438\u0441\u043E\u043A");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setBounds(670, 41, 104, 20);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBounds(670, 65, 104, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u0412 \u043F\u0435\u0447\u0430\u0442\u044C");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_2.setBounds(670, 90, 104, 23);
		contentPane.add(button_2);
		
		JLabel lblNn = new JLabel("\u2116 n/n");
		lblNn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNn.setBounds(10, 160, 40, 20);
		contentPane.add(lblNn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 191, 40, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_8 = new JLabel("\u0424\u0418\u041E \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u0430");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_8.setBounds(60, 161, 200, 20);
		contentPane.add(label_8);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setBounds(60, 191, 200, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_9 = new JLabel("\u041E\u0442\u043C\u0435\u0442\u043A\u0430 \u043E \u0437\u0430\u0447\u0435\u0442\u0435");
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_9.setBounds(270, 164, 120, 20);
		contentPane.add(label_9);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "\u0421\u0434\u0430\u043D\u044B", "\u041D\u0435 \u0441\u0434\u0430\u043D 1", "\u041D\u0435 \u0441\u0434\u0430\u043D\u043E 2", "\u041D\u0435 \u0441\u0434\u0430\u043D\u043E 3 \u0438\u043B\u0438 \u0431\u043E\u043B\u0435\u0435"}));
		comboBox_6.setBounds(270, 191, 120, 20);
		contentPane.add(comboBox_6);
		
		JLabel label_10 = new JLabel("\u0411\u0430\u043B\u043B\u044B (\u0411\u0410\u0420\u0421)");
		label_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_10.setBounds(400, 164, 100, 20);
		contentPane.add(label_10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setBounds(400, 191, 100, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_11 = new JLabel("\u041E\u0446\u0435\u043D\u043A\u0430");
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_11.setBounds(510, 164, 85, 20);
		contentPane.add(label_11);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "\u041D\u0435 \u044F\u0432\u0438\u043B\u0441\u044F", "\u041D\u0435\u0443\u0434\u043E\u0432\u043B\u0435\u0442\u0432\u043E\u0440\u0438\u0442\u0435\u043B\u044C\u043D\u043E", "\u0423\u0434\u043E\u0432\u043B\u0435\u0442\u0432\u043E\u0440\u0438\u0442\u0435\u043B\u044C\u043D\u043E", "\u0425\u043E\u0440\u043E\u0448\u043E", "\u041E\u0442\u043B\u0438\u0447\u043D\u043E"}));
		comboBox_7.setBounds(510, 191, 85, 20);
		contentPane.add(comboBox_7);
		
		JLabel label_12 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0437\u0430\u0447\u0435\u0442\u043A\u0438");
		label_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_12.setBounds(605, 164, 100, 20);
		contentPane.add(label_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(605, 191, 100, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_13 = new JLabel("\u041F\u043E\u0434\u043F\u0438\u0441\u044C");
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_13.setBounds(715, 164, 59, 20);
		contentPane.add(label_13);
	}
}
