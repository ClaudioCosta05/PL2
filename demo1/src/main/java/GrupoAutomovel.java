import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class GrupoAutomovel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int portas;
    private String classe;
    public GrupoAutomovel(String nome, int portas, String classe) {
        this.nome = nome;
        this.portas = portas;
        this.classe = classe;
    }

    public GrupoAutomovel() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
