package com.project.domain;

import java.util.Objects;

public class Attestation {
    public Integer id;
    public String subject;
    public Integer mark;

    public Attestation(Integer id, String subject, Integer mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
    }

    public Attestation(String subject, Integer mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public Attestation() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((mark == null) ? 0 : mark.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Attestation other = (Attestation) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(subject, other.subject) &&
                Objects.equals(mark, other.mark);
    }

    @Override
    public String toString(){
        return "Attestation [id=" + id + ", subject=" + subject + ", mark=" + mark + "]";
    }
}
