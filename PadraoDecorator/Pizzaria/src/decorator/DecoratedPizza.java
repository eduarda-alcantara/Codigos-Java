package decorator;

import component.Pizza;

public abstract class DecoratedPizza extends Pizza{
	protected Pizza pizza;
	public abstract String getDescricao();  
	public abstract double getPreco();
}
	

