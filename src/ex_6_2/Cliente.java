package ex_6_2;

public class Cliente {
	MetodosDeOrdenacao metodosDeOrdenacao;
	MetodosDeOrdenacao2 metodosDeOrdenacao2;

	public Cliente(MetodosDeOrdenacao metodosDeOrdenacao) {
		this.metodosDeOrdenacao = metodosDeOrdenacao;
	}

	public Cliente(MetodosDeOrdenacao2 metodosDeOrdenacao2) {
		this.metodosDeOrdenacao2 = metodosDeOrdenacao2;
	}

	public void chamaMetodosDeOrdenacao(int[] vetor) {
		metodosDeOrdenacao.metodoPrincipal(vetor);
	}

	public void chamaMetodosDeOrdenacao2(int v[], int p, int r)
	{
		metodosDeOrdenacao2.metodoPrincipal2(v, p, r);
	}
}