package Exercice2;

public class Utilisateur {
    private String name;
    private String surname;
    private String email;

    public Utilisateur(String name , String surname , String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
