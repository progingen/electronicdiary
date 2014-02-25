import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton openLoadButton = new JButton("\u0420\u0430\u0441\u0447\u0435\u0442 \u043D\u0430\u0433\u0440\u0443\u0437\u043A\u0438 \u043D\u0430 \u043A\u0430\u0444\u0435\u0434\u0440\u044B \u0438 \u0444\u0430\u043A\u0443\u043B\u044C\u0442\u0435\u0442");
		openLoadButton.setBounds(10, 11, 364, 23);
		openLoadButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ChairAndFacultyLoad chairAndFacultyLoad = new ChairAndFacultyLoad();
				chairAndFacultyLoad.setVisible(true);
			}
		});
		
		contentPane.add(openLoadButton);
		
		JButton button_1 = new JButton("\u0420\u0430\u0441\u0447\u0435\u0442 \u0443\u0447\u0435\u0431\u043D\u043E\u0439 \u043D\u0430\u0433\u0440\u0443\u0437\u043A\u0438 \u043F\u0440\u0435\u043F\u043E\u0434\u0430\u0432\u0430\u0442\u0435\u043B\u0435\u0439");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				form3 nf3 = new form3();
				nf3.setVisible(true);	
			}
		});
		button_1.setBounds(10, 45, 364, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u0418\u043D\u0434\u0438\u0432\u0438\u0434\u0443\u0430\u043B\u044C\u043D\u044B\u0439 \u043F\u043B\u0430\u043D \u043F\u0440\u0435\u043F\u043E\u0434\u0430\u0432\u0430\u0442\u0435\u043B\u044F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form4 nf4 = new form4();
				nf4.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 79, 364, 23);
		contentPane.add(btnNewButton);
		
		JButton button_2 = new JButton("\u0417\u0430\u044F\u0432\u043B\u0435\u043D\u0438\u0435");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form5 nf5 = new form5();
				nf5.setVisible(true);
			}
		});
		button_2.setBounds(10, 113, 364, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u042D\u043A\u0437\u0430\u043C\u0435\u043D\u0430\u0446\u0438\u043E\u043D\u043D\u0430\u044F \u0432\u0435\u0434\u043E\u043C\u043E\u0441\u0442\u044C");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form6 nf6 = new form6();
				nf6.setVisible(true);
			}
		});
		button_3.setBounds(10, 147, 364, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u0412\u044B\u043F\u0438\u0441\u043A\u0430 \u0438\u0437 \u0434\u0438\u043F\u043B\u043E\u043C\u0430");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form7 nf7 = new form7();
				nf7.setVisible(true);
			}
		});
		button_4.setBounds(10, 181, 364, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("\u0420\u0430\u0441\u043F\u0438\u0441\u0430\u043D\u0438\u0435");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form8 nf8 = new form8();
				nf8.setVisible(true);
			}
		});
		button_5.setBounds(10, 215, 364, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u041E\u0442\u0447\u0435\u0442 \u043E \u0440\u0430\u0431\u043E\u0442\u0435 \u043F\u0440\u0435\u043F\u043E\u0434\u0430\u0432\u0430\u0442\u0435\u043B\u0435\u0439");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form9 nf9 = new form9();
				nf9.setVisible(true);
			}
		});
		button_6.setBounds(10, 249, 364, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("\u0418\u043D\u0434\u0438\u0432\u0438\u0434\u0443\u0430\u043B\u044C\u043D\u044B\u0435 \u0434\u0430\u043D\u043D\u044B\u0435 \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u0430 \u043F\u043E \u0443\u0447\u0435\u0431\u043D\u043E\u0439 \u0440\u0430\u0431\u043E\u0442\u0435");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form10 nf10 = new form10();
				nf10.setVisible(true);
			}
		});
		button_7.setBounds(10, 283, 364, 23);
		contentPane.add(button_7);
		
		JButton openStudentListButton = new JButton("\u0421\u043F\u0438\u0441\u043E\u043A \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432");
		openStudentListButton.setBounds(10, 317, 364, 23);
		openStudentListButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				StudentList studentListForm = new StudentList();
				studentListForm.setVisible(true);
			}
		});
		
		contentPane.add(openStudentListButton);
	}
}
