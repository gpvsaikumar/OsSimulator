import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.SystemColor;

public class Dining extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dining frame = new Dining();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Dining() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,2000,715);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton lblPhil_1 = new JButton("Thinking");
		lblPhil_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 12));
		lblPhil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
		lblPhil_1.setBounds(255, 256, 220, 179);
		contentPane.add(lblPhil_1);
		
		JButton lblPhil_4 = new JButton("Thinking");
		lblPhil_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 12));
		lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
		lblPhil_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lblPhil_4.setBounds(852, 268, 220, 179);
		contentPane.add(lblPhil_4);
		
		JButton lblPhil = new JButton("Thinking");
		lblPhil.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 12));
		lblPhil.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
		lblPhil.setBounds(549, 85, 220, 174);
		contentPane.add(lblPhil);
		
		JButton lblPhil_2 = new JButton("Thinking");
		lblPhil_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 12));
		lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
		lblPhil_2.setBounds(331, 480, 212, 183);
		contentPane.add(lblPhil_2);
		
		JButton lblPhil_3 = new JButton("Thinking");
		lblPhil_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 12));
		lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
		lblPhil_3.setBounds(802, 480, 220, 183);
		contentPane.add(lblPhil_3);
		
		JButton ST = new JButton("START");
		ST.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		
		class Philosophers 
		{
			
			int state[]=new int[5],x;
			int flag=0,val=0;
			int thinking,eating,hungry;
			void increment()
			{
				int max=4;
				int min=0;
				Random rand=new Random();
				x=rand.nextInt((max - min) + 1) + min;
				if(flag==0 && val<4)
					val+=1;
				else if(flag==0 && val>=4)
				{
					flag=1;
					val=0;
				}
				else if(flag==1 && val>=4)
			
				{
					flag=0;
					val=0;
				}
				else
					val+=1;
			};
			public void Action()
			{
				if(flag==0)
					pickup();
				else
					putdown();
			}
			void Op()
			{
				//states
				thinking=0;
				eating=1;
				hungry=2;
			}
		public void pickup()
		{
			int i=x;
			state[i]=2;
				if(i==0)
				{
					lblPhil_1.setText("Hungry");
					lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person3.jpg"));
				}
					
				else if(i==1)
				{
					lblPhil_1.setText("Hungry");

					lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person3.jpg"));
				}
				else if(i==2)
				{
					lblPhil_2.setText("Hungry");

					lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person3.jpg"));
				}
				else if(i==3)
				{
					lblPhil_3.setText("Hungry");
					
					lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person3.jpg"));
				}
				else
				{
					lblPhil_4.setText("Hungry");
					
					lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person3.jpg"));
				}
		    	  
			
			
			test(i);
			if(state[i]==2)
			{
				
				if(i==0)
				{
					lblPhil.setText("Waiting");
					
					lblPhil.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person2.jpg"));
				}
				else if(i==1)
				{
					lblPhil_1.setText("Waiting");
					lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person2.jpg"));
				}
				else if(i==2)
				{
					lblPhil_2.setText("Waiting");
					lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person2.jpg"));
				}
				else if(i==3)
				{
					lblPhil_3.setText("Waiting");
					lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person2.jpg"));
				}
				else
				{
					lblPhil_4.setText("Waiting");
					lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person2.jpg"));
				}
			}
		}
		public void putdown()
		{
			int i=x;
			if(state[i]==1)
			{
				state[i]=0;
				
				if(i==0)
				{
					lblPhil.setText("Thinking");
					lblPhil.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
				}
				else if(i==1)
				{
					lblPhil_1.setText("Thinking");
					lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
				}
				else if(i==2)
				{
					lblPhil_2.setText("Thinking");
					lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
				}
				else if(i==3)
				{
					lblPhil_3.setText("Thinking");
					lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
				}
				else
				{
					lblPhil_4.setText("Thinking");
					lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person1.jpg"));
				}
				test((i+1)%5);
				test((i+4)%5);
			}
		}

		public void test(int i)
		{
			if(state[i]==2 && state[(i+1)%5]!=1 && state[(i+4)%5]!=1)
			{
				state[i]=1;
				
				if(i==0)
				{
					lblPhil.setText("Eating");
					lblPhil.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person6.jpg"));
				}
				else if(i==1)
				{
					lblPhil_1.setText("Eating");
					lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person6.jpg"));
				}
				else if(i==2)
				{
					lblPhil_2.setText("Eating");
					lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person6.jpg"));
				}
				else if(i==3)
				{
					lblPhil_3.setText("Eating");
					lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person6.jpg"));
				}
				else
				{
					lblPhil_4.setText("Eating");
					lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Thanuja\\workspace\\Project\\images\\person6.jpg"));
				}
			}
		}
		};

		 Philosophers d=new Philosophers();

		
		/*ST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});*/
		
		ST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Timer t=new Timer(1000,new ActionListener(){
					public void actionPerformed()
					{
						
					}

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						d.pickup();
						d.increment();
						d.Action();
					}
					
				});
				t.start();
				
			}
		});
		ST.setBounds(87, 150, 125, 42);
		contentPane.add(ST);
		ST.setBounds(87, 150, 125, 42);
		contentPane.add(ST);
		
		
		JLabel label = new JLabel("");
		Image images6 = new ImageIcon(this.getClass().getResource("/semya.png")).getImage();
		label.setIcon(new ImageIcon(images6));
		label.setBounds(586, 313, 163, 154);
		contentPane.add(label);
		
		JLabel lblDiningPhilosophers = new JLabel("DINING PHILOSOPHERS");
		lblDiningPhilosophers.setForeground(SystemColor.inactiveCaptionBorder);
		lblDiningPhilosophers.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblDiningPhilosophers.setBounds(500, 11, 352, 47);
		contentPane.add(lblDiningPhilosophers);
		
		JButton btnBack = new JButton("HOME");
		Image images5 = new ImageIcon(this.getClass().getResource("/back1.png")).getImage();
		btnBack.setIcon(new ImageIcon(images5));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttons b = new Buttons();
				b.Method();
			}
		});
		btnBack.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(1186, 569, 131, 62);
		contentPane.add(btnBack);
		
		JButton Nt = new JButton("Next");
		Nt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.increment();
				d.Action();
				
			}
		});
		Nt.setBounds(1187, 104, 89, 23);
		contentPane.add(Nt);
		
		
	}
	}

	
	
	