package model;

public abstract class Utilisateur {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String motDePasse;

    public Utilisateur() {}

    public Utilisateur(int id, String nom, String prenom, String login, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.motDePasse = motDePasse;
    }

    // Constructeur par recopie
    public Utilisateur(Utilisateur autre) {
        if (autre != null) {
            this.id = autre.id;
            this.nom = autre.nom;
            this.prenom = autre.prenom;
            this.login = autre.login;
            this.motDePasse = autre.motDePasse;
        }
    }

    public abstract void afficherInfos();

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }
}
