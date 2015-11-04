package TIModel;

import java.io.Serializable;
import java.sql.Date;

public class TIIngresso implements Serializable {
	
	private int idIngresso;
	private TISessao sessao;
	private TIUsuario usuario;
	
	
	public TIIngresso(TISessao sessao , TIUsuario usuario){
		this.idIngresso = 0;
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

}
