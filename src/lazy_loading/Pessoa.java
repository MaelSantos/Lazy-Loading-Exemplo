package lazy_loading;

public class Pessoa {

	private int id;
	private String nome;
	private String cfp;

	public Pessoa(int id, String nome, String cfp) {
		super();
		this.id = id;
		this.nome = nome;
		this.cfp = cfp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCfp() {
		return cfp;
	}

	public void setCfp(String cfp) {
		this.cfp = cfp;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cfp=" + cfp + "]";
	}
}
