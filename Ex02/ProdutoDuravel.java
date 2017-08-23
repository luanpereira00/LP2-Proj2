public class ProdutoDuravel extends Produto{
	protected String materialPredominante;
	protected String durabilidade;
	
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, String dataDeFabricacao, String materialPredominante, String durabilidade){
		super(nome, preco, marca, descricao, dataDeFabricacao);
		this.materialPredominante=materialPredominante;
		this.durabilidade=durabilidade;
	}
	public ProdutoDuravel(){
		super();
		materialPredominante="";
		durabilidade="";
	}
	
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
	
	protected void printProdutoDuravel(){
		printProduto();
		System.out.println("Material Predominante: "+materialPredominante);
		System.out.println("Durabilidade: "+durabilidade);
	}
	
	public void print(){
		printProdutoDuravel();
	}
}
