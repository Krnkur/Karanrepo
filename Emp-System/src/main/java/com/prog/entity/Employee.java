package com.prog.entity;

public class Employee {

		private int id ;
		private String name;
		private String address;
		private String email;
		private String mobile;
		private String salary;
		
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mobile="
					+ mobile + ", salary=" + salary + "]";
		}
	
		
		
		
}
