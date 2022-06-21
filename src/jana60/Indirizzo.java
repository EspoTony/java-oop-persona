package jana60;

public class Indirizzo {
	// Attributi
		private String via;
		private String numeroCivico;
		private String citta;

		// Costruttore
		public Indirizzo(String via, String numeroCivico, String citta) {
			super();
			this.via = via;
			this.numeroCivico = numeroCivico;
			this.citta = citta;
		}

		// Copy Constructor
		public Indirizzo(Indirizzo indirizzo) {
			this(indirizzo.getVia(), indirizzo.getNumeroCivico(), indirizzo.getCitta());
		}
		// Getter and Setters

		public String getVia() {
			return via;
		}

		public void setVia(String via) {
			this.via = via;
		}

		public String getNumeroCivico() {
			return numeroCivico;
		}

		public void setNumeroCivico(String numeroCivico) {
			this.numeroCivico = numeroCivico;
		}

		public String getCitta() {
			return citta;
		}

		public void setCitta(String citta) {
			this.citta = citta;
		}

		// Metodi
		public String toString() {
			return via + ", " + numeroCivico + ", " + "( " + citta + ")";
		}

}
