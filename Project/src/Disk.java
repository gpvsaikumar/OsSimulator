import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SystemColor;

public class Disk extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField Th;
	private JTextField Tn;
	public Object frame1;
	private JButton Gen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disk frame = new Disk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Memory3()
	{
		Disk window = new Disk();
		window.frame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public Disk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,2000,715);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Th = new JTextField();
		Th.setFont(new Font("Segoe Print", Font.BOLD, 15));
		Th.setBounds(267, 176, 86, 28);
		contentPane.add(Th);
		Th.setColumns(10);
		
		Tn = new JTextField();
		Tn.setFont(new Font("Segoe Print", Font.BOLD, 15));
		Tn.setBounds(671, 176, 86, 28);
		contentPane.add(Tn);
		Tn.setColumns(10);
		
		JTextArea Ta = new JTextArea();
		Ta.setFont(new Font("Segoe Print", Font.BOLD, 15));
		Ta.setBounds(460, 320, 100, 39);
		contentPane.add(Ta);
		
		JTextArea tr = new JTextArea();
		tr.setBounds(308, 546, 503, 39);
		contentPane.add(tr);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1362, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		
		mntmHome.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)    {
			Buttons x= new Buttons();
			x.Method();
			}
		});
		mnFile.add(mntmHome);
		
		JMenuItem mntmOpenSimulation = new JMenuItem("Open simulation");
		mnFile.add(mntmOpenSimulation);
		
		JMenuItem mntmSaveSimulation = new JMenuItem("Save simulation");
		mnFile.add(mntmSaveSimulation);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JButton btnFifo = new JButton("FIFO");
		btnFifo.setFont(new Font("Segoe Print", Font.BOLD, 14));
		
		btnFifo.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				
				String inputh = Th.getText();
				String inputn = Tn.getText();
		int a,c,x=2,y=3,count=0,rw,r,t;
		
		Random r1 = new Random();
		tr.setText(inputh+"\t");
		
		

		//System.out.print("\n\n  program name:FCFS\n\n");

		//System.out.print("\nenter no.of Cylinders:");
		int n;
		n = Integer.valueOf(inputn);
		
		int array[]=new int[n+1];
		int anarray[]=new int[n+1];
		//System.out.print("head pointer:");

		rw = Integer.valueOf(inputh);

		//System.out.print("\n");
		
		for(c=0;c<=n;c++)

		{

		t=c+1;

		//System.out.print("request#"+t+":");

		array[c] = r1.nextInt(100)+1;

		}

		for(c=0;c<n-1;c++)

		{
			int k;
			k=array[c];
		tr.append(k+"\t");
		anarray[c]=array[c]-array[c+1];

		if(anarray[c]<0)

		{

		anarray[c]=anarray[c]*-1;

		}

		}

		for(c=0;c<n-1;c++)

		{

		count=count+anarray[c];

		}

		r=array[0]-rw;

		if(r<0)

		{

		r=r*-1;
		
		}

		count=count+r;

		Ta.setText(String.valueOf(count));

		}
		});
/*
		Gen.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e, String JButton)	{
			if(JButton == "FIFO"){
				String Val, S="",v = "";
				Val=Tn.getText();
				convert z = new convert(Val);
				int[] L= z.method1();
				int h = Integer.parseInt(Th.getText());
				Graphics2D G = new Graph(r,r.length);
				G.test(r,r.length,"FCFS");
				   for(int i=0;i<r.length;i++)
			    	{ 
			    	S = S + " " + r[i];
			    	
			    	}
			  Text2.setText(S);
			  Text4.setText(v);
				//Text2.setText(""+r.length);
				} 
				}
			}
			
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		btnFifo.setBounds(1076, 146, 117, 25);
		contentPane.add(btnFifo);
		
		JButton btnSstf = new JButton("SSTF");
		btnSstf.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnSstf.setBounds(1076, 204, 117, 25);
		contentPane.add(btnSstf);
		
		JButton btnScan = new JButton("SCAN");
		btnScan.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnScan.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				String inputh = Th.getText();
				String inputn = Tn.getText();
				
				Random r2 = new Random();
				int a,x,c,h,i,count=0,temp;

				//System.out.print("\n\n  program name:SCAN\n\n");

				//System.out.print("\nenter no.of Cylinders:");

				a=Integer.valueOf(inputn);
				int anarray[]=new int[a+4];

				//System.out.print("head pointer:");

				 h=Integer.valueOf(inputh);
				 tr.setText(h+"\t");
				//System.out.print("\n");
				 
				anarray[0]=0;

				for(c=1;c<=a;c++)

				{


					anarray[c]=r2.nextInt(100)+1;
					//System.out.println(anarray[c]);
				}

				anarray[c]=h;

				for(c=0;c<a+1;c++)

				{

					for(i=0;i<a-c+1;i++)

					{

						if(anarray[i]>anarray[i+1])

						{

							temp=anarray[i];

							anarray[i]=anarray[i+1];

							anarray[i+1]=temp;

						}

					}

				}

				for(c=0;c<a+1;c++)

				{
					int j;
					j=anarray[c];
					tr.append(j+"\t");
					x=anarray[c+1]-anarray[c];
					count=count+x;
					if(anarray[c]==h)
					{
						count=count-x;
						count=count+anarray[c+1];
					}
					else;
					//tr.append(String.valueOf());
				}
				System.out.println(count);
				Ta.setText(String.valueOf(count));
			}
		});

		btnScan.setBounds(1076, 274, 117, 25);
		contentPane.add(btnScan);
		
		JButton btnCscan = new JButton("C-SCAN");
		btnCscan.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnCscan.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				String inputh = Th.getText();
				String inputn = Tn.getText();
				
				Random r3 = new Random();
				
				int count=0, head, n,i, temp, j, ref_index=0;
				//System.out.println("Enter no.of cylinders:");
				n = Integer.valueOf(inputn);
				
				//System.out.println("Enter head pointer:");
				head = Integer.valueOf(inputh);
				
				tr.setText(String.valueOf(head)+"\t");
				int A[] = new int[n+1]; 
				//System.out.println("Enter the cylinders: ");
				for(i=0;i<n;i++)
				{
					A[i] = r3.nextInt(100)+1;
				}
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(A[i] < A[j])
						{
							temp = A[i];
							A[i] = A[j];
							A[j] = temp;
						}
					}
				}
				
				//System.out.println("Sorted array is:");
				/*for(i=0;i<n;i++)
				{
					System.out.print(A[i ]+"  ");
				}*/
			
				//System.out.println();		
				for(i=0;i<n;i++)
				{
					if(A[i] > head)
					{
						ref_index = i ;
						break;
					}
				}
				//System.out.println("Reference index is :" + ref_index+"\nReference array is:");
				
				int R[] = new int[ref_index+1];
				for(j=0;j<ref_index;j++)
				{
					R[j] = A[j];
					//System.out.print(R[j]);
				}
				
				//System.out.println("Head value is:" + head);
				for(i=0;i<n;i++)
				{
					if(head < A[i])
					{
						count = count + Math.abs(head - A[i]);
						head = A[i];
						System.out.println("Updated head : " + head);
						tr.append(head+"\t");
						
					}
					//Ta.setText(String.valueOf(count));
				}
				
				//head = 199;
				count = count + Math.abs(A[n-1] - 199) + 199 + R[0] ;
				head = R[0];
				
				//System.out.println("Count is: " + count);
				for(i=0;i<ref_index;i++)
				{
					count = count + Math.abs(head - A[i]);
					//System.out.println("Count is: " + count);
				}
				

				//System.out.println("No.of cylinders :" + count);
				Ta.setText(String.valueOf(count));
				tr.append(String.valueOf(A[i]));
				
			}
		});


		btnCscan.setBounds(1076, 334, 117, 25);
		contentPane.add(btnCscan);
		
		JButton btnLook = new JButton("LOOK");
		btnLook.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnLook.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e){
				
				String inputh = Th.getText();
				String inputn = Tn.getText();
				
				//Random r3 = new Random();
				
				int a,a1,b,c,k=0,d=1,i,j,hm=0,head,temp;

				Random ran = new Random();
				//System.out.print("Enter no. of processes:");
				a1=Integer.valueOf(inputn);
				//System.out.print("Enter Head position:");
				b=Integer.valueOf(inputh);
				a=a1+1;
				tr.setText(inputh+"\t");
				int anarray[]=new int[a+2];
				anarray[0]=b;
				for(c=1;c<a;c++)
				{
					anarray[c]=ran.nextInt(500)+1;
					d++;
				}
				  for (i = 0; i < a; i++) 
		        {
		            for (j = i + 1; j < a; j++) 
		            {
		                if (anarray[i] > anarray[j]) 
		                {
		                    temp = anarray[i];
		                    anarray[i] = anarray[j];
		                    anarray[j] = temp;
		                }
		            }
		        }
			for(c=0;c<a;c++)

				{
					if(anarray[c]==b)
					{
						k=c;
					}
				}

				head=0;

				for(c=k;c<a;c++)

				{   if(c+1<a)

					{

					 head=anarray[c]-anarray[c+1];

					if(head<0)

					{

						head=head*(-1);

					}
					tr.append(head+"\t");
				//System.out.print("| "+anarray[c]);

					hm=hm+head;}

				}	

				//if(k!=0)

				head=anarray[c-1]-anarray[0];
				for(c=k-1;c>=0;c--)

				{
					if(c-1>-1)
					{
					head=anarray[c]-anarray[c-1];
					if(head<0)
					{
						head=head*(-1);

					}
					//System.out.print("| "+anarray[c]);
					tr.append(head+"\t");
					hm=hm+head;
					}

				}
				Ta.setText(String.valueOf(hm));

				} 

			}
);
		btnLook.setBounds(1076, 397, 117, 25);
		contentPane.add(btnLook);
		
		JButton btnClook = new JButton("C-LOOK");
		btnClook.setFont(new Font("Segoe Print", Font.BOLD, 14));
		
		btnClook.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				String inputh = Th.getText();
				String inputn = Tn.getText();
				tr.setText(inputh);
				Random r4 = new Random();
				
				int a,b,c,k=0,d=1,i,count=0,head,temp;
				int anarray[]=new int[30];
				//System.out.print("\n\n program name:clook Disk scheduling\n\n");
				//System.out.println("Enter no.of cylinders:");
				a=Integer.valueOf(inputn);
				//System.out.println("head pointer:");
				b=Integer.valueOf(inputh);
				//System.out.println("Enter cylinders:");
				for(c=0;c<a;c++)
					{
					//System.out.print("request# "+d+":");
					anarray[c]=r4.nextInt(100)+1;
					d++;
					}
				//System.out.print("\n");
				anarray[c]=b;
				for(c=0;c<=a-1;c++)
					{
					for(i=0;i<=a-1-c;i++)
						{
						if(anarray[i]>anarray[i+1])
							{
							temp=anarray[i];
							anarray[i]=anarray[i+1];
							anarray[i+1]=temp;
							}
						}
					}
				for(c=0;c<a;c++)
					{
					if(anarray[c]==b)
						{
						k=c;
						}
					}
				for(c=k;c<a;c++)
					{
					head=anarray[c]-anarray[c+1];
					/*if(head<0)
						{
						head=head*(-1);
						}*/
					//System.out.print("|"+anarray[c]+"-"+anarray[c+1]+"|"+"+");
					count=count+head;
					tr.append(head+"\t");
					}
				head=anarray[c]-anarray[0];
				count=count+head;
				
				//System.out.print("|"+anarray[c]+"-"+anarray[0]+"|");
			
			for(c=0;c<k-1;c++)
				{
				head=anarray[c]-anarray[c+1];
			/*	if(head<0)
					{
					head=head*(-1);
					}
				if(c<k-1)
					{
					System.out.print("+");
					}*/
				tr.append(head+"\t");
				count=count+head;
				//System.out.print("|"+anarray[c]+"-"+anarray[c+1]+"|");
				}
			//System.out.print(count);
			//System.out.println("Count is"+count);
			Ta.setText(String.valueOf(count));
		}
		}
);

		btnClook.setBounds(1076, 460, 117, 25);
		contentPane.add(btnClook);
		
		JLabel lblHead = new JLabel("Head:");
		lblHead.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblHead.setBounds(157, 170, 89, 37);
		contentPane.add(lblHead);
		
		
		JLabel lblProcesses = new JLabel("No.of requests:");
		lblProcesses.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblProcesses.setBounds(481, 175, 157, 26);
		contentPane.add(lblProcesses);
		
		
		
		JLabel lblCount = new JLabel("Total head movements:");
		lblCount.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblCount.setBounds(450, 267, 146, 37);
		contentPane.add(lblCount);
		
		JLabel lblDiskSchedulingAlgorithms = new JLabel("DISK SCHEDULING ALGORITHMS");
		lblDiskSchedulingAlgorithms.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblDiskSchedulingAlgorithms.setBounds(393, 47, 503, 62);
		contentPane.add(lblDiskSchedulingAlgorithms);
		
		JLabel lblNoofHeadMovements = new JLabel("No.of head movements:");
		lblNoofHeadMovements.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblNoofHeadMovements.setBounds(442, 466, 195, 49);
		contentPane.add(lblNoofHeadMovements);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
				public void actionPerformed(ActionEvent arg0) {
					Buttons b = new Buttons();
					b.Method();
				//}
			}
		});
		btnHome.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		btnHome.setBounds(1053, 547, 170, 62);
		contentPane.add(btnHome);
		
		
		
	}
}
