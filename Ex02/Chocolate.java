/**
 * Classe que define os metodos e atributos de um chocolate. Herda de produto nao duravel.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Chocolate extends ProdutoNaoDuravel{
	private String formato;
	private String sabor;
	
	/**
	* Construtor parametrizado
	*/
	public Chocolate(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String dataDeValidade, String genero, String formato, String sabor) {
		super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.formato=formato;
		this.sabor=sabor;
	}
	
	/**
	* Construtor padrao
	*/
	public Chocolate() {
		super();
		formato="";
		sabor="";
	}
	

	/**
	* Metodos getters e setters
	*/
	public String getFormato() {
		return formato;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	private void printChocolate() {
		printProdutoNaoDuravel();
		System.out.println("Sabor: "+sabor);
		System.out.println("Formato: "+formato);
	}
	
	public void print() {
		printChocolate();
	}
	
	
	
}