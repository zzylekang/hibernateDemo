package com.zzy.demo.hibernatejpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MB_MEMBER_GROUP_REL")
public class MemberGroupRel implements Serializable{

	private static final long serialVersionUID = 5620288083912782697L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, length = 22)
	private Long id;
	
	@Column(name = "MEMBER_ID", unique = false, nullable = true, insertable = false, updatable = false, length = 22)
	private Long memberId;
	
	@Column(name = "GROUP_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 16)
	private java.lang.String groupId;
	
	//----->固定字段开始
	@Column(name = "opt_counter")
	protected Integer optCounter = 0;
	
	@Column(name = "is_deleted")
	protected Boolean deleted = false;
	
	@Column(name = "created_by")
	protected String createdBy;
	
	@Column(name = "updated_by")
	protected String updatedBy;

	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateCreated;
	
	@Column(name = "date_updated")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateUpdated;

	//<------固定字段结束
	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="MEMBER_ID", referencedColumnName="MEMBER_ID")
	private Member member;

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

	public java.lang.String getGroupId() {
		return groupId;
	}

	public void setGroupId(java.lang.String groupId) {
		this.groupId = groupId;
	}

	public Integer getOptCounter() {
		return optCounter;
	}

	public void setOptCounter(Integer optCounter) {
		this.optCounter = optCounter;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
