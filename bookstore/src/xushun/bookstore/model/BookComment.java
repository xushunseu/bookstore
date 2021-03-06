package xushun.bookstore.model;

/**
 * BookComment generated by MyEclipse Persistence Tools
 */

public class BookComment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Integer bookId;
	private Integer memberId;
	private String loginName;
	private String content;
	private Long commentTime;

	// Constructors

	/** default constructor */
	public BookComment() {
	}

	/** full constructor */
	public BookComment(Integer bookId, Integer memberId, String loginName,
			String content, Long commentTime) {
		this.bookId = bookId;
		this.memberId = memberId;
		this.loginName = loginName;
		this.content = content;
		this.commentTime = commentTime;
	}

	// Property accessors

	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Long commentTime) {
		this.commentTime = commentTime;
	}

}