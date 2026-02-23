package br.com.assistenciaTecnica.Entities;

import br.com.assistenciaTecnica.Enums.StatusEquipamento;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOrdemServico;
    private String descricaoProblema;
    private String dataAbertura;
    private String dataFechamento;
    @Enumerated(EnumType.STRING)
    private StatusEquipamento statusEquipamento;
    private BigDecimal valorPecas;
    private BigDecimal valorServico;
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "atendente_id")
    private Usuario atendente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Usuario tecnico;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Equipamento equipamento;
}
