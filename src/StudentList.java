import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import java.awt.*;

import structures.*;
import components.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;


public class StudentList extends JFrame implements ListSelectionListener {

	
	private static final long serialVersionUID = 1L;
		
	private ArrayList<Student> students;
	
	private CustomTextField searchTextField;
	private String previousSearchString = "";
	private JList studentsList;
	
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
		searchTextField.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
				
				nameLabel.setText(arg0.paramString());
			}
			
			public void inputMethodTextChanged(InputMethodEvent arg0) {
				
				nameLabel.setText(searchTextField.getText());
			}
		});
		searchTextField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		searchTextField.setBorder(new EmptyBorder(5, 5, 5, 5));
		searchTextField.setPlaceholder("Поиск...");
		/*searchTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				String stringToFind = searchTextField.getText();
				
				if (previousSearchString.equals(stringToFind))
					return;
				
				String[] names = null;
				
				if (stringToFind.equals(""))
				{
					names = new String[students.size()];
					
					for (int i = 0; i < students.size(); i++)
					{
						Student student = students.get(i);
						names[i] = student.secondName + " " + student.firstName + " " + student.middleName;
					}
				}
				else
				{
					ArrayList<String> tempArray = new ArrayList<String>();
					
					for (int i = 0; i < students.size(); i++)
					{						
						Student student = students.get(i);
						String name =  student.secondName + " " + student.firstName + " " + student.middleName;
							
						if (FindSubstring(name, stringToFind))
							tempArray.add(name);
					}
					
					names = new String[tempArray.size()];
					tempArray.toArray(names);
				}
				
				UpdateList(names);
				previousSearchString = stringToFind;
			}
		});*/
		
		headerPanel.add(searchTextField);
		rootPanel.add(headerPanel, BorderLayout.NORTH);
	}
	
	private void ShowList(JPanel rootPanel)
	{
		String[] names = new String[students.size()];
		
		for (int i = 0; i < students.size(); i++)
		{
			names[i] = 
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
			
		JScrollPane listScrollPane = new JScrollPane(studentsList);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    listScrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
	    rootPanel.add(listScrollPane, BorderLayout.WEST);
	}
	
	private void UpdateList(String[] names)
	{
		studentsList.setListData(names);
	}
	
	private void ShowStudentInfo(JPanel rootPanel)
	{
		JPanel studentInfo = new JPanel();
		SpringLayout studentInfoLayout = new SpringLayout();
        
        studentInfo.setLayout(studentInfoLayout);
        
        nameLabel = new JLabel("sdfdf");
        studentInfoLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, studentInfo);
        studentInfoLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, studentInfo);
        nameLabel.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        studentInfo.add(nameLabel);
        
        rootPanel.add(studentInfo, BorderLayout.CENTER);
        
        JLabel birthdayLabel = new JLabel("Дата рождения: 18.06.1994г. (19 лет)");
        birthdayLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        studentInfoLayout.putConstraint(SpringLayout.NORTH, birthdayLabel, 6, SpringLayout.SOUTH, nameLabel);
        studentInfoLayout.putConstraint(SpringLayout.WEST, birthdayLabel, 0, SpringLayout.WEST, nameLabel);
        studentInfo.add(birthdayLabel);
        
        JLabel label = new JLabel("Группа: 205");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        studentInfoLayout.putConstraint(SpringLayout.NORTH, label, 6, SpringLayout.SOUTH, birthdayLabel);
        studentInfoLayout.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, nameLabel);
        studentInfo.add(label);
	}
	
	// Listens to the list
    public void valueChanged(ListSelectionEvent e) 
    {
        JList list = (JList)e.getSource();
        int selectedIndex =  list.getSelectedIndex();
        
        Student student = this.students.get(selectedIndex);
        this.nameLabel.setText(student.secondName + " " + student.firstName + " " + student.middleName);
    }
    
    private boolean FindSubstring(String src, String key)
    {
    	if (src.length() < key.length())
    		return false;
    	
    	src = src.toLowerCase();
    	key = key.toLowerCase();
    	
    	int keyLength = key.length();
    	int length = src.length() - key.length();
    	
    	for (int i = 0; i < length; )
    	{
    		if (src.charAt(i) == key.charAt(0))
    		{
    			i++;
    			
    			for (int j = 1; j < keyLength || i < length; j++)
    			{
    				if (src.charAt(i) != key.charAt(j))
    					break;

    				if (j + 1 == keyLength)
    					return true;
    					
    				i++;
    			}
    		}
    		else 
    			i++;
    	}
    	
    	return false;
    }
}
