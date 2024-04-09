package anonimous;

public class Film implements Comparable<Film>{
	
	private int id;
	private String titolo;
	private String registra;
	private int anno;
	private int rating;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegistra() {
		return registra;
	}
	public void setRegistra(String registra) {
		this.registra = registra;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", registra=");
		builder.append(registra);
		builder.append(", anno=");
		builder.append(anno);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Film altroFilm) {
		return this.anno-altroFilm.anno;
	}
	
	
	
}
