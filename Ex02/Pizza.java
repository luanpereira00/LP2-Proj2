
public class Pizza extends ProdutoNaoDuravel{
	private String sabor;
	private String tamanho;
	
	public Pizza() {
		super();
		sabor="";
		tamanho="";
	}
	
	public Pizza(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String dataDeValidade, String genero, String sabor, String tamanho) {
		super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.sabor=sabor;
		this.tamanho=tamanho;
	}

	
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
	
	private void printPizza(){
		printProdutoNaoDuravel();
		System.out.println("Sabor: "+sabor);
		System.out.println("Tamanho: "+tamanho);
	}
	
	public void print() {
		printPizza();
	}
	
}