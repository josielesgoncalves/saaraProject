package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import views.Atividade;
import views.Materia;


@ManagedBean
@SessionScoped
public class HomeBean {
	
	List<String> listaTeste = new ArrayList<String>();
	HashMap<String, Integer> dadosProgresso = new HashMap<>();
	List<Atividade> atividades = new ArrayList<>();
	
	String teste = "teste";
	
	public HomeBean() {
		listaTeste.add("teste1");
		listaTeste.add("teste2");
		listaTeste.add("teste3");
		listaTeste.add("teste4");
		listaTeste.add("teste5");
		
		dadosProgresso.put("teste1", 10);
		dadosProgresso.put("teste2", 20);
		dadosProgresso.put("teste3", 30);
		dadosProgresso.put("teste4", 40);
		dadosProgresso.put("teste5", 50);
		
		atividades.add(new Atividade(new Materia("Materia teste1"), new Date(), "tipo1", "descrição1"));
		atividades.add(new Atividade(new Materia("Materia teste2"), new Date(), "tipo2", "descrição2"));
		atividades.add(new Atividade(new Materia("Materia teste3"), new Date(), "tipo1", "descrição3"));
		atividades.add(new Atividade(new Materia("Materia teste4"), new Date(), "tipo2", "descrição4"));
		atividades.add(new Atividade(new Materia("Materia teste5"), new Date(), "tipo1", "descrição5"));
		atividades.add(new Atividade(new Materia("Materia teste6"), new Date(), "tipo1", "descrição6"));
		
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

	public HashMap<String, Integer> getDadosProgresso() {
		return dadosProgresso;
	}

	public void setDadosProgresso(HashMap<String, Integer> dadosProgresso) {
		this.dadosProgresso = dadosProgresso;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
}
