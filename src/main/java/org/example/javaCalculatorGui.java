package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaCalculatorGui {
    private JPanel javaCalculatorGui;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton backSpaceButton;
    private JButton CEButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton divideButton;
    private JButton equalsButton;
    private JButton addButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton punktButton;


    private JButton percentButton;
    private JButton sqrtButton;
    private JButton logButton;
    private JButton lnButton;
    private JButton powerButton;
    private JTextField expressionField;
    private double num1;
    private double num2;
    private String operation;


    public javaCalculatorGui() {


        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ACButton.getText());
                num2 = 0;
                txtDisplay.setText("");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // txtDisplay.setText(txtDisplay.getText()+ CEButton.getText());
                txtDisplay.setText("");

            }
        });
        backSpaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = txtDisplay.getText();
                if (!currentText.isEmpty()) {
                    // Remove the last character
                    currentText = currentText.substring(0, currentText.length() - 1);
                    txtDisplay.setText(currentText);
                }


            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = txtDisplay.getText();
                if (!inputText.isEmpty()) {
                    num1 = Double.parseDouble(inputText);
                    operation = "+";
                   // expressionField.setText(inputText + " " + operation); // Aktualisiere den Ausdruck
                    txtDisplay.setText("");

                }

            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = txtDisplay.getText();

                num1 = Double.parseDouble(txtDisplay.getText());
                operation = "-";
                txtDisplay.setText("");


            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = "*";
                txtDisplay.setText("");

            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = "/";
                txtDisplay.setText("");

            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(txtDisplay.getText());
                double result = 0.0;
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            txtDisplay.setText("Error");
                            return;
                        }
                        break;
                }
                txtDisplay.setText(String.valueOf(result));
            }
        });
        punktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+punktButton.getText());
                if(txtDisplay.getText().isEmpty()){
                    txtDisplay.setText("0.");
                }
                else if(txtDisplay.getText().contains(".")){
                    punktButton.setEnabled(false);
                }else {

                    String punktButtonText =txtDisplay.getText()+punktButton.getText();
                    txtDisplay.setText(punktButtonText);

                }punktButton.setEnabled(true);



            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a0Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a00Button.getText());


            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a1Button.getText());


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a2Button.getText());


            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a3Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a6Button.getText());


            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a7Button.getText());


            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a9Button.getText());


            }
        });
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double percentValue = num1 * 0.10;
                txtDisplay.setText(String.valueOf(percentValue));

            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText = txtDisplay.getText();
                double num = Double.parseDouble(displayText);

                // Berechne die Quadratwurzel
                double sqrtValue = Math.sqrt(num);

                // Zeige das Ergebnis im Anzeigefeld an
                txtDisplay.setText(String.valueOf(sqrtValue));

            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText = txtDisplay.getText();
                double num = Double.parseDouble(displayText);

                // Berechnen Sie den natürlichen Logarithmus
                double lnValue = Math.log(num);

                // Zeige das Ergebnis im Anzeigefeld an
                txtDisplay.setText(String.valueOf(lnValue));
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText = txtDisplay.getText();
                double num = Double.parseDouble(displayText);

                //  den Logarithmus zur Basis 10
                double logValue = Math.log10(num);

                //  das Ergebnis im Anzeigefeld
                txtDisplay.setText(String.valueOf(logValue));
            }
        });
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText = txtDisplay.getText();
                double base = Double.parseDouble(displayText);

                // Eingabeaufforderung für den Exponenten
                String exponentText = JOptionPane.showInputDialog("Geben Sie den Exponenten (y) ein:");

                if (exponentText != null && !exponentText.isEmpty()) {
                    double exponent = Double.parseDouble(exponentText);

                    //  die Berechnung der Potenz durch
                    double result = Math.pow(base, exponent);

                    // Zeige das Ergebnis im Anzeigefeld an
                    txtDisplay.setText(String.valueOf(result));
                } else {

                }
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculatorGui");
        frame.setContentPane(new javaCalculatorGui().javaCalculatorGui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,500);
        frame.setResizable(false);
//         frame.pack();
        frame.setVisible(true);
    }
}
