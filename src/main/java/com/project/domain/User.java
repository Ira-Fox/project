package com.project.domain;

import java.util.Objects;

public class User {
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private UserRole role;
    private String password;
    private Integer attestation_id;

    public User() {}

    public User(String email, String firstName, String lastName, UserRole role, String password, Integer attestation_id) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.password = password;
        this.attestation_id = attestation_id;
    }

    public User(Integer id, String email, String firstName, String lastName, UserRole role, String password, Integer attestation_id) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.password = password;
        this.attestation_id = attestation_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAttestation_id() {
        return attestation_id;
    }

    public void setAttestation_id(Integer attestation_id) {
        this.attestation_id = attestation_id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((attestation_id == null) ? 0 : attestation_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return role == other.role &&
                Objects.equals(email, other.email) &&
                Objects.equals(firstName, other.firstName) &&
                Objects.equals(id, other.id) &&
                Objects.equals(lastName, other.lastName) &&
                Objects.equals(password, other.password) &&
                Objects.equals(attestation_id, other.attestation_id);
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName +
                ", role=" + role + ", password=" + password + ", attestation_id=" + attestation_id + "]";
    }
}
