/**
 * Classe que define os metodos e atributos de um produto nao duravel. Herda de produto.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class ProdutoNaoDuravel extends Produto{
	protected String dataDeValidade;
	protected String genero;
	
	/**
	* Construtor parametrizado
	*/
	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, String dataDeFabricacao, String dataDeValidade, String genero){
		super(nome, preco, marca, descricao, dataDeFabricacao);
		this.dataDeValidade=dataDeValidade;
		this.genero=genero;
	}
	/**
	* Construtor padrao
	*/
	public ProdutoNaoDuravel(){
		super();
		dataDeValidade="1/1/1900";
		genero="";
	}
	
	/**
	* Metodos getters e setters
	*/
	public void setDataDeValidade(String dataDeValidade){
		this.dataDeValidade=dataDeValidade;
	}
	
	public void setGenero(String genero){
		this.genero=genero;
	}
	
	public String getDataDeValidade(){
		return dataDeValidade;
	}
	
	public String setGenero(){
		return genero;
	}
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	protected void printProdutoNaoDuravel(){
		printProduto();
		System.out.println("Data de validade: "+dataDeValidade);
		System.out.println("Genero: "+genero);
	}
	
	public void print(){
		printProdutoNaoDuravel();
	}
}
