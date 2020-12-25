package com.cybertek.dto;

import java.sql.Date;

public class StudentDto {

	 private String name;
	    private String email;
	    private String gender;
	    private String studentNo;
	    private Date birthday;
	    private String level;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getStudentNo() {
			return studentNo;
		}
		public void setStudentNo(String studentNo) {
			this.studentNo = studentNo;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getLevel() {
			return level;
		}
		public void setLevel(String level) {
			this.level = level;
		}
		@Override
		public String toString() {
			return "StudentDto [name=" + name + ", email=" + email + ", gender=" + gender + ", studentNo=" + studentNo
					+ ", birthday=" + birthday + ", level=" + level + "]";
		}
	
	
	    
}
