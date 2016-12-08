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
@Table(name = "TB_STORAGE_INFO")
@Where(clause="TYPE=3")
public class StorageInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8325685033079909552L;
	

	private Long id;
	
	private Integer type;
	
	private String uuid;
	
	private String address;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="TYPE")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name="UUID")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	


	
}