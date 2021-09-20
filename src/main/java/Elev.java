import java.util.List;

public class Elev extends Utilizator{

	public Elev(String nume, int varsta, String ocupatie) {
		super(nume, varsta, ocupatie);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "nume " + this.getNume() + " varsta " + this.getVarsta() + " ocupatie " + this.getOcupatie();
	}

	@Override
	public void viewUtilizatori(List<Utilizator> etapa) {
		// TODO Auto-generated method stub
		System.out.println("Utilizatorul " + this.getNume() + " se uita la etapa de vaccinare");
		for(Utilizator u: etapa) {
			System.out.println(u);
		}
	}
}
