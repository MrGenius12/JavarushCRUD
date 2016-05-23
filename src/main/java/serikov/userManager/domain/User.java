package serikov.userManager.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "age")
	private Integer age;

	@Column(name = "isAdmin")
	private Boolean isAdmin;

	@Column(name = "createDate")
	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
