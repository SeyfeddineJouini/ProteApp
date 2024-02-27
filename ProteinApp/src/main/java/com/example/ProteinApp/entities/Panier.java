package com.example.ProteinApp.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Panier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    private User user;

    @OneToMany(mappedBy = "panier", cascade = CascadeType.ALL)
    private Set<PanierItem> items = new HashSet<>();

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    // Constructors, getters, and setters
    public Panier() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<PanierItem> getItems(){
        return items;
    }

    public void setItems(Set<PanierItem> items) {
        this.items = items;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}