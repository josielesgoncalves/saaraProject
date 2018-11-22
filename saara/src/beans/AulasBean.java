package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import views.AulasView;

@ManagedBean
@SessionScoped
public class AulasBean {
	private List<AulasView> aulas;
	private AulasView aulaSelecionada; //TODO Mudar pra entidade aqui pq precisa do id pra salvar no banco de volta depois
	
	AulasBean() {
		aulas.add(new AulasView());
	}
	
	public List<AulasView> getAulas() {
		return aulas;
	}
	public void setAulas(List<AulasView> aulas) {
		this.aulas = aulas;
	}
	public AulasView getAulaSelecionada() {
		return aulaSelecionada;
	}
	public void setAulaSelecionada(AulasView aulaSelecionada) {
		this.aulaSelecionada = aulaSelecionada;
	}
	
	
	
}
