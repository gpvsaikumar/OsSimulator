import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSlider;

public class Memory extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory frame = new Memory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Method2()
	{
		Memory window = new Memory();
		window.frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Memory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,2000,715);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		mntmOpenSimulation.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)  {
		
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				JLabel jTextField_path = null;
				jTextField_path.setText(filename);
				mnFile.add(mntmOpenSimulation);
			}
		});
		mnFile.add(mntmOpenSimulation);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);
		
		
		t4 = new JTextField();
		t4.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t4.setBounds(423, 119, 103, 34);
		contentPane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t5.setBounds(660, 119, 103, 34);
		contentPane.add(t5);
		t5.setColumns(10);
		
		JTextArea T7 = new JTextArea();
		T7.setFont(new Font("Segoe Print", Font.BOLD, 15));
		T7.setBounds(396, 622, 137, 35);
		contentPane.add(T7);
		
		JTextArea T6 = new JTextArea();
		T6.setFont(new Font("Segoe Print", Font.BOLD, 15));
		T6.setForeground(Color.WHITE);
		T6.setBackground(Color.DARK_GRAY);
		T6.setBounds(89, 177, 763, 434);
		contentPane.add(T6);
		
		
		JButton btnFifo = new JButton("FIFO");
		btnFifo.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnFifo.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
		//import java.io. * ;
				String fi = t4.getText();
				String input = t5.getText();
				Random random = new Random();
				int t;
				int n;
				//BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));

				//System.out.println("Enter the number of inputs :");
				n = Integer.valueOf(input);
				t = Integer.valueOf(fi);

				int inp[] = new int[n];
				int frame[] = new int[t];
				//System.out.println("Enter the input sequence:");

				for (int i = 0; i < n; i++)
					inp[i] = random.nextInt(100)+1;

				for (int i = 0; i < t; i++)
				frame[i] = -1;
				int h = 0;
				int f = 0;
				int j = 0;
				int check;
					
				T6.setText("\n");
				for (int i = 0; i < n; i++) {
					check = 0;

					for (int k = 0; k < t; k++)
					if (frame[k] == inp[i]) {
						check = 1;
						h = h + 1;
					}
					if (check == 0) {
						frame[j] = inp[i];
						j++;
						for(int k=0;k<t;k++)
						{
							T6.append(String.valueOf(frame[k])+"\t");
						}
						T6.append("\n");
						if (j >= t) j = 0;
						f = f + 1;
					}

				}
				T7.setText(String.valueOf(f));
			}
		});
		
		btnFifo.setBounds(1055, 177, 117, 25);
		contentPane.add(btnFifo);
		class KLRU
		{
		            int[] frame,page,present;
		            Random rn=new Random();
		            int size,pages,fault=0,flag=0,flag1=0;
		            KLRU(int size,int pages)
		            {
		                        this.size=size;
		                        this.pages=pages;
		                        frame=new int[size];
		                        present=new int[size];
		                        page=new int[pages];
			    }
		            
		            void get()
		            {
		                       // System.out.println ("Enter no.of pages:");
		                        for(int i=0;i<pages;i++)
		                                    page[i]=rn.nextInt(9)+1;
		                        for(int i=0;i<size;i++)
		                                    frame[i]=-1;
			    }

		            int check(int x)
		            {
		                        flag=-1;
		                        for(int i=0;i<size;i++)
		                                    if(frame[i]==x)
		                                    {
		                                                flag=i;
		                                                break;
						    }
		                        return flag;
			    }

		            int replace(int x)
		            {
		                        int i;
		                        for(i=0;i<size;i++)
		                                    present[i]=0;
		                        flag1=0;
		                        for(i=x-1;i>=0;i--)
		                        {
		                                    if(check(page[i])>=0)
		                                    {
		                                                flag1++;
		                                                present[check(page[i])]=1;
						    }
		                                    if(flag1==(size-1))
								break;
		                        }
		                        for(i=0;i<size;i++)
		                                    if(present[i]==0)
		                                    {
		                                                flag1=i;
		                                                break;
						    }
		                        return i;
		                    
		            }
		            
		            void lru()
		            {
					//System.out.println("\t"+"Frames");
		                        for(int i=0;i<pages;i++)
		                        {
		                                    if(i<size)
		                                    {
		                                                frame[i]=page[i];
		                                                fault++;
		                                                for(int j=0;j<size;j++)
		                                                	T6.append(frame[j]+"\t");
		                                                T6.append("\n");
						    }
		                                    else
		                                    {
		                                                if(check(page[i])==-1)
		                                                {
		                                                            int r=replace(i);
		                                                            frame[r]=page[i];
		                                                            fault++;
		                                                            for(int j=0;j<size;j++)
		                                                            	T6.append(frame[j]+"\t");
		                                                            T6.append("\n");
								}
		                                                else
		                                                {
		                                                            for(int j=0;j<size;j++)
		                                                                 T6.append(frame[j]+"\t");
		                                                            T6.append("\n");}}}

		                       T7.setText("page fault: "+fault);}}
		
		JButton btnLru = new JButton("LRU");
		btnLru.setFont(new Font("Segoe Print", Font.BOLD, 14));
		
		btnLru.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				String fi = t4.getText();
				String input = t5.getText();
				Random rn=new Random();
				int n,fr;
				fr = Integer.valueOf(input);
				n = Integer.valueOf(fi);
               // System.out.print("Enter frame-size:");
                
                //System.out.println(n);

                //System.out.print("Enter no of pages:");
                int p=rn.nextInt(10)+1;
                System.out.println(p);
                T6.setText("\n");
                KLRU t=new KLRU(n,p);
                t.get();
                t.lru();
			}
		});

		btnLru.setBounds(1055, 236, 117, 25);
		contentPane.add(btnLru);
		
		JButton btnOptimal = new JButton("Optimal");
		btnOptimal.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnOptimal.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				String input = t4.getText();
				String fi = t5.getText();
				
				int frames, h = 0, f = 0, n, t = 0;
				boolean check = false;
				int frame[];
				int A[];
				int B[][];
				Random rn=new Random();
				//System.out.println("Enter no.of frames: ");
				frames = Integer.valueOf(fi);
				n = Integer.valueOf(input);
				//System.out.println(frames);

				//System.out.println("Enter no.of pages: ");
				//n = rn.nextInt(10)+1;
				//System.out.println(n);

				A = new int[n];
				B = new int[n][frames];
				frame = new int[frames];
				for(int j = 0; j < frames; j++)
					frame[j] = -1;

				///System.out.println("Enter input sequence: ");
				for(int i = 0; i < n; i++)
				{
					A[i]=rn.nextInt(100)+1;
					//System.out.println(A[i]);
				}
				//System.out.println();
				T6.setText("\n");
				for(int i = 0; i < n; i++)
				{
					int available = -1;
					for(int j = 0; j < frames; j++)
					{
						if(frame[j] == A[i])
						{
							available = j;
							h++;
							break;
						} 
					}
					if(available == -1)
					{
						if(check)
						{
							int C[] = new int[frames];
							boolean c[] = new boolean[frames];
							for(int j = i + 1; j < n; j++)
							{
								for(int k = 0; k < frames; k++)
								{
									if((A[j] == frame[k]) && (c[k] ==false))
									{
										C[k] = j;
										c[k] = true;
										break;
									}
								}
							}
							int max = C[0];t = 0;
							if(max == 0)
								max = 200;
							for(int j = 0; j < frames; j++)
							{
								if(C[j] == 0)
									C[j] = 200;
								if(C[j] > max)
								{
									max = C[j];
									t = j;
								}
							}
						}
						frame[t] = A[i];
						f++;
						if(!check)
						{
							t++;
							if(t == frames)
							{
								t = 0;
								check = true;
							}
						}
					}
					for(int j = 0; j < frames; j++)
						B[i][j] = frame[j];
				}

				for(int i = 0; i < frames; i++)
				{
					for(int j = 0; j < n; j++)
						T6.append(B[j][i]+"\t");
					T6.append("\n");
				}

				//System.out.println("page hs: " + h);
				T7.setText(String.valueOf(f));
			}

		});

		btnOptimal.setBounds(1055, 295, 117, 25);
		contentPane.add(btnOptimal);
		
		JButton btnSecondchance = new JButton("Secondchance");
		btnSecondchance.setFont(new Font("Segoe Print", Font.BOLD, 14));

		class S
		{
			 int full=0;
			  int a[]=new int[100];
			  int ref[]=new int[3];
			  int frame[]=new int[3];
			  int repptr=0;
			  int count=0;
			  void display()
			{		int i;
					System.out.println("\nThe elements in the frame are\n");
					for(i=0;i<full;i++)
						System.out.println(frame[i]);
			 }
			  int Pagerep(int ele)
			{
				 int temp;
				 while(ref[repptr]!=0)
				{ 
					 ref[repptr++]=0;
					 if(repptr==3)
					     repptr=0;
				}                     
				 temp=frame[repptr];
				 frame[repptr]=ele;
				 ref[repptr]=1;
				 return temp;   
			}
			 void Pagefault(int ele)
			{
				if(full!=3)
				{
					ref[full]=1;
		       			frame[full++]=ele;
				}
		//else
		//System.out.println(Pagerep(ele));
			}
			   int Search(int ele)
			{     
				int i,flag;
		    		flag=0;
		    		if(full!=0)
		    		{
		    			for(i=0;i<full;i++)
		    			{	
		    				if(ele==frame[i])
		    				{  
		    			
		    					flag=1;
		        				ref[i]=1;
		       					 break;
		    				}
		    			}
		    		}
			 return flag;   
			}
		}
		btnSecondchance.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent e)	{
				
				Random r1 = new Random();
				String input = t4.getText();
				String fi = t5.getText();
				int n,i;
				
				//int a[]=new int[100];
		   		S m=new S();
				//Scanner in=new Scanner(System.in);
				//	System.out.println("Enter no .of pages");
				n = Integer.valueOf(fi);
				//System.out.println("Enter page nos");
		    			for(i=0;i<n;i++)
		    				m.a[i]=r1.nextInt(10)+1;
		    
		  	 		 for(i=0;i<n;i++)
		   	 		{
		                 	   		if(m.Search(m.a[i])!=1)
		                    		{
		                    			m.Pagefault(m.a[i]);
		                        			//display();
		                       	 	 	m.count++;
		                   	 	}
		   	 		}
		                   T7.setText(String.valueOf(m.count));
			}		
		});

		btnSecondchance.setBounds(1049, 356, 137, 25);
		contentPane.add(btnSecondchance);
	
		
		JLabel lblNoofProcesses = new JLabel("No.of pages:");
		lblNoofProcesses.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblNoofProcesses.setBounds(532, 115, 137, 39);
		contentPane.add(lblNoofProcesses);
		
		
		JLabel lblPageFaulte = new JLabel("Page Faults:");
		lblPageFaulte.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblPageFaulte.setBounds(278, 622, 98, 30);
		contentPane.add(lblPageFaulte);
		
		JLabel lblPageReplacementAlgorithms = new JLabel("PAGE REPLACEMENT ALGORITHMS");
		lblPageReplacementAlgorithms.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblPageReplacementAlgorithms.setBounds(311, 46, 487, 49);
		contentPane.add(lblPageReplacementAlgorithms);
		
		JLabel lblFrames = new JLabel("Frames:");
		lblFrames.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblFrames.setBounds(321, 118, 81, 34);
		contentPane.add(lblFrames);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//public void actionPerformed(ActionEvent arg0) {
					Buttons b = new Buttons();
					b.Method();
				//}
			}
		});
		btnHome.setBounds(1037, 533, 166, 55);
		contentPane.add(btnHome);
	}
}