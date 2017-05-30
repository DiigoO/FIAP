package br.com.fiap.Aula7_1.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L; 

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDUSUARIO")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "IDFORUM")
	private Forum forum;

	@Column(name = "NOME") 
	private String nome;

	@Column(name = "EMAIL")
	private String email;

	public Integer getId() { return id;
	}

	public void setId(Integer id) {
		this.id = id; 
	}

	public Forum getForum() { return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum; 
	}

	public String getNome() { return nome;
	}

	public void setNome(String nome) {
		this.nome = nome; 
	}

	public String getEmail() { return email;
	}

	public void setEmail(String email) {
		this.email = email; 
	}
}