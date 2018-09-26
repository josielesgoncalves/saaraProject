package bd.dbo;

public class Usuario
{
	private String email;
	private String nome;
	private String senha;
	private int semestre;
	private String curso;
	
	public Usuario (String email, String nome, String senha) throws Exception
	{
		this.setEmail(email);
		this.setNome(nome);
		this.setSenha(senha);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	 
	 

	 
}

