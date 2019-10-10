package br.com.wezi.nfe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	private static ACBrNFe acbrNFe;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		try {
            acbrNFe = new ACBrNFe();
            System.out.println("Versão " + acbrNFe.nome() + " = " + acbrNFe.versao());
            acbrNFe.configGravarValor(ACBrSessao.DFe, "Senha", "informar senha");
            acbrNFe.configGravarValor(ACBrSessao.NFe, "VersaoDF", "3");
            System.out.println(acbrNFe.configLerValor(ACBrSessao.DFe, "Senha"));
            
            System.out.println(acbrNFe.statusServico());
            
            System.out.println("Fim do Teste");
        } catch (Exception ex) {
            System.out.println(ex);
        }
	}

}
