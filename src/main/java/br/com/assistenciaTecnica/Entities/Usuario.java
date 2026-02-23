package br.com.assistenciaTecnica.Entities;

import br.com.assistenciaTecnica.Enums.Status;
import br.com.assistenciaTecnica.Enums.Tipo;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private Date dataNascimento;
    private String DataAdmissão;
    private String login;
    private String senha;
    private Status status;
    private BigDecimal salario;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

   @OneToMany(mappedBy = "atendente")
   private List<OrdemServico> ordemServicos;

   @OneToMany(mappedBy = "tecnico")
   private List<OrdemServico> ordemServicos2;



}
