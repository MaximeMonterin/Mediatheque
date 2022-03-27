import java.util.Arrays;

public class CD extends Documents{
	private String interprete;
	private String[] compositeur;
	
	public CD(int id, String titre, boolean sortable, boolean emprunt, String interprete, String[] compositeur) {
		super(id, titre, sortable, emprunt);
		this.interprete = interprete;
		this.compositeur = compositeur;
	}
	
	public CD(int id, String titre, String interprete, String[] compositeur) {
		super(id, titre);
		this.interprete = interprete;
		this.compositeur = compositeur;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String[] getCompositeur() {
		return compositeur;
	}

	public void setCompositeur(String[] compositeur) {
		this.compositeur = compositeur;
	}

	@Override
	public String toString() {
		return "CD [id=" + this.getId() + ", titre=" + this.getTitre() + ", sortable=" + this.isSortable() + ", emprunté=" + this.isEmprunt() + ", interprète=" + this.getInterprete() + ", compositeur=" + Arrays.toString(compositeur) + "]";
	}
	
	
}
