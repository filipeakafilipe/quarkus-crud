package puc.imoveis.entities;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Movel {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movel movel = (Movel) o;
        return Objects.equals(id, movel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
