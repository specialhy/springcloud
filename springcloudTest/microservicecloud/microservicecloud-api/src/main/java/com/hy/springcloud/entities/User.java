package com.hy.springcloud.entities;

import java.io.Serializable;



public class User implements Serializable {

    private static final long serialVersionUID = -386776111915363468L;
    private Integer id;
    private String loginName;
    private String password;
    private String name;
    private String gender;
    private String telephone;
    private String email;
    private String remark;

    // 用户图像上传路径
    private String imagePath;
   
    //来自那个数据库,因为微服务架构可以一个服务对应一个数据库,同一个信息被存进不同数据库
    private String db_dource;



    public User() {
		super();
	}

	public User(Integer id, String loginName, String password, String name, String gender, String telephone,
			String email, String remark, String imagePath, String db_dource) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.telephone = telephone;
		this.email = email;
		this.remark = remark;
		this.imagePath = imagePath;
		this.db_dource = db_dource;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getDb_dource() {
		return db_dource;
	}

	public void setDb_dource(String db_dource) {
		this.db_dource = db_dource;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
 
}
