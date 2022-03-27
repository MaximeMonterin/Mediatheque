public class Mediatheque {

	public static void main(String[] args) {
		// AJOUT D'UN EXEMPLAIRE
		Livre HarryPotter1 = new Livre(1, "Harry Potter à l'école des sorciers", true, false, "JK Rowling");
		Documents[] HarryPotter_1 = new Documents[1];
		HarryPotter_1[0] = HarryPotter1;
		
		Exemplaires HarryPotterEDS = new Exemplaires(HarryPotter_1);
		System.out.println(HarryPotterEDS.toString());
		System.out.println(HarryPotterEDS.estEmpruntable());
		System.out.println(HarryPotter1.emprunter());
		System.out.println(HarryPotter1.retourner());
		
		// AJOUT DE PLUSIEURS EXEMPLAIRES
		String[] compositeursCivilisation = new String[4];
		compositeursCivilisation[0] = "Skread";
		compositeursCivilisation[1] = "Phazz";
		compositeursCivilisation[2] = "The Neptunes";
		compositeursCivilisation[3] = "Orelsan";
		CD CivilisationNum1 = new CD(2, "Civilisation", true, true, "Orelsan", compositeursCivilisation);
		CD CivilisationNum2 = new CD(2, "Civilisation", false, false, "Orelsan", compositeursCivilisation);
		
		Documents[] CivilisationListe = new Documents[2];
		CivilisationListe[0] = CivilisationNum1;
		CivilisationListe[1] = CivilisationNum2;
		
		Exemplaires Civilisation = new Exemplaires(CivilisationListe);
		System.out.println(Civilisation.toString());
		System.out.println(Civilisation.estEmpruntable());

	}

}
