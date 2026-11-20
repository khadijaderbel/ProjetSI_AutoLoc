package tn.esprit.projet.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Setter
@Getter
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    private LocalDate datePaiement;
    private BigDecimal montant;
    private ModePaiement modePaiement;
    @ManyToOne
    Contrat contrat;
}
