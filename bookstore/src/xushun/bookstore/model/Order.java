package xushun.bookstore.model;

import java.util.List;

/**
 * Order generated by MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields
	public static final int ORDER_STATUS_NONDEALED = 0;	
	public static final int ORDER_STATUS_DEALED = 1;

	private Integer orderId;
	private Integer memberId;
	private String trueName;
	private String address;
	private String postcode;
	private String tel;
	private String carry;
	private String pay;
	private Long orderTime;
	private Integer status;
	private Double amount;
	private Long dealTime;

	private List<OrderDetail> orderDetails;
	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer memberId, String trueName, String address,
			String postcode, String carry, String pay, Long orderTime,
			Integer status, Double amount, Long dealTime) {
		this.memberId = memberId;
		this.trueName = trueName;
		this.address = address;
		this.postcode = postcode;
		this.carry = carry;
		this.pay = pay;
		this.orderTime = orderTime;
		this.status = status;
		this.amount = amount;
		this.dealTime = dealTime;
	}

	/** full constructor */
	public Order(Integer memberId, String trueName, String address,
			String postcode, String tel, String carry, String pay,
			Long orderTime, Integer status, Double amount, Long dealTime) {
		this.memberId = memberId;
		this.trueName = trueName;
		this.address = address;
		this.postcode = postcode;
		this.tel = tel;
		this.carry = carry;
		this.pay = pay;
		this.orderTime = orderTime;
		this.status = status;
		this.amount = amount;
		this.dealTime = dealTime;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCarry() {
		return this.carry;
	}

	public void setCarry(String carry) {
		this.carry = carry;
	}

	public String getPay() {
		return this.pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Long getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Long orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getDealTime() {
		return this.dealTime;
	}

	public void setDealTime(Long dealTime) {
		this.dealTime = dealTime;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}