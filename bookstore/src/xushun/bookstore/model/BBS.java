package xushun.bookstore.model;

/**
 * Bbs generated by MyEclipse Persistence Tools
 */

public class BBS implements java.io.Serializable {

	// Fields

	private Integer bbsId;
	private String title;
	private String content;
	private Integer createId;
	private String createName;
	private Long createTime;


	// Property accessors

	public Integer getBbsId() {
		return this.bbsId;
	}

	public void setBbsId(Integer bbsId) {
		this.bbsId = bbsId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCreateId() {
		return this.createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public String getCreateName() {
		return this.createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

}