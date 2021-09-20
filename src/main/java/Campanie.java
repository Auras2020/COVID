import java.util.ArrayList;
import java.util.List;

public class Campanie {

	private List<Utilizator> etapa1=new ArrayList<>();
	private List<Utilizator> etapa2=new ArrayList<>();
	private List<Utilizator> etapa3=new ArrayList<>();
	private String nume;
	
	public Campanie(String nume) {
		this.nume=nume;
	}
	
	public void inscriere(Utilizator u) {
		if(u instanceof Doctor) {
			etapa1.add(u);
		}
		if(u instanceof Profesor || u.getVarsta()>65) {
			etapa2.add(u);
		}
		if(u instanceof Elev) {
			etapa3.add(u);
		}
	}
	
	public List<Utilizator> getEtapa1() {
		return etapa1;
	}
	public void setEtapa1(List<Utilizator> etapa1) {
		this.etapa1 = etapa1;
	}
	public List<Utilizator> getEtapa2() {
		return etapa2;
	}
	public void setEtapa2(List<Utilizator> etapa2) {
		this.etapa2 = etapa2;
	}
	public List<Utilizator> getEtapa3() {
		return etapa3;
	}
	public void setEtapa3(List<Utilizator> etapa3) {
		this.etapa3 = etapa3;
	}
	
	
}
