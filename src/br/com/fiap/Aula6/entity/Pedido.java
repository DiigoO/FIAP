package br.com.fiap.Aula6.entity;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6085307121572016872L;
	private int id;
	private int idCliente;
	private Date date;
	private String descricao;
	private double valor;
	
	public Pedido(int idCliente, Date date, String descricao, double valor) {
		super();
		this.idCliente = idCliente;
		this.date = date;
		this.descricao = descricao;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
