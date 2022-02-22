package de.zobelle;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MitarbeiterverwaltungClient {
	public static void main(final String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// Zugriff auf die Registry
		final Registry registry = LocateRegistry.getRegistry("localhost", 2002);

		// Referenz auf die Instanz ueber Interface und Stub...
		final Mitarbeiterverwaltung server = (Mitarbeiterverwaltung) registry.lookup("Mitarbeiterverwaltung");

		server.addMitarbeiter(new Mitarbeiter(1, "Lennert", "Zobel"));
		server.addMitarbeiter(new Mitarbeiter(2, "Elena", "Tremmel"));
		server.addMitarbeiter(new Mitarbeiter(3, "Jule", "Raible"));
		server.addMitarbeiter(new Mitarbeiter(4, "Patrick", "Lang"));

		final int mitarbeiternummer = 1;
		final Mitarbeiter mitarbeiter1 = server.getMitarbeiter(mitarbeiternummer);
		System.out.println("########## Mitarbeiter " + mitarbeiternummer + " ##########");
		System.out.println(mitarbeiter1 + "\n");

		System.out.println("########## Alle Mitarbeiter ##########");
		final Mitarbeiter[] alleMitarbeiter = server.getAlleMitarbeiter();
		for (final Mitarbeiter mitarbeiter : alleMitarbeiter) {
			System.out.println(mitarbeiter);
		}
	}
}