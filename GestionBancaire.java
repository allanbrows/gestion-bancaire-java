public class GestionBancaire {
    public static void main(String[] args) {
        Banque banque = new Banque();
        Distributeur distributeur = new Distributeur(banque);

        // Exemple d'utilisation
        Adresse adresse = new Adresse("123", "Rue de la Paix", "Paris", "75001");
        Date dateNaissance = new Date(1, 1, 1990);
        Personne client = new Personne("1", "Doe", "John", adresse, "0123456789", dateNaissance, "M", "Célibataire","1234");
        CompteClient compte = new CompteClient("C1", 1000.0);

        banque.enregistrerClient(client, compte);

        distributeur.retirerArgent("C1", "1234", 200.0);
        System.out.println("Solde après retrait: " + compte.getSolde());
        System.out.println("Dernières opérations: " + compte.getDernieresOperations());
    }
}
