
public class Vendedor extends Funcionario {
	private float comissao;
	private float qtdvendas;	

	public Vendedor(String nome, String cPF, float salario) {
		super(nome, cPF, salario);
	}
	
	public float getSalario() {
		return this.Salario+(this.comissao*this.qtdvendas);
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getQtdvendas() {
		return qtdvendas;
	}

	public void setQtdvendas(float qtdvendas) {
		this.qtdvendas = qtdvendas;
	}
}
