public class Distributeur {
    private Banque banque;

    public Distributeur(Banque banque) {
        this.banque = banque;
    }

    public void retirerArgent(String numeroCompte, String nip, double montant) {
        CompteClient compte = banque.consulterCompte(numeroCompte);

        if (compte != null) {
            compte.retirer(montant);
        } else {
            System.out.println("Compte introuvable");
        }
    }

    // Autres méthodes pour les opérations du distributeur
}