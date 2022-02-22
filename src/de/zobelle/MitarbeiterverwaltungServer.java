package de.zobelle;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MitarbeiterverwaltungServer {
	public static void main(final String[] args) {
		// Create and install a security manager
		System.setProperty("java.security.policy", "file:policy");
		if (System.getSecurityManager() == null) {
			System.out.println("Installing Security Manager...");
			System.setSecurityManager(new SecurityManager());
		}

		try {
			final int registryPort = 2002;
			System.out.println("Create registry on port: " + registryPort);
			final Registry registry = LocateRegistry.createRegistry(registryPort);

			// Export remote object
			final Mitarbeiterverwaltung stub = (Mitarbeiterverwaltung) UnicastRemoteObject
					.exportObject(new MitarbeiterverwaltungImpl(), 0);

			// Bind this object instance to the name "Calculator"
			registry.rebind("Mitarbeiterverwaltung", stub);

			System.out.println("MitarbeiterverwaltungImpl bound in registry");
		} catch (final Exception e) {
			System.out.println("StartRMIServer err: " + e.getMessage());
			e.printStackTrace();
		}

	}
}
