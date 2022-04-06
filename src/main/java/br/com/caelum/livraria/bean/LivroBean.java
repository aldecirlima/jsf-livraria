package br.com.caelum.livraria.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	
	@PostConstruct
	public void posCriacao() {
		System.out.println("Objeto LivroBean foi criado.");
	}

	public void gravar() {
		System.out.println("Gravando Livro " + this.livro.getTitulo());
	}

	public Livro getLivro() {
		return livro;
	}

}
