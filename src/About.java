import javax.swing.*;
import java.awt.*;

public class About extends JFrame{


    About(){
        setTitle("About Note It Down Application");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad.png"));
        setIconImage(icon.getImage());


        JLabel iconLabel= new JLabel(new ImageIcon(getClass().getResource("windows.png")));
        iconLabel.setBounds(150, 40, 400, 80);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html>Note It Down<br>Conventional Notepad Version 2.0<br> All rights reserved<br><br>Note It Down is a word processing program, <br>which allows changing of text in a computer file.<br>Note It Down is a simple text editor for basic text-editing program which enables computer users to create documents. </html>");
        textLabel.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        textLabel.setBounds(150, 130, 500, 300);
        add(textLabel);
    }

    public static void main(String[] args){
        new About().setVisible(true);
    }
}
