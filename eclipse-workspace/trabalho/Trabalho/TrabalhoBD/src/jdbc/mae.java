package jdbc;

public class mae {
	
	private int    codigo;
	private String nome;
	
	public mae(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome   = nome; 
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

}
