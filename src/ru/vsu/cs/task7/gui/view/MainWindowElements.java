package ru.vsu.cs.task7.gui.view;

import javax.swing.*;

public class MainWindowElements extends JFrame {
    private JTextField inputData;
    private JButton button;
    private JTextField outputData;
    private JPanel mainPanel;

    public MainWindowElements() {

        setTitle("GUI Task_7");
        setBounds(300, 200, 500, 150);
        setResizable(false);
        setVisible(true);
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new MyActionListener(inputData, outputData));
    }
}