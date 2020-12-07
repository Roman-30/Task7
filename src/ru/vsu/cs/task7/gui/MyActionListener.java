package ru.vsu.cs.task7.gui;

import ru.vsu.cs.task7.gui.logics.CalculateMaxQuantity;
import ru.vsu.cs.task7.gui.util.ArrayUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    private final JTextField inputData;
    private final JTextField outputData;

    public MyActionListener(JTextField inputData, JTextField outputData) {
        this.inputData = inputData;
        this.outputData = outputData;
    }

    public void actionPerformed(ActionEvent e) {
        int[] numbers = ArrayUtil.toIntArray(inputData.getText());
        outputData.setText(String.valueOf(CalculateMaxQuantity.findMaximumNumberRepetitions(numbers)));
    }
}

