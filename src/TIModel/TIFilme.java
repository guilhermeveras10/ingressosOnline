package TIModel;

import java.io.Serializable;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class TIFilme implements Serializable {

	private int idFilme;
	private String titulo;
	private String classificacao;
	private String diretor;
	
	
	public TIFilme(String titulo, String classificacao, String diretor){
		this.setIdFilme(0);
		this.setTitulo(titulo);
		this.setClassificacao(classificacao);
		this.setDiretor(diretor);
	}
	public TIFilme(){
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}

	
}
