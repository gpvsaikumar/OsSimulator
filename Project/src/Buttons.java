import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Window;
import javax.swing.JToolBar;
import javax.swing.JButton;

public class Buttons{

	private JFrame frame;
	private JPanel panel;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buttons window = new Buttons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Method()
	{
		Buttons window=new Buttons();
		window.frame.setVisible(true);
		
	}
	/**
	 * Create the application.
	 */
	public Buttons() {
		initialize();
	}

	/**
	  *Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Symbola", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().setBackground(SystemColor.controlShadow);
		frame.getContentPane().setBounds(new Rectangle(1000, 1000, 1000, 1000));
		frame.setBounds(0,0,2000,715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label1 = new JLabel("");
		Image images1 = new ImageIcon(this.getClass().getResource("/cpu1.png")).getImage(); 
		label1.setIcon(new ImageIcon(images1));
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.addMouseListener(new MouseListener()  {

			@Override
			public void mouseClicked(MouseEvent e)  {
				// TODO Auto-generated method stub
				System.out.println("you clicked on me!");
				frame.dispose();
				Cpu c1 = new Cpu();
				c1.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}
			
		});
		label1.setBounds(506, 273, 164, 144);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		Image images2 = new ImageIcon(this.getClass().getResource("/ram1.png")).getImage();
		label2.setIcon(new ImageIcon(images2));
		label2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label2.addMouseListener(new MouseListener()  {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("you clicked on memory management!");
				frame.dispose();
				Memory m = new Memory();
				m.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}			
		});

		label2.setBounds(671, 273, 156, 144);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		Image images3 = new ImageIcon(this.getClass().getResource("/disk1.png")).getImage();
		label3.setIcon(new ImageIcon(images3));
		label3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label3.addMouseListener(new MouseListener()  {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("you clicked on disk scheduling!");
				frame.dispose();
				Disk d = new Disk();
				d.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}			
		});
		label3.setBounds(495, 418, 174, 144);
		frame.getContentPane().add(label3);
		
		JLabel label = new JLabel("");
		Image images4 = new ImageIcon(this.getClass().getResource("/table11.png")).getImage();
		
		label.setIcon(new ImageIcon(images4));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		label.addMouseListener(new MouseListener()  {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("you clicked on disk scheduling!");
				frame.dispose();
				Dining dp = new Dining();
				dp.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println();
			}			
		});

		
		label.setBounds(671, 428, 156, 134);
		
		frame.getContentPane().add(label);

	
		JTextArea txtrWelcomeToGui = new JTextArea();
		txtrWelcomeToGui.setEditable(false);
		txtrWelcomeToGui.setDropMode(DropMode.INSERT);
		txtrWelcomeToGui.setForeground(new Color(153, 0, 102));
		txtrWelcomeToGui.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		txtrWelcomeToGui.setBackground(Color.LIGHT_GRAY);
		txtrWelcomeToGui.setText("                       OS SIMULATOR");
		txtrWelcomeToGui.setBounds(330, 126, 630, 48);
		frame.getContentPane().add(txtrWelcomeToGui);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 204, 255));
		menuBar.setBounds(0, 0, 1362, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.setSelected(true);
		mntmHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
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
		
		JMenuItem mntmSave = new JMenuItem("Save        (Ctrl+S)");
		mnFile.add(mntmSave);
		
		JMenuItem mntmExitf = new JMenuItem("Exit          (Alt+F4)");
		mntmExitf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExitf);
		
		JMenu mnProcesses = new JMenu("Processes");
		menuBar.add(mnProcesses);
		
		JMenuItem mntmProcessManagement = new JMenuItem("Process management");
		mnProcesses.add(mntmProcessManagement);
		
		JMenu mnMemory = new JMenu("Memory");
		menuBar.add(mnMemory);
		
		JMenuItem mntmMemoryManagement = new JMenuItem("Memory management");
		mnMemory.add(mntmMemoryManagement);
		
		JMenu mnDisk = new JMenu("Disk");
		menuBar.add(mnDisk);
		
		JMenuItem mntmDiskscheduling = new JMenuItem("Diskscheduling");
		mnDisk.add(mntmDiskscheduling);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.GRAY);
		toolBar.setBounds(0, 21, 1362, 48);
		frame.getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\sa1ku\\Desktop\\open.png"));
		btnNewButton.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)  {
		
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				JLabel jTextField_path = null;
				jTextField_path.setText(filename);
				mnFile.add(btnNewButton);
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\sa1ku\\Desktop\\save.png"));
		toolBar.add(btnNewButton_1);
		
		
		
		
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
