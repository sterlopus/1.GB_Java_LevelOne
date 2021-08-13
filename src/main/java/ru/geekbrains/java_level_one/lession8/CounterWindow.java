package ru.geekbrains.java_level_one.lession8;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* The counter in the window */
public class CounterWindow extends JFrame {

    private int counterValue;   // Initial counter value

    public CounterWindow() {
    }

/* title - window title; x,y,width,height - frame initial position and size;
* */
    public CounterWindow(int initialValue, String title, int x, int y, int width, int height,
                         String fontName, String decreaseButtonName,String increaseButtonName ) {
        setTitle(title);
        setBounds(x, y, width, height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font (fontName, Font.BOLD, 28);

        counterValue = initialValue;

        JTextField counterText = new JTextField();
        counterText.setFont(font);
        counterText.setHorizontalAlignment(JLabel.CENTER);
        add(counterText, BorderLayout.CENTER);
        counterText.setText(String.valueOf(counterValue));

        JButton decreaseButton;
        JButton increaseButton;
        decreaseButton = new JButton(decreaseButtonName);
        increaseButton = new JButton(increaseButtonName);
        decreaseButton.setFont(font);
        increaseButton.setFont(font);
        add(decreaseButton, BorderLayout.WEST);
        add(increaseButton, BorderLayout.EAST);

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue++;
                counterText.setText(String.valueOf(counterValue));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue--;
                counterText.setText(String.valueOf(counterValue));
            }
        });

        counterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterValue=Integer.parseInt(counterText.getText());
            }
        });

        setVisible(true);
    }

}
