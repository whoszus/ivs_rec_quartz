package cc.tinker.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户登录记录实体
 * 
 * 使用Hibernate annotation定义二级缓存.
 * 
 * @author abe
 */
//JPA标识
@Entity
//表名与类名不相同时重新定义表名.
@Table(name = "TB_FILEINFO")
@Where(clause = "IS_DELETED = 0")
public class File implements Serializable{
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -7713179845973794279L;
	
	private Long id;
	
	private Integer type;
	
	private String name;
	
	private Integer status;
	
	private String accountName;
	
	private String formatType;
	
	private Short isAr;
	
	private String fileName;
	
	private String uuid;
	
	private String startTime;
	
	private String endTime;
	
	private String uploadTime;
	
	private String platRecInfo;
	
	private Integer platRecType;
    
	@Column(name="FILE_TYPE")
    public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="STATUS")
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Column(name="ACCOUNT_NAME")
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	@Column(name="FORMAT_TYPE")
	public String getFormatType() {
		return formatType;
	}
	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
	@Column(name="IS_AR")
	public Short getIsAr() {
		return isAr;
	}
	public void setIsAr(Short isAr) {
		this.isAr = isAr;
	}
	
	@Column(name="REAL_FILE_NAME")
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Column(name="UUID")
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	@Column(name="BEGIN_DATE")
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	@Column(name="END_DATE")
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	@Column(name="UPLOAD_DATE")
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	
	
	@Column(name="PLATFORM_RECINFO")
	public String getPlatRecInfo() {
		return platRecInfo;
	}
	public void setPlatRecInfo(String platRecInfo) {
		this.platRecInfo = platRecInfo;
	}
	
	@Column(name="PLATFORM_RECSTG_TYPE")
	public Integer getPlatRecType() {
		return platRecType;
	}
	public void setPlatRecType(Integer platRecType) {
		this.platRecType = platRecType;
	}

}