/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.rest.rinfo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oleg
 */
@Entity
@Table(name = "VIRI_REGISTRY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registry.findAll", query = "SELECT v FROM Registry v")})
public class Registry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGISTRY_ID")
    private Long registryId;
    @Size(max = 32)
    @Column(name = "SNAME")
    private String sname;
    @Size(max = 128)
    @Column(name = "DESCR")
    private String descr;
    @Column(name = "REG_TYPE")
    private Integer regType;
    @Column(name = "ACTIVE")
    private Integer active;

    public Registry() {
    }

    public Registry(Long registryId) {
        this.registryId = registryId;
    }

    public Long getRegistryId() {
        return registryId;
    }

    public void setRegistryId(Long registryId) {
        this.registryId = registryId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getRegType() {
        return regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registryId != null ? registryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registry)) {
            return false;
        }
        Registry other = (Registry) object;
        if ((this.registryId == null && other.registryId != null) || (this.registryId != null && !this.registryId.equals(other.registryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "platform.rest.rinfo.ViriRegistry[ registryId=" + registryId + " ]";
    }
    
}
