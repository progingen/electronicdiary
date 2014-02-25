import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;


public class StudentList extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JList studentsList;

	public StudentList() 
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0421\u043F\u0438\u0441\u043E\u043A \u0441\u0442\u0443\u0434\u0435\u043D\u0442\u043E\u0432");
		label.setBounds(10, 11, 107, 14);
		contentPane.add(label);
		
		searchField = new JTextField();
		searchField.setBounds(212, 8, 212, 20);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		studentsList = new JList();
		studentsList.setBounds(10, 36, 414, 215);
		contentPane.add(studentsList);
		
		this.FillList();
	}
	
	private void FillList()
	{
		String dataDiriectory = System.getProperty("user.dir") + "\\data\\";
		String studentsListFileName = "students.json";
		
		String content = null;
		File file = new File(dataDiriectory + studentsListFileName);
		
		try 
		{
			FileReader fileReader = new FileReader(file);
			
			char[] chars = new char[(int)file.length()];
			fileReader.read(chars);
			content = new String(chars);
			
			fileReader.close();
		}
		catch (IOException ex) {
			System.out.print(ex.getMessage());
		}

		System.out.print(content);
	}
}
