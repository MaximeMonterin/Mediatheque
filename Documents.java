public class Documents {
	private int id;
	private String titre;
	private boolean sortable = false;
	private boolean emprunt = false;
	
	public Documents(int id, String titre, boolean sortable, boolean emprunt) {
		this.id = id;
		this.titre = titre;
		this.sortable = sortable;
		this.emprunt = emprunt;
	}
	
	public Documents(int id, String titre) {
		this.id = id;
		this.titre = titre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public boolean isSortable() {
		return this.sortable;
	}

	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}

	public boolean isEmprunt() {
		return this.emprunt;
	}
	
	public boolean emprunter() {
		if(this.isSortable() && this.isEmprunt()) {
			return true;
		}
		return false;
	}
	
	public boolean retourner() {
		if(this.isSortable() && this.isEmprunt() == false) {
			return true;
		}
		return false;
	}

	public void setEmprunt(boolean emprunt) {
		this.emprunt = emprunt;
	}
	
	
	
	
	
	
}
