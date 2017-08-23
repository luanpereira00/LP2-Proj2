public class Livro extends ProdutoDuravel{
	private String autor;
	private String genero;
	public Livro() {
		super();
		autor="";
		genero="";
	}
	
	public Livro(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, String autor, String genero) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.autor=autor;
		this.genero=genero;
	}
	
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
	
	private void printLivro() {
		printProdutoDuravel();
		System.out.println("Autor: "+autor);
		System.out.println("Genero: "+genero);
	}
	public void print() {
		printLivro();
	}
	
}