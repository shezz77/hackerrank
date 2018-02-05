package TestCases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdapterClassEX extends WindowAdapter {

	JFrame jf;
	JLabel coord;
	
	
	public void gui(){
		jf = new JFrame();                 // got one frame "jf" added a container "c" into that frame and content pane
		Container c = new Container();
		c= jf.getContentPane();
		
		c.setLayout(new BorderLayout());       // set the layout of that content pane. and inserted a Jlabel "coord" in the north of the layout
		coord =  new JLabel();
		c.add(coord, BorderLayout.NORTH);
		
		jf.addWindowListener(this);            // registeration with handler class, since it is the same class, so i used "this" as parameter
		jf.setSize(350, 350);
		jf.setVisible(true);
		}
	
	public void WindowClosing(WindowEvent e){
		JOptionPane.showMessageDialog(null, "Allah hafiz");
		System.exit(0);
	}
	public AdapterClassEX(){
		gui();
	}
	public static void main(String args[]){
		AdapterClassEX ac = new AdapterClassEX();
		
	}
}
