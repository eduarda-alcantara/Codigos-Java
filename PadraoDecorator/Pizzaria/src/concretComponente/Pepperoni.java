package concretComponente;

import component.Pizza;

public class Pepperoni extends Pizza{

	@Override
	public double getPreco() {
		return 14.90;
	}

	@Override
	public String getDescricao() {
		return " Pepperoni " + descricao;

	}
}
