package cc.tinker.entity;

import org.hibernate.annotations.Filter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/11/3.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "ivs_rec_result")
public class IvsRecResult implements Serializable {
    private int id;
    private Integer taskId;
    private Integer devchnId;
    private String beginTime;
    private String endTime;
    private Integer objId;
    private Integer objColor;
    private String uuid;
    private String snapshotUrl;
    private String snapshotTime;
    private String snapshotUrl2;
    private String snapshotTime2;
    private String snapshotUrl3;
    private String snapshotTime3;
    private Timestamp addDate;
    private Integer objX;
    private Integer objY;
    private Integer objWidth;
    private Integer objHeight;
    private Integer moveAction;
    private Integer trackTime;
    private Double distance;
    private Double angle;
    private Integer direction;

    private StorageInfo storageInfo;

    @ManyToOne
    @JoinColumn(name="UUID",referencedColumnName = "UUID",updatable=false,insertable=false)
    @Filter(name="TYPE",condition = "3")
    public StorageInfo getStorageInfo() {
        return storageInfo;
    }

    public void setStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
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
    @Column(name = "TASK_ID", nullable = true)
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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
    @Column(name = "BEGIN_TIME", nullable = true, length = 32)
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "END_TIME", nullable = true, length = 32)
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "OBJ_ID", nullable = true)
    public Integer getObjId() {
        return objId;
    }

    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    @Basic
    @Column(name = "OBJ_COLOR", nullable = true)
    public Integer getObjColor() {
        return objColor;
    }

    public void setObjColor(Integer objColor) {
        this.objColor = objColor;
    }

    @Basic
    @Column(name = "UUID", nullable = true, length = 128)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "SNAPSHOT_URL", nullable = true, length = 256)
    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    @Basic
    @Column(name = "SNAPSHOT_TIME", nullable = true, length = 32)
    public String getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    @Basic
    @Column(name = "SNAPSHOT_URL2", nullable = true, length = 256)
    public String getSnapshotUrl2() {
        return snapshotUrl2;
    }

    public void setSnapshotUrl2(String snapshotUrl2) {
        this.snapshotUrl2 = snapshotUrl2;
    }

    @Basic
    @Column(name = "SNAPSHOT_TIME2", nullable = true, length = 32)
    public String getSnapshotTime2() {
        return snapshotTime2;
    }

    public void setSnapshotTime2(String snapshotTime2) {
        this.snapshotTime2 = snapshotTime2;
    }

    @Basic
    @Column(name = "SNAPSHOT_URL3", nullable = true, length = 256)
    public String getSnapshotUrl3() {
        return snapshotUrl3;
    }

    public void setSnapshotUrl3(String snapshotUrl3) {
        this.snapshotUrl3 = snapshotUrl3;
    }

    @Basic
    @Column(name = "SNAPSHOT_TIME3", nullable = true, length = 32)
    public String getSnapshotTime3() {
        return snapshotTime3;
    }

    public void setSnapshotTime3(String snapshotTime3) {
        this.snapshotTime3 = snapshotTime3;
    }

    @Basic
    @Column(name = "ADD_DATE", nullable = true)
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "OBJ_X", nullable = true)
    public Integer getObjX() {
        return objX;
    }

    public void setObjX(Integer objX) {
        this.objX = objX;
    }

    @Basic
    @Column(name = "OBJ_Y", nullable = true)
    public Integer getObjY() {
        return objY;
    }

    public void setObjY(Integer objY) {
        this.objY = objY;
    }

    @Basic
    @Column(name = "OBJ_WIDTH", nullable = true)
    public Integer getObjWidth() {
        return objWidth;
    }

    public void setObjWidth(Integer objWidth) {
        this.objWidth = objWidth;
    }

    @Basic
    @Column(name = "OBJ_HEIGHT", nullable = true)
    public Integer getObjHeight() {
        return objHeight;
    }

    public void setObjHeight(Integer objHeight) {
        this.objHeight = objHeight;
    }

    @Basic
    @Column(name = "MOVE_ACTION", nullable = true)
    public Integer getMoveAction() {
        return moveAction;
    }

    public void setMoveAction(Integer moveAction) {
        this.moveAction = moveAction;
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
    @Column(name = "DIRECTION", nullable = true)
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IvsRecResult that = (IvsRecResult) o;

        if (id != that.id) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (devchnId != null ? !devchnId.equals(that.devchnId) : that.devchnId != null) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (objId != null ? !objId.equals(that.objId) : that.objId != null) return false;
        if (objColor != null ? !objColor.equals(that.objColor) : that.objColor != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (snapshotUrl != null ? !snapshotUrl.equals(that.snapshotUrl) : that.snapshotUrl != null) return false;
        if (snapshotTime != null ? !snapshotTime.equals(that.snapshotTime) : that.snapshotTime != null) return false;
        if (snapshotUrl2 != null ? !snapshotUrl2.equals(that.snapshotUrl2) : that.snapshotUrl2 != null) return false;
        if (snapshotTime2 != null ? !snapshotTime2.equals(that.snapshotTime2) : that.snapshotTime2 != null)
            return false;
        if (snapshotUrl3 != null ? !snapshotUrl3.equals(that.snapshotUrl3) : that.snapshotUrl3 != null) return false;
        if (snapshotTime3 != null ? !snapshotTime3.equals(that.snapshotTime3) : that.snapshotTime3 != null)
            return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (objX != null ? !objX.equals(that.objX) : that.objX != null) return false;
        if (objY != null ? !objY.equals(that.objY) : that.objY != null) return false;
        if (objWidth != null ? !objWidth.equals(that.objWidth) : that.objWidth != null) return false;
        if (objHeight != null ? !objHeight.equals(that.objHeight) : that.objHeight != null) return false;
        if (moveAction != null ? !moveAction.equals(that.moveAction) : that.moveAction != null) return false;
        if (trackTime != null ? !trackTime.equals(that.trackTime) : that.trackTime != null) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;
        if (angle != null ? !angle.equals(that.angle) : that.angle != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (devchnId != null ? devchnId.hashCode() : 0);
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (objId != null ? objId.hashCode() : 0);
        result = 31 * result + (objColor != null ? objColor.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (snapshotUrl != null ? snapshotUrl.hashCode() : 0);
        result = 31 * result + (snapshotTime != null ? snapshotTime.hashCode() : 0);
        result = 31 * result + (snapshotUrl2 != null ? snapshotUrl2.hashCode() : 0);
        result = 31 * result + (snapshotTime2 != null ? snapshotTime2.hashCode() : 0);
        result = 31 * result + (snapshotUrl3 != null ? snapshotUrl3.hashCode() : 0);
        result = 31 * result + (snapshotTime3 != null ? snapshotTime3.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (objX != null ? objX.hashCode() : 0);
        result = 31 * result + (objY != null ? objY.hashCode() : 0);
        result = 31 * result + (objWidth != null ? objWidth.hashCode() : 0);
        result = 31 * result + (objHeight != null ? objHeight.hashCode() : 0);
        result = 31 * result + (moveAction != null ? moveAction.hashCode() : 0);
        result = 31 * result + (trackTime != null ? trackTime.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (angle != null ? angle.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
