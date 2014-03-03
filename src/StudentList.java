import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import java.awt.*;

import structures.*;
import components.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class StudentList extends JFrame implements ListSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private ArrayList<Student> students;
	
	// GUI components
	private CustomTextField searchTextField;
	private JList studentsList;
	private JScrollPane listScrollPane;
	
	private JLabel nameLabel;
	
	public StudentList() 
	{
		setTitle("Список студентов");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 730, 445);
		
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(new BorderLayout(10, 10));
		rootPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		students = QueryExecutor.GetStudents();
		this.ShowList(rootPanel);
		this.ShowHeader(rootPanel);
		this.ShowStudentInfo(rootPanel);
		
		getContentPane().add(rootPanel, BorderLayout.CENTER);
	}
	
	private void ShowHeader(JPanel rootPanel)
	{
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
		
		searchTextField = new CustomTextField(30);
		searchTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
		searchTextField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		searchTextField.setBorder(new EmptyBorder(5, 5, 5, 5));
		searchTextField.setPlaceholder("Поиск...");
		
		headerPanel.add(searchTextField);
		rootPanel.add(headerPanel, BorderLayout.NORTH);
	}
	
	private void ShowList(JPanel rootPanel)
	{
		String[] names = new String[students.size()];
		
		for (int i = 0; i < students.size(); i++)
		{
			names[i] = 
				(i + 1) + " - " +
				students.get(i).secondName + " " + 
				students.get(i).firstName + " " + 
				students.get(i).middleName;
		}
		
		studentsList = new JList(names);
		studentsList.setBorder(new EmptyBorder(5, 5, 5, 5));
		studentsList.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		studentsList.setVisibleRowCount(20);
		studentsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		studentsList.setSelectedIndex(0);
		studentsList.addListSelectionListener(this);
		
        listScrollPane = new JScrollPane(studentsList);
        listScrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        rootPanel.add(listScrollPane, BorderLayout.WEST);
	}
	
	private void UpdateList(ArrayList<Integer> indices)
	{
		
	}
	
	private void ShowStudentInfo(JPanel rootPanel)
	{
		JPanel studentInfo = new JPanel();
		SpringLayout studentInfoLayout = new SpringLayout();
        
        studentInfo.setLayout(studentInfoLayout);
        
        JLabel nameLabelHint = new JLabel("Имя:");
        nameLabelHint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        studentInfoLayout.putConstraint(SpringLayout.NORTH, nameLabelHint, 10, SpringLayout.NORTH, studentInfo);
        studentInfoLayout.putConstraint(SpringLayout.WEST, nameLabelHint, 10, SpringLayout.WEST, studentInfo);
        studentInfo.add(nameLabelHint);
        
        nameLabel = new JLabel("sdfdf");
        nameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        studentInfoLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, nameLabelHint);
        studentInfoLayout.putConstraint(SpringLayout.WEST, nameLabel, 35, SpringLayout.EAST, nameLabelHint);
        studentInfo.add(nameLabel);
        
        rootPanel.add(studentInfo, BorderLayout.CENTER);
	}
	
	// Listens to the list
    public void valueChanged(ListSelectionEvent e) 
    {
        JList list = (JList)e.getSource();
        int selectedIndex =  list.getSelectedIndex();
        
        Student student = this.students.get(selectedIndex);
        this.nameLabel.setText(student.secondName + " " + student.firstName + " " + student.middleName);
    }
}
