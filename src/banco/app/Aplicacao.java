package banco.app;

import java.math.BigDecimal;

import banco.logica.Cliente;
import banco.logica.conta;
public class Aplicacao {
     public static void main(String[] args) {
    	 conta c = new conta ("1234");
    	 conta c1 = new conta ("1235");
    		Cliente cli = new Cliente("000", "Gustavo");
    	 
    	 c.depositar(new BigDecimal("100.5"));
    	 c.sacar(new BigDecimal("50"));
    	 c.transferir(new BigDecimal("25"), c1);
    	 
    	 cli.getContas().add(c1);
    	 cli.getContas().add(c);
    	
    	 System.out.println(cli);
     }
}
