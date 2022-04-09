package concretComponente;

import component.Pizza;

public class Mozzarella extends Pizza {	
	@Override
	public double getPreco() {
		return 11.90;
	}

	@Override
	public String getDescricao() {
		return " Mozzarela " + descricao;

	}
}

