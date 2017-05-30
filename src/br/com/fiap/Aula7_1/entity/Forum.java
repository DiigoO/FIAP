package br.com.fiap.Aula7_1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FORUM", schema = "forum")
public class Forum implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "IDFORUM")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "ASSUNTO", length = 45)
	private String assunto;
	@Column(name = "DESCRICAO", length = 45)
	private String descricao;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
			mappedBy = "forum")
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssunto() { 
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() { 
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}