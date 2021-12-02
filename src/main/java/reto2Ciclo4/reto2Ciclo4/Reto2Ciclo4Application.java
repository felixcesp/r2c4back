/*
1. Modelo
3. Interface
4.Repositorio
5.Servicio
6.Controlador

*/
package reto2Ciclo4.reto2Ciclo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import reto2Ciclo4.reto2Ciclo4.interfaces.InterfaceSupplements;
import reto2Ciclo4.reto2Ciclo4.interfaces.InterfaceUser;

@SpringBootApplication
@Component

public class Reto2Ciclo4Application implements CommandLineRunner  {
 @Autowired
    private InterfaceSupplements interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Ciclo4Application.class, args);
	}
            @Override
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
}
}
