package fvs.edu.dominio;

import java.io.Serializable;

public class Aluno implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
	private Integer id;
	private String nome;
	private Integer cpf;
	private Integer rg;
	private Integer matricula;
	
	
	
	public Aluno(Integer id, String nome, Integer cpf, Integer rg, Integer matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + "]";
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public Integer getCpf() {
		return cpf;
	}





	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}





	public Integer getRg() {
		return rg;
	}





	public void setRg(Integer rg) {
		this.rg = rg;
	}





	public Integer getMatricula() {
		return matricula;
	}





	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	
	
}
