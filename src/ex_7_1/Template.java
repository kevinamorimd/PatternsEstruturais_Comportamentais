package ex_7_1;

public class Template {
	private final String string;

	public Template(String string) {
		this.string = string;
	}

	public final void run() {
		Maiuscula();
		Minuscula();
		Inverte();
		Duplica();
	}

	public void Maiuscula() {
		System.out.println(string.toUpperCase());
	}

	public void Minuscula() {
		System.out.println(string.toLowerCase());
	}

	public void Inverte() {
		StringBuffer stringBuffer = new StringBuffer(string);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}

	public void Duplica() {
		System.out.println(string + string);
	}
}
