package com.kodnest.mentorDetails.hibernate;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Mentor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String gender;
	@Column
	String subject;
	@Column
	String phoneNo;
	@Column
	String emailId;
	@Column
	int experience;
	@Column
	String qualification;
	@Column
	int noOfBatches;
	@Column
	String address;
	@Column
	String maritalStatus;
	@Column
	int salary;
	
	public Mentor() {
		
	}

	public Mentor(String name, String gender, String subject, String phoneNo, String emailId, int experience,
			String qualfication, int noOfBatches, String address, String maritalStatus, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.subject = subject;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.experience = experience;
		this.qualification = qualfication;
		this.noOfBatches = noOfBatches;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getQualfication() {
		return qualification;
	}

	public void setQualfication(String qualfication) {
		this.qualification = qualfication;
	}

	public int getNoOfBatches() {
		return noOfBatches;
	}

	public void setNoOfBatches(int noOfBatches) {
		this.noOfBatches = noOfBatches;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", gender=" + gender + ", subject=" + subject + ", phoneNo="
				+ phoneNo + ", emailId=" + emailId + ", experience=" + experience + ", qualfication=" + qualification
				+ ", noOfBatches=" + noOfBatches + ", address=" + address + ", maritalStatus=" + maritalStatus
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, emailId, experience, gender, id, maritalStatus, name, noOfBatches, phoneNo,
				qualification, salary, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentor other = (Mentor) obj;
		return Objects.equals(address, other.address) && Objects.equals(emailId, other.emailId)
				&& experience == other.experience && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(maritalStatus, other.maritalStatus) && Objects.equals(name, other.name)
				&& noOfBatches == other.noOfBatches && Objects.equals(phoneNo, other.phoneNo)
				&& Objects.equals(qualification, other.qualification) && salary == other.salary
				&& Objects.equals(subject, other.subject);
	}
	
	
}
