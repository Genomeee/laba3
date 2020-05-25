package laba.spring.model;

import lombok.Getter;

public enum ScienceRank {
    PROFESOR(0),
    DOCENT(1),
    SENIOR_RESEARCHER(2),
    SENIOR_LECTURER(3),
    ASSISTANT_PROFESSOR(4),
    LECTURER(5);

    @Getter
    private Integer severity;

    ScienceRank(int severity) {
        this.severity = severity;
    }

    public boolean isWorseThan(ScienceRank other) {
        return this.severity > other.severity;
    }
}
