/**
 * Classe que define os metodos e atributos de um professor regime. Herda de Professor.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class ProfessorRegime extends Professor{
	private double salario;

	/**
	* Construtor padrao
	*/
	public ProfessorRegime(){
		super();
		salario=0;
	}

	/**
	* Construtor parametrizado
	*/	
	public ProfessorRegime(String nome, String matricula, int idade, double salario){
		super(nome, matricula, idade);
		this.salario=salario;
	}

	/**
	* Metodos getters e setters
	*/
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario){
		this.salario=salario;
	}

	/**
	* Metodos de impressao dos dados da classe 
	*/
	public void print(){
		printStandard();
		System.out.println("Salario: "+getSalario());
	}
}
