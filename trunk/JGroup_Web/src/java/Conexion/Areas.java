/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "areas")
@NamedQueries({@NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a"), @NamedQuery(name = "Areas.findByCoArea", query = "SELECT a FROM Areas a WHERE a.coArea = :coArea"), @NamedQuery(name = "Areas.findByNoArea", query = "SELECT a FROM Areas a WHERE a.noArea = :noArea")})
public class Areas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Area")
    private Integer coArea;
    @Column(name = "No_Area")
    private String noArea;
    @JoinColumn(name = "Usuario_Co_Usuario", referencedColumnName = "Co_Usuario")
    @ManyToOne(optional = false)
    private Usuario usuarioCoUsuario;

    public Areas() {
    }

    public Areas(Integer coArea) {
        this.coArea = coArea;
    }

    public Integer getCoArea() {
        return coArea;
    }

    public void setCoArea(Integer coArea) {
        this.coArea = coArea;
    }

    public String getNoArea() {
        return noArea;
    }

    public void setNoArea(String noArea) {
        this.noArea = noArea;
    }

    public Usuario getUsuarioCoUsuario() {
        return usuarioCoUsuario;
    }

    public void setUsuarioCoUsuario(Usuario usuarioCoUsuario) {
        this.usuarioCoUsuario = usuarioCoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coArea != null ? coArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.coArea == null && other.coArea != null) || (this.coArea != null && !this.coArea.equals(other.coArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Areas[coArea=" + coArea + "]";
    }

}
