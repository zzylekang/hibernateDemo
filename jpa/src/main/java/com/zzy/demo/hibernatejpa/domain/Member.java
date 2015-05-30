package com.zzy.demo.hibernatejpa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="MB_MEMBER")
public class Member implements Serializable{
	
	private static final long serialVersionUID = 8694140187414081671L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, length = 22)
	private Long id;
	
	@Column(name = "MEMBER_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 22)
	private Long memberId;
	
	@Column(name = "STORE_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long storeId;
	
	@Column(name = "ACCOUNT_NAME", unique = true, nullable = false, insertable = true, updatable = true, length = 64)
	private java.lang.String accountName;
	
	@Column(name = "IS_LOCKED", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String isLocked;
	
	@Column(name = "LOCK_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	private java.util.Date lockTime;
	
	@Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, length = 128)
	private java.lang.String password;
	
	@Column(name = "PWD_SALT", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String pwdSalt;
	
	@Column(name = "PWD_RESET_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String pwdResetCode;
	
	@Column(name = "TOTLE_CONSUME", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long totleConsume;
	
	@Column(name = "POINT", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long point;
	
	@Column(name = "RANK", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
	private java.lang.String rank;
	
	@Column(name = "IS_VALIDATED", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String isValidated;
	
	@Column(name = "IS_TEL_VALIDATED", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String isTelValidated;
	
	@Column(name = "IS_SEND_TO_CRM", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String isSendToCrm;
	
	@Column(name = "REAL_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 256)
	private java.lang.String realName;
	
	@Column(name = "NICK_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 256)
	private java.lang.String nickName;
	
	@Column(name = "EMAIL", unique = false, nullable = true, insertable = true, updatable = true, length = 128)
	private java.lang.String email;
	
	@Column(name = "PHONE_NO", unique = false, nullable = true, insertable = true, updatable = true, length = 16)
	private java.lang.String phoneNo;
	
	@Column(name = "REG_IP", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String regIp;
	
	@Column(name = "REG_FROM", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String regFrom;
	
	@Column(name = "REG_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long regTime;
	
	@Column(name = "IS_BAND_CARD", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String isBandCard;
	
	@Column(name = "MEM_CARD_NO", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String memCardNo;
	
	@Column(name = "CARD_IS_SEND", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String cardIsSend;
	
	@Column(name = "CARD_SEND_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	private java.util.Date cardSendTime;
	
	@Column(name = "CARD_APPLY_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	private java.util.Date cardApplyTime;
	
	@Column(name = "LABEL", unique = false, nullable = true, insertable = true, updatable = true, length = 1024)
	private java.lang.String label;
	
	@Column(name = "ACCOUNT_BALANCE", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long accountBalance;
	
	@Column(name = "REGISTER_STAMP_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String registerStampTime;
	
	@Column(name = "CHENG_PASSWORD_STAMP_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String chengPasswordStampTime;
	
	@Column(name = "SUCCESS_PASSWORD_STAMP_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String successPasswordStampTime;
	
	@Column(name = "ACCOUNTS_MAIL_STAMP_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String accountsMailStampTime;
	
	@Column(name = "EVERY_TIME_LOGIN_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 22)
	private Long everyTimeLoginDate;
	
	@Column(name = "REGISTER_COME_TYPE", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String registerComeType;
	
	@Column(name = "IS_LOGIN", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	private java.lang.String isLogin;
	
	@Column(name = "VIRTUAL_ACCOUNT_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
	private java.lang.String virtualAccountName;
	
	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER, mappedBy="member")
	private List<MemberGroupRel> memGroupRels;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public java.lang.String getAccountName() {
		return accountName;
	}

	public void setAccountName(java.lang.String accountName) {
		this.accountName = accountName;
	}

	public java.lang.String getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(java.lang.String isLocked) {
		this.isLocked = isLocked;
	}

	public java.util.Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(java.util.Date lockTime) {
		this.lockTime = lockTime;
	}

	public java.lang.String getPassword() {
		return password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getPwdSalt() {
		return pwdSalt;
	}

	public void setPwdSalt(java.lang.String pwdSalt) {
		this.pwdSalt = pwdSalt;
	}

	public java.lang.String getPwdResetCode() {
		return pwdResetCode;
	}

	public void setPwdResetCode(java.lang.String pwdResetCode) {
		this.pwdResetCode = pwdResetCode;
	}

	public Long getTotleConsume() {
		return totleConsume;
	}

	public void setTotleConsume(Long totleConsume) {
		this.totleConsume = totleConsume;
	}

	public Long getPoint() {
		return point;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public java.lang.String getRank() {
		return rank;
	}

	public void setRank(java.lang.String rank) {
		this.rank = rank;
	}

	public java.lang.String getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(java.lang.String isValidated) {
		this.isValidated = isValidated;
	}

	public java.lang.String getIsTelValidated() {
		return isTelValidated;
	}

	public void setIsTelValidated(java.lang.String isTelValidated) {
		this.isTelValidated = isTelValidated;
	}

	public java.lang.String getIsSendToCrm() {
		return isSendToCrm;
	}

	public void setIsSendToCrm(java.lang.String isSendToCrm) {
		this.isSendToCrm = isSendToCrm;
	}

	public java.lang.String getRealName() {
		return realName;
	}

	public void setRealName(java.lang.String realName) {
		this.realName = realName;
	}

	public java.lang.String getNickName() {
		return nickName;
	}

	public void setNickName(java.lang.String nickName) {
		this.nickName = nickName;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(java.lang.String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public java.lang.String getRegIp() {
		return regIp;
	}

	public void setRegIp(java.lang.String regIp) {
		this.regIp = regIp;
	}

	public java.lang.String getRegFrom() {
		return regFrom;
	}

	public void setRegFrom(java.lang.String regFrom) {
		this.regFrom = regFrom;
	}

	public Long getRegTime() {
		return regTime;
	}

	public void setRegTime(Long regTime) {
		this.regTime = regTime;
	}

	public java.lang.String getIsBandCard() {
		return isBandCard;
	}

	public void setIsBandCard(java.lang.String isBandCard) {
		this.isBandCard = isBandCard;
	}

	public java.lang.String getMemCardNo() {
		return memCardNo;
	}

	public void setMemCardNo(java.lang.String memCardNo) {
		this.memCardNo = memCardNo;
	}

	public java.lang.String getCardIsSend() {
		return cardIsSend;
	}

	public void setCardIsSend(java.lang.String cardIsSend) {
		this.cardIsSend = cardIsSend;
	}

	public java.util.Date getCardSendTime() {
		return cardSendTime;
	}

	public void setCardSendTime(java.util.Date cardSendTime) {
		this.cardSendTime = cardSendTime;
	}

	public java.util.Date getCardApplyTime() {
		return cardApplyTime;
	}

	public void setCardApplyTime(java.util.Date cardApplyTime) {
		this.cardApplyTime = cardApplyTime;
	}

	public java.lang.String getLabel() {
		return label;
	}

	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public java.lang.String getRegisterStampTime() {
		return registerStampTime;
	}

	public void setRegisterStampTime(java.lang.String registerStampTime) {
		this.registerStampTime = registerStampTime;
	}

	public java.lang.String getChengPasswordStampTime() {
		return chengPasswordStampTime;
	}

	public void setChengPasswordStampTime(java.lang.String chengPasswordStampTime) {
		this.chengPasswordStampTime = chengPasswordStampTime;
	}

	public java.lang.String getSuccessPasswordStampTime() {
		return successPasswordStampTime;
	}

	public void setSuccessPasswordStampTime(
			java.lang.String successPasswordStampTime) {
		this.successPasswordStampTime = successPasswordStampTime;
	}

	public java.lang.String getAccountsMailStampTime() {
		return accountsMailStampTime;
	}

	public void setAccountsMailStampTime(java.lang.String accountsMailStampTime) {
		this.accountsMailStampTime = accountsMailStampTime;
	}

	public Long getEveryTimeLoginDate() {
		return everyTimeLoginDate;
	}

	public void setEveryTimeLoginDate(Long everyTimeLoginDate) {
		this.everyTimeLoginDate = everyTimeLoginDate;
	}

	public java.lang.String getRegisterComeType() {
		return registerComeType;
	}

	public void setRegisterComeType(java.lang.String registerComeType) {
		this.registerComeType = registerComeType;
	}

	public java.lang.String getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(java.lang.String isLogin) {
		this.isLogin = isLogin;
	}

	public java.lang.String getVirtualAccountName() {
		return virtualAccountName;
	}

	public void setVirtualAccountName(java.lang.String virtualAccountName) {
		this.virtualAccountName = virtualAccountName;
	}

	public List<MemberGroupRel> getMemGroupRels() {
		return memGroupRels;
	}

	public void setMemGroupRels(List<MemberGroupRel> memGroupRels) {
		this.memGroupRels = memGroupRels;
	}
	
	
}
