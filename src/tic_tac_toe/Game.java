package tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame implements ActionListener
{
	private int count;
	private String player1,player2;
	private JPanel contentPane;
	JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8;

	
	public Game(String p1,String p2) 
	{
		player1=p1;player2=p2;
		setTitle("Tic-Tac-Toe");
		setLocationRelativeTo(this);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		//JOptionPane.showMessageDialog(Game.this, "Player_1->'X' & Player_2->'O'");
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(this);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(this);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(this);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(this);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(this);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(this);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(this);
		contentPane.add(btnNewButton_8);
		
	}
	void findWinner(String one,String two,String three,String four,String five,String six,String seven,String eight,String nine)
	{
		if(one==two&&two==three&&two!=""&&three!=""&&one!="")
		{
			if(one=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(four==five&&five==six&&five!=""&&four!=""&&six!="")
		{
			if(four=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(seven==eight&&eight==nine&&seven!=""&&eight!=""&&nine!="")
		{
			if(seven=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(one==four&&four==seven&&one!=""&&four!=""&&seven!="")
		{
			if(one=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(five==two&&two==eight&&five!=""&&two!=""&&eight!="")
		{
			if(two=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(three==six&&six==nine&&three!=""&&six!=""&&nine!="")
		{
			if(three=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(one==five&&five==nine&&one!=""&&five!=""&&nine!="")
		{
			if(one=="X")
			{
				JOptionPane.showMessageDialog(this, player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(three==five&&five==seven&&three!=""&&five!=""&&seven!="")
		{
			if(three=="X")
			{
				JOptionPane.showMessageDialog(this,player1+" Wins...");
			}
			else
			{
				JOptionPane.showMessageDialog(this, player2+" Wins...");
			}
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
		if(count==9)
		{
			JOptionPane.showMessageDialog(this, "Match Draw");
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_3.setText("");
			btnNewButton_4.setText("");
			btnNewButton_5.setText("");
			btnNewButton_6.setText("");
			btnNewButton_7.setText("");
			btnNewButton_8.setText("");
			count=0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewButton)
		{
			count++;
			if(btnNewButton.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton.setText("O");
				}
				else
					btnNewButton.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_1)
		{
			count++;
			if(btnNewButton_1.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_1.setText("O");
				}
				else
					btnNewButton_1.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_2)
		{
			count++;
			if(btnNewButton_2.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_2.setText("O");
				}
				else
					btnNewButton_2.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_3)
		{
			count++;
			if(btnNewButton_3.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_3.setText("O");
				}
				else
					btnNewButton_3.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_4)
		{
			count++;
			if(btnNewButton_4.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_4.setText("O");
				}
				else
					btnNewButton_4.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_5)
		{
			count++;
			if(btnNewButton_5.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_5.setText("O");
				}
				else
					btnNewButton_5.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_6)
		{
			count++;
			if(btnNewButton_6.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_6.setText("O");
				}
				else
					btnNewButton_6.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_7)
		{
			count++;
			if(btnNewButton_7.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_7.setText("O");
				}
				else
					btnNewButton_7.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		if(e.getSource()==btnNewButton_8)
		{
			count++;
			if(btnNewButton_8.getText()=="")
			{   if(count%2==0)
				{
					btnNewButton_8.setText("O");
				}
				else
					btnNewButton_8.setText("X");
			}
			findWinner(btnNewButton.getText(), btnNewButton_1.getText(), btnNewButton_2.getText(), btnNewButton_3.getText(), btnNewButton_4.getText(),btnNewButton_5.getText(), btnNewButton_6.getText(), btnNewButton_7.getText(), btnNewButton_8.getText());
		}
		
	}

}
