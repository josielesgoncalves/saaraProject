package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeBean {
	
	List<String> listaTeste = new ArrayList<String>();
	
	String teste = "teste";
	
	public HomeBean() {
		listaTeste.add("teste1");
		listaTeste.add("teste2");
		listaTeste.add("teste3");
		listaTeste.add("teste4");
		listaTeste.add("teste5");
	}

	public List<String> getListaTeste() {
		return listaTeste;
	}

	public void setListaTeste(List<String> listaTeste) {
		this.listaTeste = listaTeste;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	
}
