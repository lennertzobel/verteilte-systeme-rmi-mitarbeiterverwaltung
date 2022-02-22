package de.zobelle;

import java.util.HashMap;
import java.util.Map;

public class MitarbeiterverwaltungImpl implements Mitarbeiterverwaltung {

	Map<Integer, Mitarbeiter> mitarbeiterliste = new HashMap<>();

	@Override
	public Mitarbeiter[] getAlleMitarbeiter() {
		final Mitarbeiter[] ma = new Mitarbeiter[mitarbeiterliste.size()];
		mitarbeiterliste.values().toArray(ma);
		return ma;
	}

	@Override
	public Mitarbeiter getMitarbeiter(final int mitarbeiternummer) {
		return mitarbeiterliste.get(mitarbeiternummer);
	}

	@Override
	public void addMitarbeiter(final Mitarbeiter mitarbeiter) {
		mitarbeiterliste.put(mitarbeiter.getMitarbeiternummer(), mitarbeiter);
	}

}
