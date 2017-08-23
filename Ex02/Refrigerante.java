public class Refrigerante extends ProdutoNaoDuravel{
	private int mililitros;
	private String tipoDeRecipiente;
	
	public Refrigerante() {
		super();
		mililitros=0;
		tipoDeRecipiente="";
	}
	
	public Refrigerante(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String dataDeValidade, String genero, int mililitros, String tipoDeRecipiente) {
		super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.mililitros=mililitros;
		this.tipoDeRecipiente=tipoDeRecipiente;
	}
	
	public int getMililitros() {
		return mililitros;
	}
	
	public String getTipoDeRecipiente() {
		return tipoDeRecipiente;
	}
	
	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
	
	public void setTipoDeRecipiente(String tipoDeRecipiente) {
		this.tipoDeRecipiente = tipoDeRecipiente;
	}
	
	private void printRefrigerante(){
		printProdutoNaoDuravel();
		System.out.println("Mililitros: "+mililitros);
		System.out.println("Tipo do recipiente: "+tipoDeRecipiente);
	}
	
	public void print() {
		printRefrigerante();
	}
	
}