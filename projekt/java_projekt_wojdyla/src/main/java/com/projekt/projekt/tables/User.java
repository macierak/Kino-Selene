package com.projekt.projekt.tables;


import javax.persistence.*;





@Entity
@Table(name= "Użytkownik")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ID;

    
    String login;
    String hasło;
    String email;
    String typ_konta;
    public User(){}
    public User(int id, String login, String haslo, String email, String accType){
        this.ID = id;
        this.email = email;
        this.login = login;
        this.hasło = haslo;
        this.typ_konta = accType;
    }

    public String getEmail() {
        return email;
    }
    public String getHasło() {
        return hasło;
    }
    public int getID() {
        return ID;
    }
    public String getLogin() {
        return login;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHasło(String hasło) {
        this.hasło = hasło;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getTyp_konta() {
        return typ_konta;
    }
    public void setTyp_konta(String typ_konta) {
        this.typ_konta = typ_konta;
    }
}
