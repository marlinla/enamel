package Editor.templates;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameApp extends JFrame {

	public static void main(String[] args) throws FileNotFoundException {
		//set up a frame to test scanning
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		frame.setBounds(0, 0, 1024, 1024);
		panel.setBackground(new Color(255, 0, 0));
		frame.setVisible(true);
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		//scan scenario files and test if they load
		Scanner scenario = new Scanner(new File("./FactoryScenarios/Scenario_1.txt"));
		while (scenario.hasNextLine()) {
			KeyPhraseTemplate temp = new KeyPhraseTemplate(scenario.nextLine() +"\n");
			panel.add(temp);
		}
		
	}
}