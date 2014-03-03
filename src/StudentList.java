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
		
	private ArrayList<Student> students;
	
	// GUI components
	private JPanel rootPanel;
	private JPanel headerPanel;
	private CustomTextField searchTextField;
	private JScrollPane studentsList;
	
	private JPanel studentInfo;
	private SpringLayout studentInfoLayout;
	
	private JLabel nameLabel;
	
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
		
		students = QueryExecutor.GetStudents();
		String[] names = new String[students.size()];
		
		for (int i = 0; i < students.size(); i++)
		{
			names[i] = 
				(i + 1) + " - " +
				students.get(i).secondName + " " + 
				students.get(i).firstName + " " + 
				students.get(i).middleName;
		}
		
		
		JList list = new JList(names);
		list.setBorder(new EmptyBorder(5, 5, 5, 5));
		list.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		list.setVisibleRowCount(20);
		list.setSize(this.getWidth(), this.getHeight());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
		
        studentsList = new JScrollPane(list);
        studentsList.setBorder(new EmptyBorder(0, 0, 0, 0));
        rootPanel.add(studentsList, BorderLayout.WEST);
        
        studentInfo = new JPanel();
        studentInfoLayout = new SpringLayout();
        
        studentInfo.setLayout(studentInfoLayout);
        rootPanel.add(studentInfo, BorderLayout.CENTER);
        
        JLabel nameLabelHint = new JLabel("Имя:");
        nameLabelHint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        studentInfoLayout.putConstraint(SpringLayout.NORTH, nameLabelHint, 10, SpringLayout.NORTH, studentInfo);
        studentInfoLayout.putConstraint(SpringLayout.WEST, nameLabelHint, 10, SpringLayout.WEST, studentInfo);
        studentInfo.add(nameLabelHint);
        
        nameLabel = new JLabel("");
        studentInfoLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.NORTH, nameLabelHint);
        studentInfoLayout.putConstraint(SpringLayout.WEST, nameLabel, 6, SpringLayout.EAST, nameLabelHint);
        nameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        studentInfo.add(nameLabel);
        
        /*namePanel = new JPanel();
        namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.X_AXIS));
        
        JLabel nameLabelHint = new JLabel("Имя: ");
        nameLabel = new JLabel("");
        
        namePanel.add(nameLabelHint);
        namePanel.add(nameLabel);
        studentInfo.add(namePanel);
        
        panel = new JPanel();
        studentInfo.add(panel);*/
        
		this.FillList();
	}
	
	// Listens to the list
    public void valueChanged(ListSelectionEvent e) 
    {
        JList list = (JList)e.getSource();
        int selectedIndex =  list.getSelectedIndex();
        
        Student student = this.students.get(selectedIndex);
        this.nameLabel.setText(student.secondName + " " + student.firstName + " " + student.middleName);
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
