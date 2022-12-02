package br.edu.universidadedevassouras.SCP.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpessoa;
    @Column(nullable = false, unique = true)
    private String CPF;
    @Column(nullable = false)
    private String Nome;
    @Column(nullable = false, unique = true)
    private int Matricula;
    @Column(nullable = true)
    private Date Nascimento;
    @Column(nullable = true)
    private char Genero;
    @Column(nullable = true)
    @Lob
    private String Foto;
    @OneToMany(mappedBy = "pessoa")
    private List<Presenca> presencaList;
}
