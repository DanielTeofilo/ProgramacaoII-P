
package br.estacio;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class LayoutBorder extends JFrame {
    
    public LayoutBorder(){
        setTitle("Aula 05");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(290,250);
        setLayout(new BorderLayout());
        
        JButton button = new JButton("PAGE START");
        add(button, BorderLayout.PAGE_START);
        
        button = new JButton("CENTER");
        add(button, BorderLayout.CENTER);
        
        button = new JButton("LINE START");
        add(button, BorderLayout.LINE_START);
        
        button = new JButton("PAGE END");
        add(button, BorderLayout.PAGE_END);
        
        button = new JButton("LINE END");
        add(button, BorderLayout.LINE_END);       
        
    }
    
    public static void main(String[] args) {
        LayoutBorder l = new LayoutBorder();
    }    
}
