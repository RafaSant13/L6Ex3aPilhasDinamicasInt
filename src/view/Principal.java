package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		for (int i = 0; i<5; i++) {
			int valor = (int)(Math.random()*100);
			p.push(valor);
		}
		try {
			int topo = p.top();
			System.out.println("TOPO = " + topo);
			
			int tamanho = p.size();
			System.out.println("Tamanho = " + tamanho);
			
			while(!p.isEmpty()) {
				int valor = p.pop();
				System.out.println(valor);
			}
			p.pop();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
