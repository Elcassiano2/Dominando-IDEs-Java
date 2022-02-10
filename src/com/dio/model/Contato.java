package com.dio.model;

import java.util.Objects;

public class Contato
{
	
	private String nome;
	private String endereco;
	private String telefone;
	private String empresa;
	
	
	public Contato(String nome, String endereco, String telefone, String empresa) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.empresa = empresa;
		
		
	}
		
	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(empresa, endereco, nome, telefone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(empresa, other.empresa) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}


	@Override
	public String toString() {
		return "***Contato***"+ "\n" + " Nome: " + nome + "\n" +  " Endereco: " + endereco + "\n" + " Telefone: " + telefone + "\n" + " Empresa: " + empresa;
	}
	
	
	
//	
	

}
