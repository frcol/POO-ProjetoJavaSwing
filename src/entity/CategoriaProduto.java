package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM CategoriaProduto c"),
    @NamedQuery(name = "Categoria.findById", query = "SELECT c FROM CategoriaProduto c WHERE c.id = :codigo")
})

@Entity
public class CategoriaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descricao")
    private String descricao;
    
    @OneToMany(mappedBy = "categoriaProduto", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Produto> lstProdutos;
    
    // ===================================================================

    public CategoriaProduto() {
    }

    public CategoriaProduto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     public List<Produto> getLstProdutos() {
        return lstProdutos;
    }

    // ===================================================================
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProduto)) {
            return false;
        }
        CategoriaProduto other = (CategoriaProduto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id+" - "+descricao;
    }

}
