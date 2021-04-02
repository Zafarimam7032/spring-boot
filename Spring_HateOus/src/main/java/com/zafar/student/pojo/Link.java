package com.zafar.student.pojo;

public class Link {
	private String linkName;
	private String linkSource;
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkSource() {
		return linkSource;
	}
	public void setLinkSource(String linkSource) {
		this.linkSource = linkSource;
	}
	public Link(String linkName, String linkSource) {
		super();
		this.linkName = linkName;
		this.linkSource = linkSource;
	}
	public Link() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Link [linkName=" + linkName + ", linkSource=" + linkSource + "]";
	}
	

}
