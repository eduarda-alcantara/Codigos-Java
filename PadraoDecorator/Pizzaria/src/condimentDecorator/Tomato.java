package condimentDecorator;

import component.Pizza;
import decorator.DecoratedPizza;

public class Tomato extends DecoratedPizza{
	public Tomato(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Tomato";	    
	}

	@Override
	public double getPreco() {
		return pizza.getPreco() + 0.10;
	}
}
