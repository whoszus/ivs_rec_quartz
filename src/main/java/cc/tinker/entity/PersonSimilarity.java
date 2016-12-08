package cc.tinker.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Administrator on 2016/11/2.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "cmcs_person_similarity")
public class PersonSimilarity implements Serializable{
    private static final long serialVersionUID = -7713179845973794273L;

    private int id;
    private Integer personId;
    private Integer direction;
    private Date occurTime;
    private double sim;
    private Integer trackTime;
    private Integer devchnId;
    private Double distance;
    private Double angle;
    private Date addTime;
    private int picId;

    private IvsRecResult ivsRecResult;



    @ManyToOne
    @JoinColumn(name = "PIC_ID",referencedColumnName = "ID",updatable=false,insertable=false)
    public IvsRecResult getIvsRecResult() {
        return ivsRecResult;
    }

    public void setIvsRecResult(IvsRecResult ivsRecResult) {
        this.ivsRecResult = ivsRecResult;
    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSON_ID", nullable = true)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "DIRECTION", nullable = true)
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "OCCUR_TIME", nullable = false)
    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    @Basic
    @Column(name = "SIM", nullable = false, precision = 4)
    public double getSim() {
        return sim;
    }

    public void setSim(double sim) {
        this.sim = sim;
    }

    @Basic
    @Column(name = "TRACK_TIME", nullable = true)
    public Integer getTrackTime() {
        return trackTime;
    }

    public void setTrackTime(Integer trackTime) {
        this.trackTime = trackTime;
    }

    @Basic
    @Column(name = "DEVCHN_ID", nullable = true)
    public Integer getDevchnId() {
        return devchnId;
    }

    public void setDevchnId(Integer devchnId) {
        this.devchnId = devchnId;
    }

    @Basic
    @Column(name = "DISTANCE", nullable = true, precision = 4)
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "ANGLE", nullable = true, precision = 4)
    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    @Basic
    @Column(name = "ADD_TIME", nullable = true)
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name="PIC_ID", nullable = true)
    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }
}
