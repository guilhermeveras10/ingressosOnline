package TIModel;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Timer;

public class TISessao implements Serializable {
	
	private int idSessao;
	private Timer horario;
	private TISala sala;
	
	public int getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	public Timer getHorario() {
		return horario;
	}
	public void setHorario(Timer horario) {
		this.horario = horario;
	}
	public TISala getSala() {
		return sala;
	}
	public void setSala(TISala sala) {
		this.sala = sala;
	}
}
