package com.prachi.ui;

import com.prachi.dao.StudentDAO;
import com.prachi.model.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JFrame frame;
    private JTextField nameField, ageField, courseField, emailField;

    public StudentForm() {
        frame = new JFrame("Student Management System");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 20, 165, 25);
        frame.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 60, 80, 25);
        frame.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(100, 60, 165, 25);
        frame.add(ageField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(10, 100, 80, 25);
        frame.add(courseLabel);

        courseField = new JTextField();
        courseField.setBounds(100, 100, 165, 25);
        frame.add(courseField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 140, 80, 25);
        frame.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 140, 165, 25);
        frame.add(emailField);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100, 180, 80, 25);
        frame.add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Student s = new Student();
                s.setName(nameField.getText());
                s.setAge(Integer.parseInt(ageField.getText()));
                s.setCourse(courseField.getText());
                s.setEmail(emailField.getText());

                new StudentDAO().saveStudent(s);
                JOptionPane.showMessageDialog(frame, "Student saved!");
            }
        });

        frame.setVisible(true);
    }
}
