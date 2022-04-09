package component;

public abstract class Pizza {

	public String descricao = "Pizza";

	public String getDescricao() {
		return descricao;
	}
	
	public abstract double getPreco(); 
}

