package de.zobelle;

import java.io.Serializable;

public class Mitarbeiter implements Serializable {
	private static final long serialVersionUID = -7123956475798874654L;

	private final int mitarbeiternummer;
	private final String vorname;
	private final String nachname;

	public Mitarbeiter(final int mitarbeiternummer, final String vorname, final String nachname) {
		this.mitarbeiternummer = mitarbeiternummer;
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [mitarbeiternummer=" + mitarbeiternummer + ", vorname=" + vorname + ", nachname=" + nachname
				+ "]";
	}
}
