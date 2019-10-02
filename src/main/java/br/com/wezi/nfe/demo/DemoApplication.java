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
        } catch (Exception ex) {
            System.out.println(ex);
        }
	}

}
