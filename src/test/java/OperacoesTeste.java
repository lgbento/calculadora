import org.junit.Assert;
import org.junit.Test;



public class OperacoesTeste {
	
	@Test
	public void somaTeste() {
		Operacoes op = new Operacoes();
		double resultado =op.somar(1,3);
		Assert.assertEquals(6, resultado,0);
	}
	
	@Test
	public void subtracaoTeste() {
		Operacoes op = new Operacoes();
		double resultado =op.subtrair(3,3);
		Assert.assertEquals(0, resultado,0);
	}

}
