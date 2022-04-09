package Pizzaiolo;

import component.Pizza;
import concretComponente.Mozzarella;
import concretComponente.Pepperoni;
import condimentDecorator.Bacon;
import condimentDecorator.CreamCheeseEdge;
import condimentDecorator.Oregano;
import condimentDecorator.Tomato;

public class Pizzaiolo {

	public static void main(String[] args) {
		Mozzarella mozzarella = new Mozzarella();
		Pepperoni pepperoni = new Pepperoni();

		System.out.println(mozzarella.getDescricao() + " --- " + mozzarella.getPreco());
		Pizza pizzaMozzarella = new Mozzarella();
		pizzaMozzarella = new Tomato(pizzaMozzarella);
		System.out.println( pizzaMozzarella.getDescricao() + " --- " + pizzaMozzarella.getPreco());
		pizzaMozzarella = new CreamCheeseEdge(pizzaMozzarella);		
		System.out.println( pizzaMozzarella.getDescricao() + " --- " + pizzaMozzarella.getPreco());

		System.out.println();

		System.out.println(pepperoni.getDescricao() + " --- " + pepperoni.getPreco());
		Pizza pizzaPepperoni = new Pepperoni();
		pizzaPepperoni = new Oregano(pizzaPepperoni);
		pizzaPepperoni = new Bacon(pizzaPepperoni);
		System.out.println( pizzaPepperoni.getDescricao() + " --- " + pizzaPepperoni.getPreco());			
		pizzaPepperoni = new Tomato(pizzaPepperoni);
		System.out.println( pizzaPepperoni.getDescricao() + " --- " + pizzaPepperoni.getPreco());

	}
}
