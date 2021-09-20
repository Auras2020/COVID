import java.util.List;

public class Doctor extends Utilizator{

	public Doctor(String nume, int varsta, String ocupatie) {
		super(nume, varsta, ocupatie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewUtilizatori(List<Utilizator> etapa) {
		// TODO Auto-generated method stub
		System.out.println("Utilizatorul " + this.getNume() + " se uita la etapa de vaccinare");
		for(Utilizator u: etapa) {
			System.out.println(u);
		}
	}

	public String toString() {
		return "nume " + this.getNume() + " varsta " + this.getVarsta() + " ocupatie " + this.getOcupatie();
	}
}
