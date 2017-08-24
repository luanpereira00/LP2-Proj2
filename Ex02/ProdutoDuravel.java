/**
 * Classe que define os metodos e atributos de um produto duravel. Herda de produto.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class ProdutoDuravel extends Produto{
	protected String materialPredominante;
	protected String durabilidade;
	
	/**
	* Construtor parametrizado
	*/
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, String dataDeFabricacao, String materialPredominante, String durabilidade){
		super(nome, preco, marca, descricao, dataDeFabricacao);
		this.materialPredominante=materialPredominante;
		this.durabilidade=durabilidade;
	}

	/**
	* Construtor padrao
	*/
	public ProdutoDuravel(){
		super();
		materialPredominante="";
		durabilidade="";
	}
	
	/**
	* Metodos getters e setters
	*/
	public void setMaterialPredominante(String materialPredominante){
		this.materialPredominante=materialPredominante;
	}
	public void setDurabilidade(String durabilidade){
		this.durabilidade=durabilidade;
	}
	
	public String getMaterialPredominante(){
		return materialPredominante;
	}
	public String getDurabilidade(){
		return durabilidade;
	}
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	protected void printProdutoDuravel(){
		printProduto();
		System.out.println("Material Predominante: "+materialPredominante);
		System.out.println("Durabilidade: "+durabilidade);
	}
	
	public void print(){
		printProdutoDuravel();
	}
}
