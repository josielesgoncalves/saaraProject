package views;

import java.util.Date;

public class Atividade {
	private Materia materia;
	private Date data;
	private String tipo;
	private String descricao;
	
	public Atividade(Materia materia, Date data, String tipo, String descricao) {
		this.materia = materia;
		this.data = data;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateriaView(Materia materia) {
		this.materia = materia;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
