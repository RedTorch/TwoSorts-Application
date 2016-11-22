import java.awt.*;
import java.awt.event;
import javax.swing.*;

public class TwoSorts{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("TwoSorts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new TwoSortsPanel(10));
		frame.setVisible(true);
		frame.pack();
	}
}