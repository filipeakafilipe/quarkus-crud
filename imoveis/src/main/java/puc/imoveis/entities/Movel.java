package puc.imoveis.entities;

import javax.persistence.*;

@Entity
public class Movel {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Long comodoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getComodoId() {
        return comodoId;
    }

    public void setComodoId(Long comodoId) {
        this.comodoId = comodoId;
    }
}
