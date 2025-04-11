import javax.swing.JFrame;

public class Demo {

	static void createFrame() {
		JFrame frame= new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Shivam");
//		frame.setLocation(150, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
	  
		createFrame();

	}

}
