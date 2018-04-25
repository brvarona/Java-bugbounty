package edu.unicen.tallerjava.todo.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {
    @Id
    private
    UUID id;
    private String name;

    // Constructor vacio por defecto
    public User() {
    }

    public User(String name) { this(name, UUID.randomUUID());}

    public User(String name, UUID id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


}
