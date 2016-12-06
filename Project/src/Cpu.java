import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Random;

import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;

public class Cpu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField t0;
	private JTextField tr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpu frame = new Cpu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Method1()
	{
		Cpu window = new Cpu();
		window.frame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public Cpu() {
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
		
		JMenuItem mntmHome = new JMenuItem("Homepage");
		mntmHome.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)    {
			Buttons x= new Buttons();
			x.Method();
			}
		});
		mnFile.add(mntmHome);
		
		JMenuItem mntmOpenSimulation = new JMenuItem("Open Simulation");
		mntmOpenSimulation.setEnabled(false);
		mntmOpenSimulation.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)  {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				JLabel jTextField_path = null;
				jTextField_path.setText(filename);
			}
		});
		
		mnFile.add(mntmOpenSimulation);
		
		JMenuItem mntmSaveSimulation = new JMenuItem("Save simulation");
		mnFile.add(mntmSaveSimulation);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);
		
	
		JMenu mnDiskscheduling = new JMenu("Disk");
		
		
		t0 = new JTextField();
		t0.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t0.setBounds(364, 133, 74, 30);
		
		contentPane.add(t0);
		t0.setColumns(10);
		
		JTextArea t1 = new JTextArea();
		t1.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t1.setBackground(Color.DARK_GRAY);
		t1.setForeground(Color.WHITE);
		t1.setBounds(127, 189, 741, 387);
		
		contentPane.add(t1);
		
		JTextArea t2 = new JTextArea();
		t2.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t2.setBounds(206, 623, 189, 30);
		contentPane.add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setFont(new Font("Segoe Print", Font.BOLD, 15));
		t3.setBounds(475, 623, 229, 30);
		contentPane.add(t3);
		
		
		JButton btnFcfs = new JButton("FCFS");
		btnFcfs.setFont(new Font("Segoe Print", Font.BOLD, 14));
		
		btnFcfs.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e)   {
				
				String input = t0.getText();
				int n;
				int AT,CT=0,TAT=0,WT;
				Random random=new Random();
				n = Integer.valueOf(input);
				//t0.append("Enter no.of processes:"+n);
				int burst[]=new int[n];
				int wait[]=new int[n];
				int comp[]=new int[n];
				int tat[]=new int[n];
		
				for(int i=0;i<n;i++)
				{
					burst[i]=random.nextInt(100)+1;
				}
				t1.setText("Burst time\t"+"Turn-around time\t"+"Waiting time\n");
		
		
				float AWT=0;		
		///CT=0;
				for(int i=0;i<n;i++)
				{
					CT=CT+burst[i];
					comp[i]=CT;	
				}
		//TAT=0;
				for(int i=0;i<n;i++)
				{
					TAT=comp[i]-i;
					tat[i]=TAT;
				}
		
				WT=0;
				for(int i=0;i<n;i++)
				{
					WT=WT+(tat[i]-burst[i]);
					wait[i]=WT;
				}
				for(int i=0;i<n;i++)
				{
					t1.append(burst[i]+"\t"+tat[i]+"\t\t"+wait[i]+"\n");
				}
				AWT = WT/n;
				t2.setText("Total waiting time:"+WT);
		
				t3.setText("Avg waiting time:"+AWT);
			}
		});
		btnFcfs.setBounds(1170, 242, 117, 25);
		contentPane.add(btnFcfs);
		
		class struct
		{
			int pid;
			int at;
			int bt;
			int ct;
			int tat;
			int wt;	
		}
		
		JButton btnSjfpreemitive = new JButton("SJF(non-preemitive)");
		btnSjfpreemitive.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnSjfpreemitive.addActionListener(new ActionListener()		{
			public void actionPerformed(ActionEvent e)		{
				String input = t0.getText();
				Random r1=new Random();
				Random r2=new Random();
				//BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
				int n;
				n = Integer.valueOf(input);
				//t0.setText("enter the no.of processes"+n);
				struct s[]=new struct[n+1];
				int flag[]=new int[n+1];
				for(int i=1;i<=n;i++)	
				{
					s[i]=new struct();
					s[i].pid=i;
					
					s[i].at=(r1.nextInt(100)+1);
					
					s[i].bt=(r2.nextInt(100)+1);
					
					s[i].ct=0;
					s[i].tat=0;
					
					s[i].wt=0;
					flag[i]=0;
					
				}
				//System.out.println("pid"+"\t" +"arrival time"+"\t"+"burst time"+"\t"+"CT"+"\t"+"TAT"+"\t"+"WT");
				/*for(int i=1;i<=n;i++)
				{
					System.out.println(s[i].pid+"\t"+s[i].at+"\t"+s[i].bt+"\t"+s[i].ct+"\t"+s[i].wt+"\t"+s[i].tat);
				}*/
				System.out.println();
				int marr;
				int fmin;
				int c=0;
				int count=1;
				int temp[]=new int[n];
				
				while(ret(flag,n)==0 || ret(flag,n)==-1)  
				{
					if(ret(flag,n)==0)
					{
						marr=min(s,n); 
						s[marr].ct=s[marr].at+s[marr].bt;
						c=s[marr].ct;
						
						flag[marr]=1;
					}
					else if(ret(flag,n)==-1)
					{
					count = 1;
						for(int i=1;i<=n;i++)
						{
							if(flag[i]!=1 && s[i].at<=c)
							{
								
								temp[count]=i;
								
								count++;
								
							}
						}
						fmin=fmin(temp,count,s);
						s[fmin].ct=c+s[fmin].bt;
						c=s[fmin].ct;
						flag[fmin]=1;
					} 
				}
				int twt=0;
				for(int i=1;i<=n;i++)
				{
					s[i].tat=s[i].ct-s[i].at;
					
					s[i].wt=s[i].tat-s[i].bt;
					twt=twt+s[i].wt;
				}
				float awt;
				awt=twt/n;
				t1.setText("pid"+"\t" +"arrival time"+"\t"+"burst time"+"\t"+"CT"+"\t"+ "TAT"+"\t"+"WT\n");
				for(int i=1;i<=n;i++)
				{
					t1.append(s[i].pid+"\t"+s[i].at+"\t"+s[i].bt+"\t"+s[i].ct+"\t"+s[i].wt+"\t"+s[i].tat+"\n");
				}
				t2.setText("average waiting time"+" "+awt);

			}
			public int ret(int[] flag,int n)    
			{
				int f=0;
				int c=0;
				int c1=0;
				for(int i=1;i<=n;i++)
				{
					if(flag[i]==0)
					{
						f=0;
						c++;
					}
					else 
					{
						f=1;
						c1++;
					}
				}
				if(f==0 && c==n)
				{
					return 0;
				}
				else if(f==1 && c1==n)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
			public int min(struct[] s,int n)
			{
				int k=s[1].at,min=1;
				for(int i=1;i<=n;i++)
				{
					if(s[i].at <= k)
					{
						k = s[i].at;
						min = i;
					}
			
				}
				return min;
			} 
			public int fmin(int[] temp,int count,struct[] s)
			{
				int h;
				int g=1;
				int j=1;
				for(int i=1;i<count;i++)
				{
						if(i==1)
						{
							h=temp[i];
							g=s[h].bt;
							j=h;
						}
						h=temp[i];
						if(s[h].bt <g)
						{
							g=s[h].bt;
							j=h;
						}
					}
			return j;

				
			}
		});
		btnSjfpreemitive.setBounds(1170, 298, 111, 25);
		contentPane.add(btnSjfpreemitive);
		
		JButton btnSjfnonpreemitive = new JButton("SJF(preemitive)");
		btnSjfnonpreemitive.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnSjfnonpreemitive.setBounds(1170, 358, 117, 25);
		contentPane.add(btnSjfnonpreemitive);
		
		JButton btnPriority = new JButton("Priority");
		btnPriority.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnPriority.addActionListener(new ActionListener()		{
			public void actionPerformed(ActionEvent e)		{
				Random rn = new Random();
				String input = t0.getText();
				int n,i,j,total=0;
				float average_wait;
				n = Integer.valueOf(input);	
				//t0.setText("no.of process:"+n);
				int p[]=new int[n];
				int burst[]=new int[n];
				int wait[]=new int[n];
				int pid[]=new int[n];

				for(i=0;i<n;i++)
				{
					//System.out.println("enter burst ime for p"+(i+1));
					burst[i]=rn.nextInt(100);
					//System.out.println("Process "+ i +" Burst time: "+burst[i]);
					//System.out.println("enter priority:");
					p[i]=rn.nextInt(10)+1;
					pid[i]=i+1;
				}
				
				for(i=0;i<n;i++)
				{
					int pos = i;
					for(j=i+1;j<n;j++)
					{
						if(p[j]<p[pos])
							pos = j;
					}
			
					int temp = p[i];
					p[i] = p[pos];
					p[pos] = temp;
					
					temp = burst[i];
					burst[i] = burst[pos];
					burst[pos] = temp;
			
					temp = pid[i];
					pid[i] = pid[pos];
					pid[pos] = temp;
					
				}	
			
				wait[0] = 0;
			
				for(i=1; i<n; i++)
				{
					wait[i] = 0;
					for(j=0; j<i; j++)
						wait[i] += burst[j];
					total+= wait[i];
				}
				average_wait = (total)/n;
					total = 0;
					
				t1.setText("Process\t  Burst time\t Waiting time\n");
				for(i=0; i<n; i++)
				{
					t1.append("P" + pid[i]+ "\t" + burst[i] + "\t" + wait[i]+"\n");
				}
				t3.setText("Average waiting time is:"+ average_wait);
			}
		});
		btnPriority.setBounds(1170, 418, 117, 25);
		contentPane.add(btnPriority);
		
		JButton btnRoundRobin = new JButton("Round robin");
		btnRoundRobin.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnRoundRobin.addActionListener(new ActionListener()		{
			public void actionPerformed(ActionEvent e)		{
				
				
				
				Random r=new Random();
				String input = t0.getText();
				String rr = tr.getText();
				Random r1=new Random();
				int count,j,n,time,remaining,flag=0,tq;
				int wt=0,tat=0;

				int At[]=new int[100];

				int Bt[]=new int[100];

				int Rt[]=new int[100];
				n = Integer.valueOf(input);
				tq = Integer.valueOf(rr);
				//t0.setText("No.of process:"+n+"\t"+"Time-quantum:"+tq);
				remaining=n;
				for(count=0;count<n;count++)
				{				
					At[count]=count+1;
					Bt[count]=r1.nextInt(100)+1;
					Rt[count]=Bt[count];
				}
				
				t1.setText("PID:\t"+"arrival time\t"+"burst time\t"+"TAT\t"+"WT\n");
				for(time=0,count=0;remaining!=0;)
				{
					if(Rt[count]<=tq && Rt[count]>0)
					{

						time=time+Rt[count];
						Rt[count]=0;
						flag=1;
					}
					else if(Rt[count]>0)
					{
						Rt[count]=Rt[count]-tq;
						time=time+tq;
					}
					
					if(Rt[count]==0 && flag==1)
					{
						remaining=remaining-1;
						//System.out.println("PID:\t"+"TAT\t"+"WT\n");
						t1.append((count+1)+"\t"+At[count]+"\t"+Bt[count]+"\t"+(time-At[count])+"\t"+(time-At[count]-Bt[count])+"\n");
						wt=wt+(time-At[count]-Bt[count]);
						tat=tat+(time-At[count]);
						flag=0;		
					}
					if(count==(n-1))
					{
						count=0;
					}
					else if(At[count+1]<=time)
					{
						count=count+1;
					}
					else
					{
						count=0;
					}
					
					
				}
				double u=wt*1.0/n;
				double v=tat*1.0/n;
				t2.setText("Total Waiting Time:"+wt);
				//System.out.println(wt);
				t3.setText("Average Waiting Time:"+u);
				//System.out.println(u);
				//System.out.println("Average Turnaroundtime:");
				//System.out.println(v);

			}
		});
		btnRoundRobin.setBounds(1170, 480, 117, 25);
		contentPane.add(btnRoundRobin);
		
		JLabel lblEnterNoofProcess = new JLabel("Enter no.of process:");
		lblEnterNoofProcess.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblEnterNoofProcess.setBounds(160, 136, 177, 21);
		contentPane.add(lblEnterNoofProcess);
		
		JLabel lblTimequantum = new JLabel("Time-quantum for RR:");
		lblTimequantum.setBounds(514, 126, 157, 37);
		contentPane.add(lblTimequantum);
		
		tr = new JTextField();
		tr.setBounds(741, 127, 74, 30);
		contentPane.add(tr);
		tr.setColumns(10);
		
		JLabel lblCpuSchedulingAlgorithms = new JLabel("CPU SCHEDULING ALGORITHMS");
		lblCpuSchedulingAlgorithms.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 25));
		lblCpuSchedulingAlgorithms.setBounds(364, 34, 450, 63);
		contentPane.add(lblCpuSchedulingAlgorithms);
		
		JButton btnBack = new JButton("HOME");
		btnBack.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {
				public void actionPerformed(ActionEvent arg0) {
					Buttons b = new Buttons();
					b.Method();
				}
			//}
		});
		btnBack.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(1149, 571, 169, 53);
		contentPane.add(btnBack);
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
