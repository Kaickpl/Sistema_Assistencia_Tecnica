package br.com.assistenciaTecnica.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<OrdemServico> ordemServicos;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> endereco;

}
