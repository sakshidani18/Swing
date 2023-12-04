import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame1 extends JFrame {
	
	public MyFrame1()//constructor
	{
		setSize(1000, 1000);
		setVisible(true);
		setTitle("My New Frame");
		setLayout(null);
		design();
		}
	public void design()
	{
		JLabel fname=new JLabel("Enter First Name :");
		fname.setBounds(100, 50, 100, 20);
		add(fname);
		// Center the text
	    fname.setHorizontalAlignment(JTextField.CENTER);
		
		
		JTextField txtfname=new JTextField();
		txtfname.setBounds(250, 50, 100, 20);
		add(txtfname);
		// Center the text
	    txtfname.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel lname=new JLabel("Enter Last Name:");
		lname.setBounds(100, 100, 100, 20);
		add(lname);
		
		JTextField txtlname=new JTextField();
		txtlname.setBounds(250, 100, 100, 20);
		add(txtlname);
		
		JButton submit= new JButton("Register");
		submit.setBounds(150, 150, 100, 20);
		add(submit);
		
		JLabel msg=new JLabel("Registration Form");
		msg.setBounds(150, 200, 150, 20);
		add(msg);
		
		
		
		
		
	}
	

}
