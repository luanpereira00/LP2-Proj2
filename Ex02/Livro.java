/**
 * Classe que define os metodos e atributos de um livro. Herda de produto duravel.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Livro extends ProdutoDuravel{
	private String autor;
	private String genero;
	/**
	* Construtor padrao
	*/
	public Livro() {
		super();
		autor="";
		genero="";
	}
	
	/**
	* Construtor parametrizado
	*/
	public Livro(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, String autor, String genero) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.autor=autor;
		this.genero=genero;
	}
	
	/**
	* Metodos getters e setters
	*/
	public String getAutor() {
		return autor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

	/**
	* Metodos de impressao dos dados da classe 
	*/
	private void printLivro() {
		printProdutoDuravel();
		System.out.println("Autor: "+autor);
		System.out.println("Genero: "+genero);
	}
	public void print() {
		printLivro();
	}
	
}