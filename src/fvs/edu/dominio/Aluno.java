package fvs.edu.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private Integer matricula;
	
	
	public Aluno() {
		
		
	}
	
	
	
	public Aluno(Integer id, String nome, String cpf, String rg, Integer matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}



	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + "]";
	}
	
	
	
	

	
	
}
