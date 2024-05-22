package com.aspectious.Alculator.gui;
import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

import com.aspectious.Alculator.meth;

public class GUI {
	private JFrame window;
	
	private JPanel mainPanel;
	
	DefaultListModel listModel = new DefaultListModel();
	private JList historyList;
	private JTextField inputBox;
	
	private JPanel textBoxsPanel;
	private JPanel buttonPanel;
	
	private JPanel[] buttonPanelList;
	private JButton[][] buttonArray;
	
	private int MODE = 1;
	
	public GUI() {
		window = new JFrame();
		window.setSize(400,550);
		window.setTitle("Alculator (Scientific Mode)");
		
		setup();
		ImageIcon img = new ImageIcon("./Alculator.png");
		window.setIconImage(img.getImage());
		window.setResizable(false);
		window.setVisible(true);
		window.setAlwaysOnTop(true);
	}
	public void sendMeth() {
		String formulae = inputBox.getText();
		boolean isCalc = meth.checkIfCalculable(formulae);
		if (isCalc) {
			double answer = meth.calculate(formulae);
			listModel.addElement(inputBox.getText() + " = " + answer);
			inputBox.setText("");
		} else {
			JOptionPane.showMessageDialog(window, "Invalid input - Please try a valid equation","Error",0);
		}
	}
	public void setup() {
		mainPanel = new JPanel();
		textBoxsPanel = new JPanel();
		buttonPanelList = new JPanel[8];
		historyList = new JList(listModel);
		historyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		historyList.setLayoutOrientation(JList.VERTICAL);
		historyList.setVisibleRowCount(3);
		inputBox = new JTextField(30);
		//((AbstractDocument)inputBox.getDocument()).setDocumentFilter(new InputFilter());
		inputBox.addActionListener(e -> {sendMeth();});
		
		
		buttonPanel = new JPanel();
		buttonArray = new JButton[buttonPanelList.length][5];
		for (int i=0; i<buttonArray.length; i++) {
			JPanel panel = buttonPanelList[i];
			panel = new JPanel();
			for (int j=0; j<buttonArray[0].length; j++) {
				
				
				
				
				JButton button = buttonArray[i][j];
				 button = new JButton();
				 button.setText(i+"");
				 button.setBackground(new Color(150,150,150));
				 button.setBorderPainted(true);
				 button.setPreferredSize(new Dimension(60,30));
				 
				 
				 
				 
				 
				 
				
					

				 
				 
					if (i==0 && j==4) {
						button.setText("del");
						button.setPreferredSize(new Dimension(60,30));
						button.setBackground(new Color(201,120,120));
						
						button.addActionListener(e -> {
							String newText = inputBox.getText();
							if (newText.length()>0) {
								inputBox.setText(newText.substring(0,newText.length()-1));
							}
							
						});
					}
					else if (i==0 && j==3) {
						button.setText("clr");
						button.addActionListener(e -> inputBox.setText(""));
						button.setBackground(new Color(201,201,120));
					}
					
					
					
					else if (i==1 && j==1) {
						button.setText("(");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "("));
					}
					else if (i==1 && j==2) {
						button.setText(")");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + ")"));
					}
					else if (i==1 && j==3) {
						button.setText("n!");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "!"));

					}
					else if (i==1 && j==4) {
						button.setText("+");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "+"));
					}
					else if (i==2 && j==0) {
						button.setText("n√");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "nthroot("));
					}
					else if (i==2 && j==1) {
						button.setText("e");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "e"));
					}
					else if (i==2 && j==2) {
						button.setText("pi");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "pi"));
					}
					else if (i==2 && j==3) {
						button.setText("|x|");
						button.addActionListener(e -> inputBox.setText("|" + inputBox.getText() + "|"));
					}
					else if (i==2 && j==4) {
						button.setText("n!");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "!"));
					}
					else if (i==3 && j==0) {
						button.setText("2√");
						button.addActionListener(e -> inputBox.setText("sqrt(" + inputBox.getText() + ")"));
					}
					else if (i==3 && j==1) {
						button.setText("(");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "("));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==3 && j==2) {
						button.setText(")");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + ")"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==3 && j==3) {
						button.setText("mod");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "%"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==3 && j==4) {
						button.setText("+");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "+"));
						button.setBackground(new Color(201,201,201));
					}
					
					else if (i==4 && j==0) {
						button.setText("y^x");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "^"));
					}
					else if (i==4 && j==1) {
						button.setText("7");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "7"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==4 && j==2) {
						button.setText("8");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "8"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==4 && j==3) {
						button.setText("9");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "9"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==4 && j==4) {
						button.setText("-");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "-"));
						button.setBackground(new Color(201,201,201));
					}
					
					
					else if (i==5 && j==0) {
						button.setText("E");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "E"));
					}
					else if (i==5 && j==1) {
						button.setText("4");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "4"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==5 && j==2) {
						button.setText("5");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "5"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==5 && j==3) {
						button.setText("6");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "6"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==5 && j==4) {
						button.setText("*");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "*"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==6 && j==0) {
						button.setText("log");
						button.addActionListener(e -> inputBox.setText("log(" + inputBox.getText() + ")"));
					}
					else if (i==6 && j==1) {
						button.setText("1");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "1"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==6 && j==2) {
						button.setText("2");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "2"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==6 && j==3) {
						button.setText("3");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "3"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==6 && j==4) {
						button.setText("/");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "/"));
						button.setBackground(new Color(201,201,201));
					}
					
					else if (i==7 && j==0) {
						button.setText("ln");
						button.setPreferredSize(new Dimension(60,30));
						button.addActionListener(e -> inputBox.setText("ln(" + inputBox.getText() + ")"));
					}
					else if (i==7 && j==1) {
						button.setText("+/-");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "_"));
						button.setBackground(new Color(201,201,201));
						
					}
					
					else if (i==7 && j==2) {
						button.setText("0");
						button.setPreferredSize(new Dimension(60,30));
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "0"));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==7 && j==3) {
						button.setText(".");
						button.setPreferredSize(new Dimension(60,30));
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "."));
						button.setBackground(new Color(201,201,201));
					}
					else if (i==7 && j==4) {
						button.setText("=");
						button.setBackground(new Color(90,150,255));
						button.addActionListener(e -> sendMeth());
					}
						panel.add(button);
			}
			
			buttonPanelList[i] = panel;
			
		}
		inputBox.setToolTipText("Enter Math...");
		JScrollPane listScroller = new JScrollPane(historyList);
		listScroller.setPreferredSize(new Dimension(320, 80));
		mainPanel.add(listScroller);
		textBoxsPanel.add(inputBox);
		mainPanel.add(buttonPanel);
		mainPanel.add(textBoxsPanel);
		for (int i=0; i<buttonPanelList.length; i++) {
			mainPanel.add(buttonPanelList[i]);
		}
		window.add(mainPanel);
	}
}
