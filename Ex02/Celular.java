public class Celular extends ProdutoDuravel{
	private float tamanhoDaTela;
	private String sistemaOperacional;
	public Celular() {
		super();
		tamanhoDaTela=0;
		sistemaOperacional="";
	}
	public Celular(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, float tamanhoDaTela, String sistemaOperacional) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.tamanhoDaTela=tamanhoDaTela;
		this.sistemaOperacional=sistemaOperacional;
	}
	
	public float getTamanhoDaTela() {
		return tamanhoDaTela;
	}
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	
	public void setTamanhoDaTela(float tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}
	
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	
	private void printCelular() {
		printProdutoDuravel();
		System.out.println("Tamanho da tela: "+tamanhoDaTela);
		System.out.println("Sistema operacional: "+sistemaOperacional);
	}
	public void print() {
		printCelular();
	}
	
	
}