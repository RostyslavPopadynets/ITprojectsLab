package ITProjects;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField number = new JTextField(10);
    private JButton sinus = new JButton("sin");
    private JButton cosinus = new JButton("cos");
    private JButton tangens = new JButton("tg");
    private JButton cotangens = new JButton("ctg");
    private JButton arcsinus = new JButton("arcsin");
    private JButton arccosinus = new JButton("arccos");
    private JButton arctangens = new JButton("arctg");
    private JButton arccotangens = new JButton("arcctg");
    private JTextField result = new JTextField(10);

    CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        calcPanel.add(number);
        calcPanel.add(sinus);
        calcPanel.add(cosinus);
        calcPanel.add(tangens);
        calcPanel.add(cotangens);
        calcPanel.add(arcsinus);
        calcPanel.add(arccosinus);
        calcPanel.add(arctangens);
        calcPanel.add(arccotangens);
        calcPanel.add(result);
        this.add(calcPanel);
        setVisible(true);
        setTitle("Ростислав Попадинець КН-41з Калькулятор");
    }

    public double getNumber() {
        return Double.parseDouble(number.getText());
    }

    public void setResult(double res) {
        result.setText(String.format("%.5f", res));
    }

    void addSinusListener(ActionListener listenForSinus) {
        sinus.addActionListener(listenForSinus);
    }

    void addCosinusListener(ActionListener listenForCosinus) {
        cosinus.addActionListener(listenForCosinus);
    }

    void addTangensListener(ActionListener listenForTangens) {
        tangens.addActionListener(listenForTangens);
    }

    void addCotangensListener(ActionListener listenForCotangens) {
        cotangens.addActionListener(listenForCotangens);
    }

    void addArcSinusListener(ActionListener listenForArcSinus) {
        arcsinus.addActionListener(listenForArcSinus);
    }

    void addArcCosinusListener(ActionListener listenForArcCosinus) {
        arccosinus.addActionListener(listenForArcCosinus);
    }

    void addArcTangensListener(ActionListener listenForArcTangens) {
        arctangens.addActionListener(listenForArcTangens);
    }

    void addArcCotangensListener(ActionListener listenForArcCotangens) {
        arccotangens.addActionListener(listenForArcCotangens);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}