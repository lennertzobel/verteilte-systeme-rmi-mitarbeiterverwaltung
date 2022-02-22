package de.zobelle;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mitarbeiterverwaltung extends Remote {
	Mitarbeiter[] getAlleMitarbeiter() throws RemoteException;

	Mitarbeiter getMitarbeiter(int mitarbeiternummer) throws RemoteException;

	void addMitarbeiter(Mitarbeiter mitarbeiter) throws RemoteException;
}
