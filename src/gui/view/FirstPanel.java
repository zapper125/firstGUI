package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel
{
	private GUIController appController; 
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public FirstPanel(GUIController appController)
	{
		super();
		setBackground(Color.RED);
		
		this.appController = appController; 
		
		
		firstLabel = new JLabel("words");
		firstButton = new JButton("");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 177, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -4, SpringLayout.NORTH, firstLabel);
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 136,SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstLabel, 194, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -218, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void changeBackground()
	{
		//changes to random color.
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		this.setBackground(new Color(red,green,blue));
		firstLabel.setText("Red: " + red + " Green: " + green + " Blue " + blue);
 }
	private void setupPanel()
	{
		this.add(firstButton);
		this.add(firstLabel);
		this.add(firstLabel);
		this.setLayout(appLayout);
		
		JButton btnNewButton = new JButton("New button");
		appLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 171, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -6, SpringLayout.NORTH, btnNewButton);
		appLayout.putConstraint(SpringLayout.WEST, btnNewButton, 157, SpringLayout.WEST, this);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
	}
	
	private void setupLayout()
	{
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
	}
}
