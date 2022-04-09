package condimentDecorator;

import component.Pizza;
import decorator.DecoratedPizza;

public class CreamCheeseEdge extends DecoratedPizza{
	public CreamCheeseEdge(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", CreamCheeseEdge";		    
	}

	@Override
	public double getPreco() {
		return pizza.getPreco() + 1.20;
	}
}

