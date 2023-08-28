package com.luistrindade.projetociet.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @Email(message = "Please provide a valid email")
    @NotEmpty(message = "Can not be blank")
    private  String email;

    @Column
    @NotEmpty(message = "Can not be blank")
    private String name;

    @Column
    @NotEmpty(message = "Can not be blank")
    @Length(min = 5, message = "You need to provide a password that contains at least 5 characters" )
    private  String password;

    @Column
    private  Boolean active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name ="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id") )
    private Set<Role> roles;


    public User(){

    }
    public  User(String email, String name, String password , Boolean active){
            this.email = email;
            this.name = name;
            this.password = password;
            this.active =active;
    }

    public  User(Long id , String email, String name, String password , Boolean active){
        this.id= id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.active =active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
