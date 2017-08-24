import java.lang.Double;
/**
 * Classe que define os metodos e atributos de um professor horista. Herda de Professor.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	/**
	* Construtor padrao
	*/
	public ProfessorHorista(){
		super();
		total_horas=0;
		salario_hora="0";
	}

	/**
	* Construtor parametrizado
	*/	
	public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
		super(nome, matricula, idade);
		this.total_horas=total_horas;
		this.salario_hora=salario_hora;
	}
	
	/**
	* Metodos getters e setters
	*/
	public int getTotalHoras(){
		return total_horas;
	}
	public String getSalarioHora(){
		return salario_hora;
	}
	public double getSalario(){
		return total_horas*Double.parseDouble(salario_hora);
	}

	/**
	* Metodos de impressao dos dados da classe 
	*/
	public void print(){
		printStandard();
		System.out.println("Salario: "+getSalario());
	}
}
