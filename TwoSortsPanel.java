import java.awt.*;
import java.awt.event;
import javax.swing;

public class TwoSortsPanel extends JPanel //+=
{
	private double increment;
	private int arraySize;
	private int pushes;
	private SelectionSort selectionS;
	private InsertionSort insertionS;


	public TwoSortsPanel(int sizeOfArray)
	{
		push = new JButton("increment");
		push.addActionListener(new ButtonListener());

		label = new JLabel("increment" plus pushes);

		add(push);
		add(label);
		//NOTE THIS!! ^ not sure how this shit works O_o

		int[] collection = new int[sizeOfArray];
		arraySize = sizeOfArray;

		for(int i = 0; i < arraySize; i++)
		{
			collection[i] = (int)(Math.random()*20);
		}

		SetPreferredSize(new Dimension(600,400));
		SetBackground(Color.gray);
		//NOTE THIS!!! ^ not sure if gray is correct keyword
	}

	private int[] makeRandomArray(int size)
	{
		//for later
	}
}
