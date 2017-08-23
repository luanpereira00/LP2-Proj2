public class Produto{
	protected String nome;
	protected double preco;
	protected String marca;
	protected String descricao;
	protected String dataDeFabricacao;
	
	public Produto(){
		nome="";
		preco=0;
		marca="";
		descricao="";
		dataDeFabricacao="1/1/1900";
	}
	
	public Produto(String nome, double preco, String marca, String descricao, String dataDeFabricacao){
		this.nome=nome;
		this.preco=preco;
		this.marca=marca;
		this.descricao=descricao;
		this.dataDeFabricacao=dataDeFabricacao;
	}
	
	
	public String getNome(){
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public String getMarca(){
		return marca;
	}
	public String getDescricao(){
		return descricao;
	}
	public String getDataDeFabricacao(){
		return dataDeFabricacao;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setPreco(double preco){
		this.preco=preco;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setDescricao(String descricao){
		this.descricao=descricao;
	}
	public void setDataDeFabricacao(String dataDeFabricacao){
		this.dataDeFabricacao=dataDeFabricacao;
	}
	
	protected void printProduto(){
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Marca: "+marca);
		System.out.println("Descricacao: "+descricao);
		System.out.println("Data de fabricacao: "+dataDeFabricacao);
	}
	
	public void print(){
		printProduto();
	}
}
