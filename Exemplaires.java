import java.util.Arrays;

public class Exemplaires {
	private Documents[] exemplaires;

	public Exemplaires(Documents[] exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Documents[] getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Documents[] exemplaires) {
		this.exemplaires = exemplaires;
	}
	
	public boolean estEmpruntable() {
		int cpt = 0;
		for (int i = 0; i < this.exemplaires.length; ++i) {
			if(this.exemplaires[i].isEmprunt() == false && this.exemplaires[i].isSortable() == true) {
				++cpt;
			}
		}
		if (cpt == this.exemplaires.length) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Exemplaires [exemplaires=" + Arrays.toString(exemplaires).toString() + "]";
	}
	
	
}
