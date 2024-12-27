package com.project.domain;

import java.util.Objects;

public class Faculty {
    public Integer id;
    public String name;
    public Integer recruitmentPlan;

    public Faculty(Integer id, String name, Integer recruitmentPlan) {
        this.id = id;
        this.name = name;
        this.recruitmentPlan = recruitmentPlan;
    }

    public Faculty(String name, Integer recruitmentPlan) {
        this.name = name;
        this.recruitmentPlan = recruitmentPlan;
    }

    public Faculty() {}

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

    public Integer getRecruitmentPlan() {
        return recruitmentPlan;
    }

    public void setRecruitmentPlan(Integer recruitmentPlan) {
        this.recruitmentPlan = recruitmentPlan;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((recruitmentPlan == null) ? 0 : recruitmentPlan.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Faculty other = (Faculty) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(recruitmentPlan, other.recruitmentPlan);
    }

    @Override
    public String toString() {
        return "Faculty [id=" + id + ", name=" + name + ", recruitmentPlan=" + recruitmentPlan + "]";
    }
}
