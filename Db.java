/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_demo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mackansari
 */
@Entity
@Table(name = "db")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Db.findAll", query = "SELECT d FROM Db d"),
    @NamedQuery(name = "Db.findByHost", query = "SELECT d FROM Db d WHERE d.dbPK.host = :host"),
    @NamedQuery(name = "Db.findByDb", query = "SELECT d FROM Db d WHERE d.dbPK.db = :db"),
    @NamedQuery(name = "Db.findByUser", query = "SELECT d FROM Db d WHERE d.dbPK.user = :user"),
    @NamedQuery(name = "Db.findBySelectpriv", query = "SELECT d FROM Db d WHERE d.selectpriv = :selectpriv"),
    @NamedQuery(name = "Db.findByInsertpriv", query = "SELECT d FROM Db d WHERE d.insertpriv = :insertpriv"),
    @NamedQuery(name = "Db.findByUpdatepriv", query = "SELECT d FROM Db d WHERE d.updatepriv = :updatepriv"),
    @NamedQuery(name = "Db.findByDeletepriv", query = "SELECT d FROM Db d WHERE d.deletepriv = :deletepriv"),
    @NamedQuery(name = "Db.findByCreatepriv", query = "SELECT d FROM Db d WHERE d.createpriv = :createpriv"),
    @NamedQuery(name = "Db.findByDroppriv", query = "SELECT d FROM Db d WHERE d.droppriv = :droppriv"),
    @NamedQuery(name = "Db.findByGrantpriv", query = "SELECT d FROM Db d WHERE d.grantpriv = :grantpriv"),
    @NamedQuery(name = "Db.findByReferencespriv", query = "SELECT d FROM Db d WHERE d.referencespriv = :referencespriv"),
    @NamedQuery(name = "Db.findByIndexpriv", query = "SELECT d FROM Db d WHERE d.indexpriv = :indexpriv"),
    @NamedQuery(name = "Db.findByAlterpriv", query = "SELECT d FROM Db d WHERE d.alterpriv = :alterpriv"),
    @NamedQuery(name = "Db.findByCreatetmptablepriv", query = "SELECT d FROM Db d WHERE d.createtmptablepriv = :createtmptablepriv"),
    @NamedQuery(name = "Db.findByLocktablespriv", query = "SELECT d FROM Db d WHERE d.locktablespriv = :locktablespriv"),
    @NamedQuery(name = "Db.findByCreateviewpriv", query = "SELECT d FROM Db d WHERE d.createviewpriv = :createviewpriv"),
    @NamedQuery(name = "Db.findByShowviewpriv", query = "SELECT d FROM Db d WHERE d.showviewpriv = :showviewpriv"),
    @NamedQuery(name = "Db.findByCreateroutinepriv", query = "SELECT d FROM Db d WHERE d.createroutinepriv = :createroutinepriv"),
    @NamedQuery(name = "Db.findByAlterroutinepriv", query = "SELECT d FROM Db d WHERE d.alterroutinepriv = :alterroutinepriv"),
    @NamedQuery(name = "Db.findByExecutepriv", query = "SELECT d FROM Db d WHERE d.executepriv = :executepriv"),
    @NamedQuery(name = "Db.findByEventpriv", query = "SELECT d FROM Db d WHERE d.eventpriv = :eventpriv"),
    @NamedQuery(name = "Db.findByTriggerpriv", query = "SELECT d FROM Db d WHERE d.triggerpriv = :triggerpriv")})
public class Db implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DbPK dbPK;
    @Basic(optional = false)
    @Column(name = "Select_priv")
    private String selectpriv;
    @Basic(optional = false)
    @Column(name = "Insert_priv")
    private String insertpriv;
    @Basic(optional = false)
    @Column(name = "Update_priv")
    private String updatepriv;
    @Basic(optional = false)
    @Column(name = "Delete_priv")
    private String deletepriv;
    @Basic(optional = false)
    @Column(name = "Create_priv")
    private String createpriv;
    @Basic(optional = false)
    @Column(name = "Drop_priv")
    private String droppriv;
    @Basic(optional = false)
    @Column(name = "Grant_priv")
    private String grantpriv;
    @Basic(optional = false)
    @Column(name = "References_priv")
    private String referencespriv;
    @Basic(optional = false)
    @Column(name = "Index_priv")
    private String indexpriv;
    @Basic(optional = false)
    @Column(name = "Alter_priv")
    private String alterpriv;
    @Basic(optional = false)
    @Column(name = "Create_tmp_table_priv")
    private String createtmptablepriv;
    @Basic(optional = false)
    @Column(name = "Lock_tables_priv")
    private String locktablespriv;
    @Basic(optional = false)
    @Column(name = "Create_view_priv")
    private String createviewpriv;
    @Basic(optional = false)
    @Column(name = "Show_view_priv")
    private String showviewpriv;
    @Basic(optional = false)
    @Column(name = "Create_routine_priv")
    private String createroutinepriv;
    @Basic(optional = false)
    @Column(name = "Alter_routine_priv")
    private String alterroutinepriv;
    @Basic(optional = false)
    @Column(name = "Execute_priv")
    private String executepriv;
    @Basic(optional = false)
    @Column(name = "Event_priv")
    private String eventpriv;
    @Basic(optional = false)
    @Column(name = "Trigger_priv")
    private String triggerpriv;

    public Db() {
    }

    public Db(DbPK dbPK) {
        this.dbPK = dbPK;
    }

    public Db(DbPK dbPK, String selectpriv, String insertpriv, String updatepriv, String deletepriv, String createpriv, String droppriv, String grantpriv, String referencespriv, String indexpriv, String alterpriv, String createtmptablepriv, String locktablespriv, String createviewpriv, String showviewpriv, String createroutinepriv, String alterroutinepriv, String executepriv, String eventpriv, String triggerpriv) {
        this.dbPK = dbPK;
        this.selectpriv = selectpriv;
        this.insertpriv = insertpriv;
        this.updatepriv = updatepriv;
        this.deletepriv = deletepriv;
        this.createpriv = createpriv;
        this.droppriv = droppriv;
        this.grantpriv = grantpriv;
        this.referencespriv = referencespriv;
        this.indexpriv = indexpriv;
        this.alterpriv = alterpriv;
        this.createtmptablepriv = createtmptablepriv;
        this.locktablespriv = locktablespriv;
        this.createviewpriv = createviewpriv;
        this.showviewpriv = showviewpriv;
        this.createroutinepriv = createroutinepriv;
        this.alterroutinepriv = alterroutinepriv;
        this.executepriv = executepriv;
        this.eventpriv = eventpriv;
        this.triggerpriv = triggerpriv;
    }

    public Db(String host, String db, String user) {
        this.dbPK = new DbPK(host, db, user);
    }

    public DbPK getDbPK() {
        return dbPK;
    }

    public void setDbPK(DbPK dbPK) {
        this.dbPK = dbPK;
    }

    public String getSelectpriv() {
        return selectpriv;
    }

    public void setSelectpriv(String selectpriv) {
        String oldSelectpriv = this.selectpriv;
        this.selectpriv = selectpriv;
        changeSupport.firePropertyChange("selectpriv", oldSelectpriv, selectpriv);
    }

    public String getInsertpriv() {
        return insertpriv;
    }

    public void setInsertpriv(String insertpriv) {
        String oldInsertpriv = this.insertpriv;
        this.insertpriv = insertpriv;
        changeSupport.firePropertyChange("insertpriv", oldInsertpriv, insertpriv);
    }

    public String getUpdatepriv() {
        return updatepriv;
    }

    public void setUpdatepriv(String updatepriv) {
        String oldUpdatepriv = this.updatepriv;
        this.updatepriv = updatepriv;
        changeSupport.firePropertyChange("updatepriv", oldUpdatepriv, updatepriv);
    }

    public String getDeletepriv() {
        return deletepriv;
    }

    public void setDeletepriv(String deletepriv) {
        String oldDeletepriv = this.deletepriv;
        this.deletepriv = deletepriv;
        changeSupport.firePropertyChange("deletepriv", oldDeletepriv, deletepriv);
    }

    public String getCreatepriv() {
        return createpriv;
    }

    public void setCreatepriv(String createpriv) {
        String oldCreatepriv = this.createpriv;
        this.createpriv = createpriv;
        changeSupport.firePropertyChange("createpriv", oldCreatepriv, createpriv);
    }

    public String getDroppriv() {
        return droppriv;
    }

    public void setDroppriv(String droppriv) {
        String oldDroppriv = this.droppriv;
        this.droppriv = droppriv;
        changeSupport.firePropertyChange("droppriv", oldDroppriv, droppriv);
    }

    public String getGrantpriv() {
        return grantpriv;
    }

    public void setGrantpriv(String grantpriv) {
        String oldGrantpriv = this.grantpriv;
        this.grantpriv = grantpriv;
        changeSupport.firePropertyChange("grantpriv", oldGrantpriv, grantpriv);
    }

    public String getReferencespriv() {
        return referencespriv;
    }

    public void setReferencespriv(String referencespriv) {
        String oldReferencespriv = this.referencespriv;
        this.referencespriv = referencespriv;
        changeSupport.firePropertyChange("referencespriv", oldReferencespriv, referencespriv);
    }

    public String getIndexpriv() {
        return indexpriv;
    }

    public void setIndexpriv(String indexpriv) {
        String oldIndexpriv = this.indexpriv;
        this.indexpriv = indexpriv;
        changeSupport.firePropertyChange("indexpriv", oldIndexpriv, indexpriv);
    }

    public String getAlterpriv() {
        return alterpriv;
    }

    public void setAlterpriv(String alterpriv) {
        String oldAlterpriv = this.alterpriv;
        this.alterpriv = alterpriv;
        changeSupport.firePropertyChange("alterpriv", oldAlterpriv, alterpriv);
    }

    public String getCreatetmptablepriv() {
        return createtmptablepriv;
    }

    public void setCreatetmptablepriv(String createtmptablepriv) {
        String oldCreatetmptablepriv = this.createtmptablepriv;
        this.createtmptablepriv = createtmptablepriv;
        changeSupport.firePropertyChange("createtmptablepriv", oldCreatetmptablepriv, createtmptablepriv);
    }

    public String getLocktablespriv() {
        return locktablespriv;
    }

    public void setLocktablespriv(String locktablespriv) {
        String oldLocktablespriv = this.locktablespriv;
        this.locktablespriv = locktablespriv;
        changeSupport.firePropertyChange("locktablespriv", oldLocktablespriv, locktablespriv);
    }

    public String getCreateviewpriv() {
        return createviewpriv;
    }

    public void setCreateviewpriv(String createviewpriv) {
        String oldCreateviewpriv = this.createviewpriv;
        this.createviewpriv = createviewpriv;
        changeSupport.firePropertyChange("createviewpriv", oldCreateviewpriv, createviewpriv);
    }

    public String getShowviewpriv() {
        return showviewpriv;
    }

    public void setShowviewpriv(String showviewpriv) {
        String oldShowviewpriv = this.showviewpriv;
        this.showviewpriv = showviewpriv;
        changeSupport.firePropertyChange("showviewpriv", oldShowviewpriv, showviewpriv);
    }

    public String getCreateroutinepriv() {
        return createroutinepriv;
    }

    public void setCreateroutinepriv(String createroutinepriv) {
        String oldCreateroutinepriv = this.createroutinepriv;
        this.createroutinepriv = createroutinepriv;
        changeSupport.firePropertyChange("createroutinepriv", oldCreateroutinepriv, createroutinepriv);
    }

    public String getAlterroutinepriv() {
        return alterroutinepriv;
    }

    public void setAlterroutinepriv(String alterroutinepriv) {
        String oldAlterroutinepriv = this.alterroutinepriv;
        this.alterroutinepriv = alterroutinepriv;
        changeSupport.firePropertyChange("alterroutinepriv", oldAlterroutinepriv, alterroutinepriv);
    }

    public String getExecutepriv() {
        return executepriv;
    }

    public void setExecutepriv(String executepriv) {
        String oldExecutepriv = this.executepriv;
        this.executepriv = executepriv;
        changeSupport.firePropertyChange("executepriv", oldExecutepriv, executepriv);
    }

    public String getEventpriv() {
        return eventpriv;
    }

    public void setEventpriv(String eventpriv) {
        String oldEventpriv = this.eventpriv;
        this.eventpriv = eventpriv;
        changeSupport.firePropertyChange("eventpriv", oldEventpriv, eventpriv);
    }

    public String getTriggerpriv() {
        return triggerpriv;
    }

    public void setTriggerpriv(String triggerpriv) {
        String oldTriggerpriv = this.triggerpriv;
        this.triggerpriv = triggerpriv;
        changeSupport.firePropertyChange("triggerpriv", oldTriggerpriv, triggerpriv);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dbPK != null ? dbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Db)) {
            return false;
        }
        Db other = (Db) object;
        if ((this.dbPK == null && other.dbPK != null) || (this.dbPK != null && !this.dbPK.equals(other.dbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database_demo.Db[ dbPK=" + dbPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
