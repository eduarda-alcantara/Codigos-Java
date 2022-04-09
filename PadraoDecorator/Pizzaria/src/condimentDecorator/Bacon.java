package condimentDecorator;

import component.Pizza;
import decorator.DecoratedPizza;

public class Bacon extends DecoratedPizza{
	public Bacon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Bacon";	    
	}

	@Override
	public double getPreco() {
		return pizza.getPreco() + 0.80;
	}
}


