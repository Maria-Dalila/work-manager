package br.com.dalila.workmanager.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String login;
    private String password;

    public Worker() {
    }

    public Worker(Integer id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
