package com.admin.escola.admin_escola.domain.professor;

import java.util.Objects;
import java.util.UUID;

public class ProfessorID {
    private final String value;

    private ProfessorID(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static ProfessorID unique() {
        return ProfessorID.from(UUID.randomUUID());
    }

    public static ProfessorID from(final String anId) {
        return new ProfessorID(anId);
    }

    public static ProfessorID from(final UUID anId) {
        return new ProfessorID(anId.toString().toLowerCase());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorID that = (ProfessorID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
