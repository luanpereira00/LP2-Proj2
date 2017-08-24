import java.util.ArrayList;
/**
 * Classe que define os metodos e atributos de um deposito. Contem um arrayList de produtos genericos
 * 
 * @author Luan Pereira
 * @version 24/08/2017
 */
public class Deposito {
	private ArrayList<Produto> produtos;
	
	/**
	* Construtor padrao
	*/
	public Deposito(){
		produtos = new ArrayList<Produto>();
	}
	
	/**
	* Metodo que adiciona um produto
	*/
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	/**
	* Metodo que remove um produto
	*/
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	/**
	* Metodo que conta a quantidade de produtos no deposito
	*/
	public int quantosProdutos() {
		return produtos.size();
	}
	/**
	* Metodo que informa se o deposito esta vazio
	*/
	public boolean estaVazio() {
		return produtos.isEmpty();
	}
	/**
	* Metodo que retorna o produto de maior valor
	*/
	public Produto maiorValor() {
		int indice=-1;
		if(!estaVazio()) {
			indice=0;
			for(int i=0; i<produtos.size(); i++) {
				if(produtos.get(indice).getPreco() < produtos.get(i).getPreco()) {
					indice = i;
				}
			}
		}
		return produtos.get(indice);
	}
	/**
	* Metodo que imprime a lista de produtos
	*/
	public void printList() {
		for(int i=0; i<produtos.size(); i++) {
			produtos.get(i).print();
			System.out.println();
		}
	}
	
}