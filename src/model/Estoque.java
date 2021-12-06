package model;

import java.util.ArrayList;

public class Estoque {
	private static ArrayList<Animal> animais;
	
	static {
		animais = new ArrayList<>();
		Cachorro cachorro = new Cachorro("Charlie", 1, "Poodle");
		animais.add((Cachorro)cachorro);
		Gato gato = new Gato("Giba", 2, "Siamês");
		animais.add((Gato)gato);
		Coelho coelho = new Coelho("Pernalonga", 3, "Angorá");
		animais.add((Coelho)coelho);
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}
}
