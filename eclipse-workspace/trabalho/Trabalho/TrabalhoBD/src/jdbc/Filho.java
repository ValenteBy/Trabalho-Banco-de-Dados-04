package jdbc;

public class Filho {
	
	private int codigo;
	private String nome;
	private int codigomae;
	
	public Filho(int codigo, String nome, int codigomae) {
		super();
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setCodigomae(codigomae);
	}

	public Filho(String nome2, int id) {
		this.setCodigo(id);
		this.setNome(nome2);
	}

	//GETS AND SETS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigomae() {
		return codigomae;
	}

	public void setCodigomae(int codigomae) {
		this.codigomae = codigomae;
	}

}
