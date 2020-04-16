import org.junit.Assert;
import org.junit.Test;

import br.unipe.luis.web.service.Operacoes;



public class OperacoesTeste {
	
	@Test
	public void somaTeste() {
		Operacoes op = new Operacoes(1,3);
		double resultado =op.somar();
		Assert.assertEquals(4, resultado,0);
	}
	
	@Test
	public void subtracaoTeste() {
		Operacoes op = new Operacoes(3,3);
		double resultado =op.subtrair();
		Assert.assertEquals(0, resultado,0);
	}

}
