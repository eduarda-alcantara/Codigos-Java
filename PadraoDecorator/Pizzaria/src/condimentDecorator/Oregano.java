package condimentDecorator;

import component.Pizza;
import decorator.DecoratedPizza;

public class Oregano extends DecoratedPizza{
	public Oregano(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Orégano";	    
	}

	@Override
	public double getPreco() {
		return pizza.getPreco() + 0.50;
	}
}

