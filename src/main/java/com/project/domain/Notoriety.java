package com.project.domain;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Notoriety {
    private Integer id;
    private Integer user_id;
    private Integer faculty_id;
    private Date date;
    private Time time;

    public Notoriety(Integer id, Integer user_id, Integer faculty_id, Date date, Time time) {
        this.id = id;
        this.user_id = user_id;
        this.faculty_id = faculty_id;
        this.date = date;
        this.time = time;
    }

    public Notoriety(Integer user_id, Integer faculty_id, Date date, Time time) {
        this.user_id = user_id;
        this.faculty_id = faculty_id;
        this.date = date;
        this.time = time;
    }

    public Notoriety() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((faculty_id == null) ? 0 : faculty_id.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Notoriety other = (Notoriety) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(user_id, other.user_id) &&
                Objects.equals(faculty_id, other.faculty_id) &&
                Objects.equals(date, other.date) &&
                Objects.equals(time, other.time);
    }

    @Override
    public String toString() {
        return "Notoriety [id=" + id + ", user_id=" + user_id + ", faculty_id=" + faculty_id + ", date=" + date+ ", time=" + time + "]";
    }
}
