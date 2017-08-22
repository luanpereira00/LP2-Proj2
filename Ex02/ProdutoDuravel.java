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
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Marca: "+marca);
		System.out.println("Descricacao: "+descricao);
		System.out.println("Data de fabricacao: "+dataDeFabricacao);
		System.out.println("Material Predominante: "+materialPredominante);
		System.out.println("Durabilidade: "+durabilidade);
	}
}
