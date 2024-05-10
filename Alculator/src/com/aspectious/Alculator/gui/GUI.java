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
		window.setVisible(true);
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
		inputBox = new JTextField(10);
		buttonPanel = new JPanel();
		buttonArray = new JButton[buttonPanelList.length][4];
		for (int i=0; i<buttonArray.length; i++) {
			JPanel panel = buttonPanelList[i];
			panel = new JPanel();
			for (int j=0; j<buttonArray[0].length; j++) {
				 JButton button = buttonArray[i][j];
				 button = new JButton();
				 button.setText(i+"");
				 panel.add(button);
				
			}
			buttonPanelList[i] = panel;
			
		}
		inputBox.setText("hee");
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
