import javax.swing.*;
import Timer.Client;
import Timer.Serveur;

import java.awt.*;
import java.awt.event.*;

public class main {

	public static void main(String[] args) {

		accueil f1 = new accueil(); 



		String host = "127.0.0.1";
		int port = 2345;

		Serveur ts = new Serveur(host, port);
		ts.open();

		System.out.println("Serveur initialisé.");

		for(int i = 0; i < 5; i++){
			//Thread t = new Thread(new Client(host, port));
			//t.start();
		}

	}
}
