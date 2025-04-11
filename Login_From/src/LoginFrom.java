import javax.swing.*;

public class LoginFrom {
	
	private JFrame frame;
	private JLabel label1,label2;
	public LoginFrom() {
		frame= new JFrame("Login Form");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addLabel();
		frame.setVisible(true);
	}
	
	private void addLabel() {
		label1= new JLabel("Enter user name");
		label1.setBounds(20, 50, 120, 30);
		frame.add(label1);
		label2= new JLabel("Enter Password");
		label2.setBounds(20, 120, 120, 30);
		frame.add(label2);
	}
	public static void main(String[] args) {
		new LoginFrom();
	}
}
