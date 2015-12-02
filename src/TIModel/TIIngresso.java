package TIModel;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 * @author Bárbara Perina 
 * babiperina@edu.unifor.br
 *
 */
public class TIIngresso implements Serializable {
	
	private int idIngresso;
	private TISessao sessao;
	private TIUsuario usuario;
	private String data;
	
	
	public TIIngresso(TISessao sessao , TIUsuario usuario){
		this.sessao = sessao;
		this.usuario = usuario;
	}

	public TIIngresso(){
		
	}
	public TISessao getSessao() {
		return sessao;
	}

	public void setSessao(TISessao sessao) {
		this.sessao = sessao;
	}

	public TIUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(TIUsuario usuario) {
		this.usuario = usuario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getIdIngresso() {
		return idIngresso;
	}

	public void setIdIngresso(int idIngresso) {
		this.idIngresso = idIngresso;
	}

}
