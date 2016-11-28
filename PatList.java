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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mackansari
 */
@Entity
@Table(name = "Pat_List", catalog = "demo", schema = "")
@NamedQueries({
    @NamedQuery(name = "PatList.findAll", query = "SELECT p FROM PatList p"),
    @NamedQuery(name = "PatList.findByPatientID", query = "SELECT p FROM PatList p WHERE p.patientID = :patientID"),
    @NamedQuery(name = "PatList.findByPatFName", query = "SELECT p FROM PatList p WHERE p.patFName = :patFName"),
    @NamedQuery(name = "PatList.findByPatMName", query = "SELECT p FROM PatList p WHERE p.patMName = :patMName"),
    @NamedQuery(name = "PatList.findByPatLName", query = "SELECT p FROM PatList p WHERE p.patLName = :patLName"),
    @NamedQuery(name = "PatList.findByPatStreetAddrs", query = "SELECT p FROM PatList p WHERE p.patStreetAddrs = :patStreetAddrs"),
    @NamedQuery(name = "PatList.findByPatCity", query = "SELECT p FROM PatList p WHERE p.patCity = :patCity"),
    @NamedQuery(name = "PatList.findByPatState", query = "SELECT p FROM PatList p WHERE p.patState = :patState"),
    @NamedQuery(name = "PatList.findByPatHeight", query = "SELECT p FROM PatList p WHERE p.patHeight = :patHeight"),
    @NamedQuery(name = "PatList.findByPatWeight", query = "SELECT p FROM PatList p WHERE p.patWeight = :patWeight"),
    @NamedQuery(name = "PatList.findByPatDOB", query = "SELECT p FROM PatList p WHERE p.patDOB = :patDOB"),
    @NamedQuery(name = "PatList.findByPatPriority", query = "SELECT p FROM PatList p WHERE p.patPriority = :patPriority"),
    @NamedQuery(name = "PatList.findByPatComments", query = "SELECT p FROM PatList p WHERE p.patComments = :patComments")})
public class PatList implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "Patient_ID")
    private Integer patientID;
    @Id
    @Basic(optional = false)
    @Column(name = "Pat_FName")
    private String patFName;
    @Column(name = "Pat_MName")
    private String patMName;
    @Column(name = "Pat_LName")
    private String patLName;
    @Column(name = "Pat_StreetAddrs")
    private String patStreetAddrs;
    @Column(name = "Pat_City")
    private String patCity;
    @Column(name = "Pat_State")
    private String patState;
    @Column(name = "Pat_Height")
    private String patHeight;
    @Column(name = "Pat_Weight")
    private String patWeight;
    @Column(name = "Pat_DOB")
    private String patDOB;
    @Column(name = "Pat_Priority")
    private Integer patPriority;
    @Column(name = "Pat_Comments")
    private String patComments;

    public PatList() {
    }

    public PatList(String patFName) {
        this.patFName = patFName;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        Integer oldPatientID = this.patientID;
        this.patientID = patientID;
        changeSupport.firePropertyChange("patientID", oldPatientID, patientID);
    }

    public String getPatFName() {
        return patFName;
    }

    public void setPatFName(String patFName) {
        String oldPatFName = this.patFName;
        this.patFName = patFName;
        changeSupport.firePropertyChange("patFName", oldPatFName, patFName);
    }

    public String getPatMName() {
        return patMName;
    }

    public void setPatMName(String patMName) {
        String oldPatMName = this.patMName;
        this.patMName = patMName;
        changeSupport.firePropertyChange("patMName", oldPatMName, patMName);
    }

    public String getPatLName() {
        return patLName;
    }

    public void setPatLName(String patLName) {
        String oldPatLName = this.patLName;
        this.patLName = patLName;
        changeSupport.firePropertyChange("patLName", oldPatLName, patLName);
    }

    public String getPatStreetAddrs() {
        return patStreetAddrs;
    }

    public void setPatStreetAddrs(String patStreetAddrs) {
        String oldPatStreetAddrs = this.patStreetAddrs;
        this.patStreetAddrs = patStreetAddrs;
        changeSupport.firePropertyChange("patStreetAddrs", oldPatStreetAddrs, patStreetAddrs);
    }

    public String getPatCity() {
        return patCity;
    }

    public void setPatCity(String patCity) {
        String oldPatCity = this.patCity;
        this.patCity = patCity;
        changeSupport.firePropertyChange("patCity", oldPatCity, patCity);
    }

    public String getPatState() {
        return patState;
    }

    public void setPatState(String patState) {
        String oldPatState = this.patState;
        this.patState = patState;
        changeSupport.firePropertyChange("patState", oldPatState, patState);
    }

    public String getPatHeight() {
        return patHeight;
    }

    public void setPatHeight(String patHeight) {
        String oldPatHeight = this.patHeight;
        this.patHeight = patHeight;
        changeSupport.firePropertyChange("patHeight", oldPatHeight, patHeight);
    }

    public String getPatWeight() {
        return patWeight;
    }

    public void setPatWeight(String patWeight) {
        String oldPatWeight = this.patWeight;
        this.patWeight = patWeight;
        changeSupport.firePropertyChange("patWeight", oldPatWeight, patWeight);
    }

    public String getPatDOB() {
        return patDOB;
    }

    public void setPatDOB(String patDOB) {
        String oldPatDOB = this.patDOB;
        this.patDOB = patDOB;
        changeSupport.firePropertyChange("patDOB", oldPatDOB, patDOB);
    }

    public Integer getPatPriority() {
        return patPriority;
    }

    public void setPatPriority(Integer patPriority) {
        Integer oldPatPriority = this.patPriority;
        this.patPriority = patPriority;
        changeSupport.firePropertyChange("patPriority", oldPatPriority, patPriority);
    }

    public String getPatComments() {
        return patComments;
    }

    public void setPatComments(String patComments) {
        String oldPatComments = this.patComments;
        this.patComments = patComments;
        changeSupport.firePropertyChange("patComments", oldPatComments, patComments);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patFName != null ? patFName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatList)) {
            return false;
        }
        PatList other = (PatList) object;
        if ((this.patFName == null && other.patFName != null) || (this.patFName != null && !this.patFName.equals(other.patFName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database_demo.PatList[ patFName=" + patFName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
