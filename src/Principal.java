import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// instanear os 3 governantes
		
		Governante montante = new Governante("montante", 5000, 4000, 20000, 0, 20000, 40000);
		Governante lenha = new Governante ("lenha", 500, 25000, 10000, 0, 0, 100000);
		Governante clareza = new Governante ("clareza", 200, 7000, 120000, 5000, 10000, 0);
		
		//lista de governantews
		ArrayList<Governante> governantes =new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);
		
		//instanciar a classe solucao
		Solucao s = new Solucao();
		
		//imprimir resultado questao a
		
		System.out.println(s.getQtdeTotal ("ouro", governantes));
		System.out.println(s.getQtdeTotal ("madeira", governantes));
		System.out.println(s.getQtdeTotal ("agua", governantes));
		
		//imprimir resultado questao b
		System.out.println(s.getQtdeFicarVivo("montante", governantes));
		System.out.println(s.getQtdeFicarVivo("lenha", governantes));
		System.out.println(s.getQtdeFicarVivo("clareza", governantes));
		
		

	}

}
