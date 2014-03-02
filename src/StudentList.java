import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;

import structures.Student;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;


public class StudentList extends JFrame implements ListSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList list;
	
	public StudentList() 
	{
		setTitle("Список студентов");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 730, 445);
		
		ArrayList<Student> students = QueryExecutor.GetStudents();
		String[] names = new String[students.size()];
		
		for (int i = 0; i < students.size(); i++)
		{
			names[i] = 
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
		
        JScrollPane listScrollPane = new JScrollPane(list);
        getContentPane().add(listScrollPane, BorderLayout.BEFORE_FIRST_LINE);                
        
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
