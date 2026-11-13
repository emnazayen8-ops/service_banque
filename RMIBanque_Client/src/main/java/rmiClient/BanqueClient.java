package rmiClient;

import metier.Compte;
import rmiService.IBanque;

import javax.naming.InitialContext;
import java.util.Date;

public class BanqueClient {

    public static void main(String[] args) {
        try {
            // Recherche via JNDI (config lue depuis jndi.properties)
            InitialContext ctx = new InitialContext();
            IBanque banque = (IBanque) ctx.lookup("BK");

            // Création d'un compte
            System.out.println(banque.creerCompte(new Compte(1, 5000, new Date())));

            // Création avec un code déjà utilisé (doit échouer)
            System.out.println(banque.creerCompte(new Compte(1, 100, new Date())));

            // Consultation d'un compte existant
            System.out.println(banque.getInfoCompte(1));

            // Consultation d'un compte inexistant
            System.out.println(banque.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}