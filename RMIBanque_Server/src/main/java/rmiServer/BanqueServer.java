package rmiServer;

import rmiService.BanqueImpl;

import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {

    public static void main(String[] args) {
        try {
            // Le registre RMI doit exister : JNDI s'appuie dessus
            LocateRegistry.createRegistry(1099);

            BanqueImpl banque = new BanqueImpl();

            // Binding via JNDI (config lue depuis jndi.properties)
            InitialContext ctx = new InitialContext();
            ctx.rebind("BK", banque);

            System.out.println("Serveur RMI de la banque démarré (JNDI)...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}