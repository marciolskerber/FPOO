package appTest;

import java.net.URL;

import javax.swing.ImageIcon;

public class AppBackgroundTest {
	
	public static void main(String[] args) {
		final String path = "../ticTacToe/images/";
		
		MainWindow window = new MainWindow();
		URL url = AppBackgroundTest.class.getResource(path +"background.jpg");
		
		ImageIcon icon = new ImageIcon(url);
		window.setBackground(icon);
	}

}
