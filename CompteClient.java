import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompteClient {
    private String numeroCompte;
    private double solde;
    private List<String> operations;

    // Constructeur
    public CompteClient(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.operations = new ArrayList<>();
    }

    // Méthodes pour déposer, retirer, afficher solde, etc.
    public void deposer(double montant) {
        this.solde += montant;
        operations.add("Déposé: " + montant);
        if (operations.size() > 3) {
            operations.remove(0);
        }
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            this.solde -= montant;
            operations.add("Retiré: " + montant);
            if (operations.size() > 3) {
                operations.remove(0);
            }
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    public double getSolde() {
        return this.solde;
    }

    public List<String> getDernieresOperations() {
        return this.operations;
    }

    public String getNumeroCompte() {
        return this.numeroCompte;
    }
}

