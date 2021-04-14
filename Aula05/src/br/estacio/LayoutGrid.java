package br.estacio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class LayoutGrid extends JFrame {
    
    String gapList[] = {"0","10","15","20"};
    int maxGap = 20;
    
    public LayoutGrid(){
        setTitle("Grid Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(590, 350);
        
        JComboBox horGapComboBox = new JComboBox(gapList);
        JComboBox verGapComboBox = new JComboBox(gapList);
        JButton applyButton = new JButton("Apply Gaps");
        GridLayout experimentLayout = new GridLayout(0, 2);
        
        JPanel compsToExperiment = new JPanel();
        JPanel controls = new JPanel();
        
        compsToExperiment.setLayout(experimentLayout);
        controls.setLayout(new GridLayout(2,3));
        
        JButton b = new JButton("Just fake button");
        Dimension buttonSize = b.getPreferredSize();
        compsToExperiment.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5) 
                + maxGap, (int)(buttonSize.getHeight()*3.5) + maxGap * 2));
        
        compsToExperiment.add(new JButton("Button 1"));
        compsToExperiment.add(new JButton("Button 2"));
        compsToExperiment.add(new JButton("Button 3"));
        compsToExperiment.add(new JButton("Button 4"));
        compsToExperiment.add(new JButton("Button 5"));
        
        controls.add(new Label("Horizontal Gap"));
        controls.add(new Label("Vertical Gap"));
        controls.add(new Label(" "));
        controls.add(horGapComboBox);
        controls.add(verGapComboBox);
        controls.add(applyButton);
        
        applyButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String horGap = (String)horGapComboBox.getSelectedItem();
                String verGap = (String)verGapComboBox.getSelectedItem();
                
                experimentLayout.setHgap(Integer.parseInt(horGap));
                experimentLayout.setVgap(Integer.parseInt(verGap));
                experimentLayout.layoutContainer(compsToExperiment);
            }
        });
        
        add(compsToExperiment, BorderLayout.NORTH);
        add(new JSeparator(), BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        LayoutGrid l = new LayoutGrid();
    }
    
}
