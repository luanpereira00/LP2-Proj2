public class Main {
	public static void main(String[] args) {
		Deposito deposito = new Deposito();
		Carro carro = new Carro();
		deposito.addProduto(new Pizza("Pizza a moda da casa", 20, "Pizza Hut", "Pizza com ingredientes secretos da casa", "23/08/2017",
				"26/08/2017", "Alimenticio", "A moda da casa", "Media"));
		deposito.addProduto(carro);
		deposito.addProduto(new Celular("Samsung Galaxy", 800.0, "Samsung", "Quad-core", "01/02/2016", "Plastico", "2 anos", 4.3f, "Android"));
		System.out.println("\nImprimindo a lista toda ");
		System.out.println(deposito.quantosProdutos());
		deposito.printList();
		System.out.println("\nO mais caro eh ");
		deposito.maiorValor().print();
		//deposito.addProduto(new Chocolate());
		deposito.removeProduto(carro);
		System.out.println("\nImprimindo sem o carro");
		deposito.printList();
	}
}