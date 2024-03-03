package gui;

import javax.swing.*;

public class Main_Panel extends JFrame {
    private JLabel result;
    private JPanel Main;
    private JTextField inputB;
    private JButton geteilt;
    private JButton mal;
    private JButton minus;
    private JButton plus;
    private JTextField inputA;


    public void startGUI() {
        JFrame frame = new JFrame("Main_Panel");
        frame.setContentPane(new Main_Panel().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
