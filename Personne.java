public class Personne {
    private String numero;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String telephone;
    private Date dateNaissance;
    private String sexe;
    private String etatCivil;
    private String nip;

    // Constructeur
    public Personne(String numero, String nom, String prenom, Adresse adresse, String telephone, Date dateNaissance, String sexe, String etatCivil, String nip) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.etatCivil = etatCivil;
        this.nip = nip;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }

    public void setAdresse(Adresse adresse){
        this.adresse=adresse;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public void setDateNaissance(Date date){
        this.dateNaissance=date;
    }

    public void setSex(String sexe){
        this.sexe=sexe;
    }

    public void setEtatCivil(String etat){
        this.etatCivil=etat;
    }

    public void setNip(String nip){
        this.nip=nip;
    }

    public String getSexe(){
        return this.sexe;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public Adresse getAdresse(){
        return this.adresse;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getSex(){
        return this.sexe;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public Date getDateNaaissance(){
        return this.dateNaissance;
    }
}
