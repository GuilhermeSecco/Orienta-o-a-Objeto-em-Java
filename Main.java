import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Pedro", "000000", 500.0f);
		v1.setComissao(15);
		v1.setQtdvendas(17);
		
		Entregador e1 = new Entregador("Vitor", "111111", 500.0f);

		ArrayList<Funcionario> func = new ArrayList();
		func.add(v1);
		func.add(e1);
		
		for(int i=0;i<func.size();i++) {
			System.out.println(func.get(i).getDados());
		}
	}
}
