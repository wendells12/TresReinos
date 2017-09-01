import java.util.ArrayList;

public class Solucao {
	
	//metodo para questao a
	public int getQtdeTotal(String recurso, ArrayList<Governante> governantes){
		
		int resultado = 0;
		
		//testar o tipo de recurso
		switch (recurso) {
		case "ouro":
			for (int i = 0; i < governantes.size(); i++) {
				 resultado = resultado + governantes.get(i).getOuro();
				 
			}
			return resultado;
			
		case "maderia":
			for (int j = 0; j < governantes.size(); j++) {
				resultado = resultado + governantes.get(j).getMadeira();
				
			}
			return resultado;
			
		case "agua":
			for (int mamae = 0; mamae < governantes.size(); mamae++){
				resultado = resultado + governantes.get(mamae).getAgua(); 
			}
			return resultado;
			
			default:
				return resultado;
		}
		
	}
	
	
	//metodo para resposta de questao b
	public String getQtdeFicarVivo(String nomeGovernante, ArrayList<Governante> governantes) {
		
		String resultado = "";
		
		
		//buscar o governante na lista com base no nome
		for (int i = 0; i < governantes.size(); i++){
			if (governantes.get(i).getNome().equals(nomeGovernante)){
				resultado = "Pedido do governante: " + nomeGovernante + "\n" + 
			"Ouro: " + governantes.get(i).getPedidoOuro() + "\n" +
			"Madeira: " + governantes.get(i).getPedidoMadeira() + "\n" +
			"Agua: " + governantes.get(i).getPedidoAgua();
				
						
					
			}
		}
	return resultado;

	}
	
	//metodo para questao c
	public int calcularQtdeViagens(String nomeGovernante, ArrayList<Governante> governantes){
		
		int resultado = 0;
		
		//buscar o governante na lista com base no nome
		for (int i = 0; i <governantes.size(); i++){
			if (governantes.get(i).getNome().equals(nomeGovernante)) {
				resultado = (governantes.get(i).getPedidoOuro() / 50) + 
						(governantes.get(i).getPedidoMadeira() / 100) +
						(governantes.get(i).getPedidoAgua() / 1000);
						
						
			}
		}
		
		return resultado;
		
	}
	
	

}
