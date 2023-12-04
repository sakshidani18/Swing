import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame implements ActionListener {
	
	JButton submit;
	JLabel lblmsg;
	JTextField txtuname;
	JPasswordField txtpass;
	
	public MyFrame2()
	{
	setSize(1000, 1000);
	setVisible(true);
	setTitle("My New Frame");
	setLayout(null);
	design();
	}
	
	public void design()
	
	{
		
		
		JLabel uname=new JLabel("Enter Username :");
		uname.setBounds(100, 50, 100, 20);
		add(uname);
		
		txtuname=new JTextField();
		txtuname.setBounds(250, 50, 100, 20);
		add(txtuname);
		
		JLabel pass = new JLabel("Enter Password");
		pass.setBounds(100, 100, 100, 20);
		add(pass);
		
		txtpass=new JPasswordField();
		txtpass.setBounds(250, 100, 100, 20);
		add(txtpass);
		
		submit= new JButton("Login");
		submit.setBounds(150, 150, 100, 20);
		add(submit);
		submit.addActionListener(this);
	
		
		
		lblmsg=new JLabel();
		lblmsg.setBounds(100, 200, 200, 20);
		add(lblmsg);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==submit)
		{
			System.out.println("Login Button is clicked");
			
			String un=txtuname.getText();
			String pass=txtpass.getText();
			lblmsg.setText("Welcome User:"+un+" "+pass);
			
			txtuname.setText("");
			txtpass.setText("");
		}
		else
		{
			System.out.println("error");
		}
	
		
		
		
		
	}
}