public class Carro extends ProdutoDuravel{
	private String modelo;
	private float potenciaDoMotor;
	
	public Carro() {
		super();
		modelo="";
		potenciaDoMotor=0;
	}
	
	public Carro(String nome, double preco, String marca, String descricao, String dataDeFabricacao,
			String materialPredominante, String durabilidade, String modelo, float potenciaDoMotor) {
		super(nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade);
		this.modelo=modelo;
		this.potenciaDoMotor=potenciaDoMotor;
	}

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
	
	private void printCarro() {
		printProdutoDuravel();
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia do motor: "+potenciaDoMotor);
	}
	
	public void print(){
		printCarro();
	}
	
	
}