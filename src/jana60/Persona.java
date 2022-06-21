package jana60;

public class Persona {
	// Attributi
		private String nome;
		private String cognome;
		private Indirizzo indirizzo;

		// Costruttore
		public Persona(String nome, String cognome, Indirizzo indirizzo) {
			super();
			this.nome = nome;
			this.cognome = cognome;
			this.indirizzo = indirizzo;
		}

		// Getters and Setters

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public Indirizzo getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(Indirizzo indirizzo) {
			this.indirizzo = indirizzo;
		}

}
