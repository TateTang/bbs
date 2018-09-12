package com.hnrp.bbs.pojo;

public class Grades {
	 private Integer id;
     private String honor;
     
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHonor() {
		return honor;
	}
	public void setHonor(String honor) {
		this.honor = honor;
	}
	@Override
	public String toString() {
		return "Grades [id=" + id + ", honor=" + honor + "]";
	}
}
