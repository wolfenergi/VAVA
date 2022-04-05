package sk.stu.fiit.C_8_REGEX;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker_Gui {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;

    public Checker_Gui() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile(textField1.getText(), Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(textField2.getText());
                boolean matchFound = matcher.find();
                String out = "";
                if(matchFound)
                    out = "OK";
                else
                    out = "NG";
                JOptionPane.showMessageDialog(null, out);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Checker_Gui");
        frame.setContentPane(new Checker_Gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
