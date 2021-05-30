package app;

import java.util.Date;

import lazy_loading.Prontuario;

public class App {

	public static void main(String[] args) {
		Prontuario prontuario = new Prontuario(1, "Sicrano", "Febre", new Date());

		System.out.println(prontuario);

		System.out.println(prontuario.getPessoa());

		System.out.println(prontuario);
	}

}
