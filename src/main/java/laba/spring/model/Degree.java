package laba.spring.model;

import lombok.Getter;

public enum Degree {
    MASTER(0),
    CANDIDATE_OF_SCIENCES(1),
    DOCTOR_OF_SCIENCES(2);
    @Getter
    private Integer severity;

    Degree(int severity) {
        this.severity = severity;
    }

    public boolean isWorseThan(Degree other) {
        return this.severity > other.severity;
    }
}
