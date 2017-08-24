/**
 * Classe que define os metodos e atributos de um pizza. Herda de produto nao duravel.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Pizza extends ProdutoNaoDuravel{
	private String sabor;
	private String tamanho;
	
	/**
	* Construtor padrao
	*/
	public Pizza() {
		super();
		sabor="";
		tamanho="";
	}
	
	/**
	* Construtor parametrizado
	*/
	public Pizza(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String dataDeValidade, String genero, String sabor, String tamanho) {
		super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.sabor=sabor;
		this.tamanho=tamanho;
	}

	/**
	* Metodos getters e setters
	*/
	public String getSabor() {
		return sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	private void printPizza(){
		printProdutoNaoDuravel();
		System.out.println("Sabor: "+sabor);
		System.out.println("Tamanho: "+tamanho);
	}
	
	public void print() {
		printPizza();
	}
	
}