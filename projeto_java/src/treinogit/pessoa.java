package treinogit;

import java.util.Date;

public class pessoa {

	
		private String nome;
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		private String sobrenome;
		
		private int idade;

		public void setIdade(int idade) {
			this.idade = idade;
		}
		private Date dataNascimento;

		private Date DataNascimento;
		public int getIdade() {
			return idade;
		}
		
		public Date getDataNascimento() {
			return dataNascimento;
		}
		
		public void setDataNascimento(Date dataNascimento) {
			this.DataNascimento = dataNascimento;
		}
		
		
		
		
		
		
	

}
