import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

// ↦↕
@SuppressWarnings("serial") //not to be used for permanent storage
public class Decipher extends JFrame {
	private JPanel monoPanel, vigePanel;
	private JTabbedPane tabbedPane;
	public Decipher() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		monoPanel = new MonoPanel();
		vigePanel = new VigePanel();
		setUpTabbedPane();
		add(tabbedPane);
		setSize(500,500);
		setVisible(true);
	} private void setUpTabbedPane() {
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Monoalphabetic", null, monoPanel, "Monoalphabetic");
		tabbedPane.addTab("Vigenère", null, vigePanel, "Vigenère");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_M);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_V);
	}
	public static void main(String... args) {
		new Decipher();
	}
}
