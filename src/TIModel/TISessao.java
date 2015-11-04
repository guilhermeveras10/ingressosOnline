package TIModel;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.security.Timestamp;
import java.sql.Time;
import java.util.Timer;

public class TISessao implements Serializable {
	
	private int idSessao;
	private Time horario;
	private TISala sala;
	
	public int getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	
	public Time getHorario() {
		return horario;
	}
	public void setHorario(Time horario) {
		this.horario = horario;
	}
	public TISala getSala() {
		return sala;
	}
	public void setSala(TISala sala) {
		this.sala = sala;
	}
}
