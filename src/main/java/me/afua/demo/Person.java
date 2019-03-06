package me.afua.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String myName;

    @OneToMany(mappedBy = "pet")
    private Set<OwnersAndPets> pets;

//    @ManyToMany(mappedBy = "owners")
//    private Set<Pet> pets;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Set<OwnersAndPets> getPets() {
        return pets;
    }

    public void setPets(Set<OwnersAndPets> pets) {
        this.pets = pets;
    }
}
