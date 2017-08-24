/**
 * Classe que define os metodos e atributos de um celular. Herda de produto duravel.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Celular extends ProdutoDuravel{
	private float tamanhoDaTela;
	private String sistemaOperacional;

	/**
	* Construtor padrao
	*/
	public Celular() {
		super();
		tamanhoDaTela=0;
		sistemaOperacional="";
	}

	/**
	* Construtor parametrizado
	*/
	public Celular(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, float tamanhoDaTela, String sistemaOperacional) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.tamanhoDaTela=tamanhoDaTela;
		this.sistemaOperacional=sistemaOperacional;
	}
	
	/**
	* Metodos getters e setters
	*/
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
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	private void printCelular() {
		printProdutoDuravel();
		System.out.println("Tamanho da tela: "+tamanhoDaTela);
		System.out.println("Sistema operacional: "+sistemaOperacional);
	}
	public void print() {
		printCelular();
	}
	
	
}