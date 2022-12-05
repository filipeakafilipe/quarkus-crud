package puc.imoveis.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Comodo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private Double tamanho;

    private Long imovelId;

    @OneToMany
    @JoinColumn(name = "comodoId")
    private List<Movel> moveis = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Long getImovelId() {
        return imovelId;
    }

    public void setImovelId(Long imovelId) {
        this.imovelId = imovelId;
    }

    public List<Movel> getMoveis() {
        return moveis;
    }

    public void setMoveis(List<Movel> moveis) {
        this.moveis = moveis;
    }
}
