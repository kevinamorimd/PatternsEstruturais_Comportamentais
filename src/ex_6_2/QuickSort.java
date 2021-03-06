package ex_6_2;

public class QuickSort implements MetodosDeOrdenacao2 {

	private int separa(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c) {
				++i;
			}
			while (c < v[j]) {
				--j;
			}

			if (i >= j) {
				break;
			}

			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}

	@Override
	public void metodoPrincipal2(int v[], int p, int r) {
		int j;
		if (p < r) {
			j = separa(v, p, r);
			metodoPrincipal2(v, p, j - 1);
			metodoPrincipal2(v, j + 1, r);
		}
	}
}