package com.aspectious.Alculator.gui;
import java.awt.*;

import javax.swing.*;

public class GUI {
	private JFrame window;
	
	private JPanel mainPanel;
	private JList historyList;
	private JTextField inputBox;
	
	private JPanel textBoxsPanel;
	private JPanel buttonPanel;
	
	private JPanel[] buttonPanelList;
	private JButton[][] buttonArray;
	
	public GUI() {
		window = new JFrame();
		window.setSize(300,400);
		window.setTitle("Alculator");
		
		setup();
		window.setResizable(false);
		window.setVisible(true);
		window.setAlwaysOnTop(true);
	}
	
	public void setup() {
		mainPanel = new JPanel();
		textBoxsPanel = new JPanel();
		buttonPanelList = new JPanel[5];
		Object[] data = new Object[1];
		historyList = new JList(data);
		historyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		historyList.setLayoutOrientation(JList.VERTICAL);
		historyList.setVisibleRowCount(3);
		inputBox = new JTextField(20);
		buttonPanel = new JPanel();
		buttonArray = new JButton[buttonPanelList.length][4];
		for (int i=0; i<buttonArray.length; i++) {
			JPanel panel = buttonPanelList[i];
			panel = new JPanel();
			for (int j=0; j<buttonArray[0].length; j++) {
				
				
				
				
				JButton button = buttonArray[i][j];
				 button = new JButton();
				 button.setText(i+"");
				 button.setPreferredSize(new Dimension(60,30));
				 
				 
				 
				 
				 
				 
				
					

				 
				 
					if (i==0 && j==0) {
						button.setText("del");
						button.setPreferredSize(new Dimension(125,30));
						
						
						button.addActionListener(e -> {
							String newText = inputBox.getText();
							if (newText.length()>0) {
								inputBox.setText(newText.substring(0,newText.length()-1));
							}
							
						});
					}
					if (i==0 && j==1) {
						button.setText("del");
					}
					else if (i==0 && j==2) {
						button.setText("+/-");
					}
					else if (i==0 && j==3) {
						button.setText("+");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "+"));
					}
					
					
					
					
					else if (i==1 && j==0) {
						button.setText("7");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "7"));
					}
					else if (i==1 && j==1) {
						button.setText("8");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "8"));
					}
					else if (i==1 && j==2) {
						button.setText("9");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "9"));
					}
					else if (i==1 && j==3) {
						button.setText("-");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "-"));
					}
					
					
					
					else if (i==2 && j==0) {
						button.setText("4");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "4"));
					}
					else if (i==2 && j==1) {
						button.setText("5");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "5"));
					}
					else if (i==2 && j==2) {
						button.setText("6");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "6"));
					}
					else if (i==2 && j==3) {
						button.setText("*");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "*"));
					}
					
					
					
					else if (i==3 && j==0) {
						button.setText("1");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "1"));
					}
					else if (i==3 && j==1) {
						button.setText("2");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "2"));
					}
					else if (i==3 && j==2) {
						button.setText("3");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "3"));
					}
					else if (i==3 && j==3) {
						button.setText("/");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "/"));
					}
					
					else if (i==4 && j==0) {
						button.setText("0");
						button.setPreferredSize(new Dimension(190,30));
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "0"));
					}
					else if (i==4 && j==2) {
						button.setText(".");
						button.addActionListener(e -> inputBox.setText(inputBox.getText() + "."));
					}
					else if (i==4 && j==3) {
						button.setText("=");
					}
					
					if ((i==4 && j==1)||(i==4 && j==2)||(i==0 && j==1)) {
						button = null;
					} else {
						panel.add(button);
					}
			}
			
			buttonPanelList[i] = panel;
			
		}
		inputBox.setToolTipText("Enter Math...");
		JScrollPane listScroller = new JScrollPane(historyList);
		listScroller.setPreferredSize(new Dimension(250, 80));
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
