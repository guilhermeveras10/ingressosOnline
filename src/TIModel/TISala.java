package TIModel;


/**
 * 
 * @author Guilherme Veras Teixeira Duarte
 * guilherme.veras10@hotmail.com
 *
 */
public class TISala {
	
	private int idSala;
	private int numero;
	private int qtdeLugares;
	private int valor;
	private boolean quatroD = false;
	private TIFilme filme;
	
	public TISala(int numero,int qtdLugares,int valor,boolean quatroD){
		this.numero = numero;
		this.setIdSala(0);
		this.qtdeLugares = qtdLugares;
		this.valor = valor;
		this.quatroD = quatroD;
	}
	public TISala(){
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdeLugares() {
		return qtdeLugares;
	}
	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isQuatroD() {
		return quatroD;
	}
	public void setQuatroD(boolean quatroD) {
		this.quatroD = quatroD;
	}
	
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public TIFilme getFilme() {
		return filme;
	}
	public void setFilme(TIFilme filme) {
		this.filme = filme;
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	private boolean vip = false;

}
