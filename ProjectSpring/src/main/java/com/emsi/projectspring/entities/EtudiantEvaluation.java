package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EtudiantEvaluation {
    @EmbeddedId
    private EtudiantEvaluationId id;

    @ManyToOne
    @MapsId("etudiantId")
    @JoinColumn(name = "etudiant_id", insertable = false, updatable = false)
    private Etudiant etudiant;

    @ManyToOne
    @MapsId("evaluationId")
    @JoinColumn(name = "evaluation_id", insertable = false, updatable = false)
    private Evaluation evaluation;

    private Double note;

    @Embeddable
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EtudiantEvaluationId implements Serializable {
        private Long etudiantId;
        private Long evaluationId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EtudiantEvaluationId that = (EtudiantEvaluationId) o;
            return Objects.equals(etudiantId, that.etudiantId) && Objects.equals(evaluationId, that.evaluationId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(etudiantId, evaluationId);
        }
    }
}
