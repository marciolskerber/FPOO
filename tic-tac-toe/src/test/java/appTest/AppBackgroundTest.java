package appTest;

import java.net.URL;

import javax.swing.ImageIcon;

import ticTacToe.gui.MainWindow;
import ticTacToe.gui.Table;

public class AppBackgroundTest {

	static ImageIcon loadImage(String pathWithFileName) {
		URL url = AppBackgroundTest.class.getResource(pathWithFileName);
		return new ImageIcon(url);
	}

	public static void main(String[] args) {
		final String path = "../ticTacToe/images/";

		MainWindow window = new MainWindow();

		ImageIcon icon = loadImage(path + "background.jpg");
		window.setBackground(icon);

		icon = loadImage(path + "tic-tac-toe.png");
		Table table = new Table(50, 50, 200, 200, icon);
		window.add(table);

	}

}
