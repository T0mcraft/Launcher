package fr.nukkit.swing;

import java.net.URL;

import javax.swing.JTextPane;

public class LoginFormThread extends Thread
{
	private JTextPane editorPane;

	public LoginFormThread(JTextPane editorPane)
	{
		this.editorPane = editorPane;
	}

	public void run()
	{
		try
		{
			editorPane.setPage(new URL("http://dl.nukkit-project.fr/news.php"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			editorPane.setText("Impossible de charger la page web ..." + e.toString());
		}
	}
}