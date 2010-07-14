/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "usuario")
@NamedQueries({@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"), @NamedQuery(name = "Usuario.findByCoUsuario", query = "SELECT u FROM Usuario u WHERE u.coUsuario = :coUsuario"), @NamedQuery(name = "Usuario.findByNoUsuario", query = "SELECT u FROM Usuario u WHERE u.noUsuario = :noUsuario"), @NamedQuery(name = "Usuario.findByTxClaveUsuario", query = "SELECT u FROM Usuario u WHERE u.txClaveUsuario = :txClaveUsuario"), @NamedQuery(name = "Usuario.findByTxAreaUsuario", query = "SELECT u FROM Usuario u WHERE u.txAreaUsuario = :txAreaUsuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Usuario")
    private Integer coUsuario;
    @Column(name = "No_Usuario")
    private String noUsuario;
    @Column(name = "Tx_ClaveUsuario")
    private String txClaveUsuario;
    @Column(name = "Tx_AreaUsuario")
    private String txAreaUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCoUsuario")
    private Collection<Invitacion> invitacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCoUsuario")
    private Collection<Areas> areasCollection;

    public Usuario() {
    }

    public Usuario(Integer coUsuario) {
        this.coUsuario = coUsuario;
    }

    public Integer getCoUsuario() {
        return coUsuario;
    }

    public void setCoUsuario(Integer coUsuario) {
        this.coUsuario = coUsuario;
    }

    public String getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }

    public String getTxClaveUsuario() {
        return txClaveUsuario;
    }

    public void setTxClaveUsuario(String txClaveUsuario) {
        this.txClaveUsuario = txClaveUsuario;
    }

    public String getTxAreaUsuario() {
        return txAreaUsuario;
    }

    public void setTxAreaUsuario(String txAreaUsuario) {
        this.txAreaUsuario = txAreaUsuario;
    }

    public Collection<Invitacion> getInvitacionCollection() {
        return invitacionCollection;
    }

    public void setInvitacionCollection(Collection<Invitacion> invitacionCollection) {
        this.invitacionCollection = invitacionCollection;
    }

    public Collection<Areas> getAreasCollection() {
        return areasCollection;
    }

    public void setAreasCollection(Collection<Areas> areasCollection) {
        this.areasCollection = areasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coUsuario != null ? coUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.coUsuario == null && other.coUsuario != null) || (this.coUsuario != null && !this.coUsuario.equals(other.coUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Usuario[coUsuario=" + coUsuario + "]";
    }

}
