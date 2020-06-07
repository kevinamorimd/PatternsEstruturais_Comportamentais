package ex_6_2;

public class MainStrategy {

	public static void main(String[] args) {
		int[] vetor = { 7, 2, 1, 0, 9, 8, 4, 3, 5, 6 };
		int p = 0;
		int r = 9;

		MetodosDeOrdenacao metodosDeOrdenacao = null;
		MetodosDeOrdenacao2 metodosDeOrdenacao2 = null;
		Cliente cliente = null;

		// Bubble Sort
		metodosDeOrdenacao = new BubleSort();
		cliente = new Cliente(metodosDeOrdenacao);
		cliente.chamaMetodosDeOrdenacao(vetor);

		System.out.println("Bubble Sort");
		for (int index : vetor) {
			System.out.print(index + " ");
		}
		System.out.println("\n");

		// Selection Sort
		metodosDeOrdenacao = new SelectionSort();
		cliente = new Cliente(metodosDeOrdenacao);
		cliente.chamaMetodosDeOrdenacao(vetor);

		System.out.println("Selection Sort");
		for (int index : vetor) {
			System.out.print(index + " ");
		}
		System.out.println("\n");

		// Insertion Sort
		metodosDeOrdenacao = new InsertionSort();
		cliente = new Cliente(metodosDeOrdenacao);
		cliente.chamaMetodosDeOrdenacao(vetor);

		System.out.println("Insertion Sort");
		for (int index : vetor) {
			System.out.print(index + " ");
		}
		System.out.println("\n");

		// Quick Sort
		metodosDeOrdenacao2 = new QuickSort();
		cliente = new Cliente(metodosDeOrdenacao2);
		cliente.chamaMetodosDeOrdenacao2(vetor, p, r);

		System.out.println("Quick Sort");
		for (int index : vetor) {
			System.out.print(index + " ");
		}
		System.out.println("\n");
	}

}