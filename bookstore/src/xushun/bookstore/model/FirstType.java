package xushun.bookstore.model;

import java.util.List;

/**
 * FirstType generated by MyEclipse Persistence Tools
 */

public class FirstType implements java.io.Serializable {

	// Fields

	private Integer typeId;   //分类Id
	private String typeName;  //分类名
	private Long lastModifyTime;  // 最后修改时间
	
	private List<SecondType> subTypes;  // 子分类列表

	// Constructors

	/** default constructor */
	public FirstType() {
	}

	/** full constructor */
	public FirstType(String typeName, Long lastModifyTime) {
		this.typeName = typeName;
		this.lastModifyTime = lastModifyTime;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Long getLastModifyTime() {
		return this.lastModifyTime;
	}

	public void setLastModifyTime(Long lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	
	public List<SecondType> getSubTypes() {
		return subTypes;
	}

	public void setSubTypes(List<SecondType> subTypes) {
		this.subTypes = subTypes;
	}
}