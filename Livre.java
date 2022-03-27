public class Livre extends Documents {
	private String auteur;

	public Livre(int id, String titre, boolean sortable, boolean emprunt, String auteur) {
		super(id, titre, sortable, emprunt);
		this.auteur = auteur;
	}
	
	public Livre(int id, String titre, String auteur) {
		super(id, titre);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	@Override
	public String toString() {
		return "Livre [id=" + this.getId() + ", titre=" + this.getTitre() + ", sortable=" + this.isSortable() + ", emprunté=" + this.isEmprunt() + ", auteur" + this.getAuteur() + "]";
	}
}
