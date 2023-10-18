package com.ms.user.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_USERS")
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;
    /**UUID são identificadores universais, utilizado para
     * evitar conflito em sistemas descentralizados,
     * ja que o microservico de email e users sao diferentes
     * com diferentes DBs.
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String name;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
