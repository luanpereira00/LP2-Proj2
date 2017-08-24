/**
 * Classe que define os metodos e atributos de um professor
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Professor{
	/**
	* Construtor padrao
	*/
	public Professor(){
		nome="";
		matricula="";
		idade=0;
	}

	/**
	* Construtor parametrizado
	*/
	public Professor(String nome, String matricula, int idade){
		this.nome=nome;
		this.matricula=matricula;
		this.idade=idade;
	}
	protected String nome;
	protected String matricula;
	protected int idade;
	
	/**
	* Metodos getters e setters
	*/
	public String getNome(){
		return nome;
	}
	public String getMatricula(){
		return matricula;
	}
	public int getIdade(){
		return idade;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setMatricula(String matricula){
		this.matricula=matricula;
	}
	public void setIdade(int idade){
		this.idade=idade;
	}

	/**
	* Metodos de impressao dos dados da classe 
	*/
	protected void printStandard(){
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("Idade: "+idade);
	}
	public void print(){
		printStandard();
	}
}
