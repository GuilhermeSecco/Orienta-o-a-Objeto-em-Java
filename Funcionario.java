
public class Funcionario {
	private String Nome;
	private String CPF;
	protected float Salario;
	
	public Funcionario(String nome, String cPF, float salario) {
		super();
		Nome = nome;
		CPF = cPF;
		Salario = salario;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getDados(){
		return "Nome: "+this.Nome+
				"\nCPF: "+this.CPF+
				"\nSalário: "+String.format("%.2f", this.getSalario())+
				"\n";
	}
}
