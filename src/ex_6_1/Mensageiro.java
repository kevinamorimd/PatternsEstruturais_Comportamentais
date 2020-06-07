package ex_6_1;

import java.util.Calendar;
import java.util.Date;

public class Mensageiro {
	public void enviarMensagem() {
		int diaDaSemana = -1;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		diaDaSemana = c.get(Calendar.DAY_OF_WEEK);
		MensagemDoDia mdd;

		switch (diaDaSemana) {
		case 1:
			mdd = new MensagemDoDomingo();
			break;
		case 2:
			mdd = new MensagemDaSegunda();
			break;
		case 3:
			mdd = new MensagemDaTerca();
			break;
		case 4:
			mdd = new MensagemDaQuarta();
			break;
		case 5:
			mdd = new MensagemDaQuinta();
			break;
		case 6:
			mdd = new MensagemDaSexta();
			break;
		case 7:
			mdd = new MensagemDoSabado();
			break;
		default:
			mdd = new DiaSemMensagem();
			break;
		}

		System.out.println(mdd.mensagem());
	}
}
