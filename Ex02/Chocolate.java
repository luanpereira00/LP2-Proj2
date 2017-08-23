public class Chocolate extends ProdutoNaoDuravel{
	private String formato;
	private String sabor;
	
	public Chocolate(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String dataDeValidade, String genero, String formato, String sabor) {
		super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.formato=formato;
		this.sabor=sabor;
	}
	
	public Chocolate() {
		super();
		formato="";
		sabor="";
	}
	
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
	
	private void printChocolate() {
		printProdutoNaoDuravel();
		System.out.println("Sabor: "+sabor);
		System.out.println("Formato: "+formato);
	}
	
	public void print() {
		printChocolate();
	}
	
	
	
}