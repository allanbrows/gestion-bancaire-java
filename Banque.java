import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banque {
    private List<Personne> clients;
    private Map<String, CompteClient> comptes;

    public Banque() {
        clients = new ArrayList<>();
        comptes = new HashMap<>();
    }

    public void enregistrerClient(Personne client, CompteClient compte) {
        clients.add(client);
        comptes.put(compte.getNumeroCompte(), compte);
    }

    public void radierClient(Personne client) {
        clients.remove(client);
        comptes.remove(client.getNumero());
    }

    public void ouvrirCompte(CompteClient compte) {
        comptes.put(compte.getNumeroCompte(), compte);
    }

    public void fermerCompte(String numeroCompte) {
        comptes.remove(numeroCompte);
    }

    public CompteClient consulterCompte(String numeroCompte) {
        return comptes.get(numeroCompte);
    }

    // Autres méthodes pour gérer la banque
}
