import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import java.awt.*;

import structures.*;
import components.*;


public class StudentList extends JFrame implements ListSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	// GUI components
	private JPanel rootPanel;
	private JPanel headerPanel;
	private CustomTextField searchTextField;
	private JList list;
	
	public StudentList() 
	{
		setTitle("Список студентов");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 730, 445);
		
		rootPanel = new JPanel();
		rootPanel.setLayout(new BorderLayout(10, 10));
		rootPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(rootPanel, BorderLayout.CENTER);
		
		headerPanel = new JPanel();
		headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
		
		searchTextField = new CustomTextField(30);
		searchTextField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		searchTextField.setBorder(new EmptyBorder(5, 5, 5, 5));
		searchTextField.setPlaceholder("Поиск...");
		
		headerPanel.add(searchTextField);
		rootPanel.add(headerPanel, BorderLayout.NORTH);
		
		ArrayList<Student> students = QueryExecutor.GetStudents();
		String[] names = new String[students.size()];
		
		for (int i = 0; i < students.size(); i++)
		{
			names[i] = 
				(i + 1) + " - " +
				students.get(i).secondName + " " + 
				students.get(i).firstName + " " + 
				students.get(i).middleName;
		}
		
		
		list = new JList(names);
		list.setVisibleRowCount(20);
		list.setSize(this.getWidth(), this.getHeight());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
		
        JScrollPane studentsList = new JScrollPane(list);
        rootPanel.add(studentsList, BorderLayout.WEST);     
        
        JPanel studentInfo = new JPanel();
        rootPanel.add(studentInfo, BorderLayout.CENTER);
        
        // test comment
		this.FillList();
	}
	
	//Listens to the list
    public void valueChanged(ListSelectionEvent e) 
    {
        // JList list = (JList)e.getSource();
    }
	
	private void FillList()
	{
		/*ArrayList<Student> students = QueryExecutor.GetStudents();
		
		for (int i = 0; i < students.size(); i++)
		{
			JLabel name = new JLabel();
			name.setText(students.get(i).name);
			name.setBounds(0, 0, 40, 200);
			
			this.scrollPane.add(name);
		}*/
	}
}
