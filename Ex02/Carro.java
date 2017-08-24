/**
 * Classe que define os metodos e atributos de um carro. Herda de produto duravel.
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Carro extends ProdutoDuravel{
	private String modelo;
	private float potenciaDoMotor;
	
	/**
	* Construtor padrao
	*/
	public Carro() {
		super();
		modelo="";
		potenciaDoMotor=0;
	}
	
	/**
	* Construtor parametrizado
	*/
	public Carro(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, String modelo, float potenciaDoMotor) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.modelo=modelo;
		this.potenciaDoMotor=potenciaDoMotor;
	}

	/**
	* Metodos getters e setters
	*/
	public String getModelo() {
		return modelo;
	}

	public float getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPotenciaDoMotor(float potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}
	
	/**
	* Metodos de impressao dos dados da classe 
	*/
	private void printCarro() {
		printProdutoDuravel();
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia do motor: "+potenciaDoMotor);
	}
	
	public void print(){
		printCarro();
	}
	
	
}