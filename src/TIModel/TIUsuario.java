package TIModel;

import java.io.Serializable;

public class TIUsuario implements Serializable{

		private int idUsuario;
		private int CPF;
		private String email;
		private String nome;
		private String senha;
		
		public TIUsuario(int CPF,String email,String nome,String senha ){
			this.idUsuario = 0;
			this.CPF = CPF;
			this.email = email;
			this.nome = nome;
			this.senha = senha;
		}
		public TIUsuario(){
			
		}
		public int getCPF() {
			return CPF;
		}
		public void setCPF(int cPF) {
			CPF = cPF;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
	}


