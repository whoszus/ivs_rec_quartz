package cc.tinker.entity;


import cc.tinker.utils.DateTimeUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by whoszus on 2016/10/12.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "cmcs_person_info")
public class PersonInfo implements Serializable {
    private static final long serialVersionUID = -7713179845973794272L;

    private int id;
    private String name;
    private String identityType;
    private String identityNum;
    private Integer gender;
    private Integer age;
    private String tel;
    private String description;
    private Integer imageId1;
    private String aearParam1;
    private Integer imageId2;
    private String areaParam2;
    private Date addTime;
    private String reason;
    private String leaveReason;
    private String handleUnit;
    private String handlePolice;
    private String registEnterTime;
    private String registLeaveTime;
    private String entryFindTime;
    private String exitFindTime;
    private Integer handleStatus;
    private String tempLeaveTime;
    private String tempLeaveReason;
    private String tempLeaveBackTime;
    private String bodyCheckDisease;
    private String bodyCheckDetail;
    private String bodyCheckTime;
    private File imgFile1;
    private File imgFile2;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "IDENTITY_TYPE", nullable = true, length = 16)
    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    @Basic
    @Column(name = "IDENTITY_NUM", nullable = true,  length = 128)
    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    @Basic
    @Column(name = "GENDER", nullable = true)
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "AGE", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "TEL", nullable = true, length = 128)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IMAGE_ID1", nullable = true)
    public Integer getImageId1() {
        return imageId1;
    }

    public void setImageId1(Integer imageId1) {
        this.imageId1 = imageId1;
    }

    @Basic
    @Column(name = "AEAR_PARAM1", nullable = true, length = 512)
    public String getAearParam1() {
        return aearParam1;
    }

    public void setAearParam1(String aearParam1) {
        this.aearParam1 = aearParam1;
    }

    @Basic
    @Column(name = "IMAGE_ID2", nullable = true)
    public Integer getImageId2() {
        return imageId2;
    }

    public void setImageId2(Integer imageId2) {
        this.imageId2 = imageId2;
    }

    @Basic
    @Column(name = "AREA_PARAM2", nullable = true, length = 512)
    public String getAreaParam2() {
        return areaParam2;
    }

    public void setAreaParam2(String areaParam2) {
        this.areaParam2 = areaParam2;
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
    @Column(name = "REASON", nullable = true, length = 255)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "LEAVE_REASON", nullable = true, length = 255)
    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    @Basic
    @Column(name = "HANDLE_UNIT", nullable = true, length = 32)
    public String getHandleUnit() {
        return handleUnit;
    }

    public void setHandleUnit(String handleUnit) {
        this.handleUnit = handleUnit;
    }

    @Basic
    @Column(name = "HANDLE_POLICE", nullable = true, length = 32)
    public String getHandlePolice() {
        return handlePolice;
    }

    public void setHandlePolice(String handlePolice) {
        this.handlePolice = handlePolice;
    }

    @Basic
    @Column(name = "REGIST_ENTER_TIME", nullable = true)
    public String getRegistEnterTime() {
        return registEnterTime;
    }

    public void setRegistEnterTime(String registEnterTime) {
        this.registEnterTime = DateTimeUtils.convertDateWithoutSecondsByFormat(registEnterTime);
    }

    @Basic
    @Column(name = "REGIST_LEAVE_TIME", nullable = true)
    public String getRegistLeaveTime() {
        return registLeaveTime;
    }

    public void setRegistLeaveTime(String registLeaveTime) {
        this.registLeaveTime = DateTimeUtils.convertDateWithoutSecondsByFormat( registLeaveTime);
    }

    @Basic
    @Column(name = "ENTRY_FIND_TIME", nullable = true)
    public String getEntryFindTime() {
        return entryFindTime;
    }

    public void setEntryFindTime(String entryFindTime) {
        this.entryFindTime = DateTimeUtils.convertDateWithoutSecondsByFormat(entryFindTime);
    }

    @Basic
    @Column(name = "EXIT_FIND_TIME", nullable = true)
    public String getExitFindTime() {
        return exitFindTime;
    }

    public void setExitFindTime(String exitFindTime) {
        this.exitFindTime = DateTimeUtils.convertDateWithoutSecondsByFormat(exitFindTime);
    }

    @Basic
    @Column(name = "HANDLE_STATUS", nullable = true)
    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    @Basic
    @Column(name = "TEMP_LEAVE_TIME", nullable = true)
    public String getTempLeaveTime() {
        return tempLeaveTime;
    }

    public void setTempLeaveTime(String tempLeaveTime) {
        this.tempLeaveTime = DateTimeUtils.convertDateWithoutSecondsByFormat(tempLeaveTime);
    }

    @Basic
    @Column(name = "TEMP_LEAVE_REASON", nullable = true, length = 128)
    public String getTempLeaveReason() {
        return tempLeaveReason;
    }

    public void setTempLeaveReason(String tempLeaveReason) {
        this.tempLeaveReason = tempLeaveReason;
    }

    @Basic
    @Column(name = "TEMP_LEAVE_BACK_TIME", nullable = true)
    public String gettempLeaveBackTime() {
        return tempLeaveBackTime;
    }

    public void settempLeaveBackTime(String tempLeaveBackTime) {
        this.tempLeaveBackTime = DateTimeUtils.convertDateWithoutSecondsByFormat(tempLeaveBackTime);
    }

    @Basic
    @Column(name = "BODY_CHECK_DISEASE", nullable = true, length = 512)
    public String getBodyCheckDisease() {
        return bodyCheckDisease;
    }

    public void setBodyCheckDisease(String bodyCheckDisease) {
        this.bodyCheckDisease = bodyCheckDisease;
    }

    @Basic
    @Column(name = "BODY_CHECK_DETAIL", nullable = true, length = 512)
    public String getBodyCheckDetail() {
        return bodyCheckDetail;
    }

    public void setBodyCheckDetail(String bodyCheckDetail) {
        this.bodyCheckDetail = bodyCheckDetail;
    }

    @Basic
    @Column(name = "BODY_CHECK_TIME", nullable = true)
    public String getBodyCheckTime() {
        return bodyCheckTime;
    }

    public void setBodyCheckTime(String bodyCheckTime) {
        this.bodyCheckTime = DateTimeUtils.convertDateWithoutSecondsByFormat(bodyCheckTime);
    }



    @ManyToOne
    @JoinColumn(name = "IMAGE_ID1",insertable=false,updatable=false)
    public File getImgFile1() {
        return imgFile1;
    }
    public void setImgFile1(File imgFile1) {
        this.imgFile1 = imgFile1;
    }

    @ManyToOne
    @JoinColumn(name = "IMAGE_ID2",insertable=false,updatable=false)
    public File getImgFile2() {
        return imgFile2;
    }
    public void setImgFile2(File imgFile2) {
        this.imgFile2 = imgFile2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonInfo that = (PersonInfo) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (identityType != null ? !identityType.equals(that.identityType) : that.identityType != null) return false;
        if (identityNum != null ? !identityNum.equals(that.identityNum) : that.identityNum != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (imageId1 != null ? !imageId1.equals(that.imageId1) : that.imageId1 != null) return false;
        if (aearParam1 != null ? !aearParam1.equals(that.aearParam1) : that.aearParam1 != null) return false;
        if (imageId2 != null ? !imageId2.equals(that.imageId2) : that.imageId2 != null) return false;
        if (areaParam2 != null ? !areaParam2.equals(that.areaParam2) : that.areaParam2 != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (leaveReason != null ? !leaveReason.equals(that.leaveReason) : that.leaveReason != null) return false;
        if (handleUnit != null ? !handleUnit.equals(that.handleUnit) : that.handleUnit != null) return false;
        if (handlePolice != null ? !handlePolice.equals(that.handlePolice) : that.handlePolice != null) return false;
        if (registEnterTime != null ? !registEnterTime.equals(that.registEnterTime) : that.registEnterTime != null)
            return false;
        if (registLeaveTime != null ? !registLeaveTime.equals(that.registLeaveTime) : that.registLeaveTime != null)
            return false;
        if (entryFindTime != null ? !entryFindTime.equals(that.entryFindTime) : that.entryFindTime != null)
            return false;
        if (exitFindTime != null ? !exitFindTime.equals(that.exitFindTime) : that.exitFindTime != null) return false;
        if (handleStatus != null ? !handleStatus.equals(that.handleStatus) : that.handleStatus != null) return false;
        if (tempLeaveTime != null ? !tempLeaveTime.equals(that.tempLeaveTime) : that.tempLeaveTime != null)
            return false;
        if (tempLeaveReason != null ? !tempLeaveReason.equals(that.tempLeaveReason) : that.tempLeaveReason != null)
            return false;
        if (tempLeaveBackTime != null ? !tempLeaveBackTime.equals(that.tempLeaveBackTime) : that.tempLeaveBackTime != null)
            return false;
        if (bodyCheckDisease != null ? !bodyCheckDisease.equals(that.bodyCheckDisease) : that.bodyCheckDisease != null)
            return false;
        if (bodyCheckDetail != null ? !bodyCheckDetail.equals(that.bodyCheckDetail) : that.bodyCheckDetail != null)
            return false;
        if (bodyCheckTime != null ? !bodyCheckTime.equals(that.bodyCheckTime) : that.bodyCheckTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (identityType != null ? identityType.hashCode() : 0);
        result = 31 * result + (identityNum != null ? identityNum.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (imageId1 != null ? imageId1.hashCode() : 0);
        result = 31 * result + (aearParam1 != null ? aearParam1.hashCode() : 0);
        result = 31 * result + (imageId2 != null ? imageId2.hashCode() : 0);
        result = 31 * result + (areaParam2 != null ? areaParam2.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (leaveReason != null ? leaveReason.hashCode() : 0);
        result = 31 * result + (handleUnit != null ? handleUnit.hashCode() : 0);
        result = 31 * result + (handlePolice != null ? handlePolice.hashCode() : 0);
        result = 31 * result + (registEnterTime != null ? registEnterTime.hashCode() : 0);
        result = 31 * result + (registLeaveTime != null ? registLeaveTime.hashCode() : 0);
        result = 31 * result + (entryFindTime != null ? entryFindTime.hashCode() : 0);
        result = 31 * result + (exitFindTime != null ? exitFindTime.hashCode() : 0);
        result = 31 * result + (handleStatus != null ? handleStatus.hashCode() : 0);
        result = 31 * result + (tempLeaveTime != null ? tempLeaveTime.hashCode() : 0);
        result = 31 * result + (tempLeaveReason != null ? tempLeaveReason.hashCode() : 0);
        result = 31 * result + (tempLeaveBackTime != null ? tempLeaveBackTime.hashCode() : 0);
        result = 31 * result + (bodyCheckDisease != null ? bodyCheckDisease.hashCode() : 0);
        result = 31 * result + (bodyCheckDetail != null ? bodyCheckDetail.hashCode() : 0);
        result = 31 * result + (bodyCheckTime != null ? bodyCheckTime.hashCode() : 0);
        return result;
    }
}
