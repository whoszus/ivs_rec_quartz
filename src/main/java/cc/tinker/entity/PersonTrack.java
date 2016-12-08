package cc.tinker.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2016/11/23.
 */
@Entity
@Table(name = "cmcs_person_track", schema = "vsas", catalog = "")
public class PersonTrack {
    private int id;
    private Integer personId;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer devchnId;
    private Timestamp addTime;
    private Double sim;
    private Timestamp occurTime;
    private Integer picId;
    private String uuid;
    private String url;
    private int handleStatus;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSON_ID")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "START_TIME")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "END_TIME")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "DEVCHN_ID")
    public Integer getDevchnId() {
        return devchnId;
    }

    public void setDevchnId(Integer devchnId) {
        this.devchnId = devchnId;
    }

    @Basic
    @Column(name = "ADD_TIME")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "SIM")
    public Double getSim() {
        return sim;
    }

    public void setSim(Double sim) {
        this.sim = sim;
    }

    @Basic
    @Column(name = "OCCUR_TIME")
    public Timestamp getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Timestamp occurTime) {
        this.occurTime = occurTime;
    }

    @Basic
    @Column(name = "PIC_ID")
    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }


    @Basic
    @Column(name= "HANDLE_STATUS")
    public int getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(int handleStatus) {
        this.handleStatus = handleStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonTrack that = (PersonTrack) o;

        if (id != that.id) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (devchnId != null ? !devchnId.equals(that.devchnId) : that.devchnId != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (sim != null ? !sim.equals(that.sim) : that.sim != null) return false;
        if (occurTime != null ? !occurTime.equals(that.occurTime) : that.occurTime != null) return false;
        if (picId != null ? !picId.equals(that.picId) : that.picId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (devchnId != null ? devchnId.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (sim != null ? sim.hashCode() : 0);
        result = 31 * result + (occurTime != null ? occurTime.hashCode() : 0);
        result = 31 * result + (picId != null ? picId.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
