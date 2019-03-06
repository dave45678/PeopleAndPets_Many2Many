package me.afua.demo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Owners {
    
    @NotNull
    private long ownerId;

    @NotNull
    private long petId;

    public Owners() {
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }
}
