import javax.swing.*;
import java.awt.*;
public class FrameWithAPanelWithWritingOnIt{
	public static void main(String[] args){
		Frame613 f = new Frame613();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
class Frame613 extends JFrame{
	private static final long serialVersionUID = 1L;

	public Frame613(){
		setTitle("Frame");
		setSize(300,200);
		setLocation(100,200);
		 Panel1613 panel = new Panel1613();
		 Container cp = getContentPane();
		 cp.add(panel);
	}
}
class Panel1613 extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Hi",75,100);
	}
}