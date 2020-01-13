package com.crt.activity.bean;

public class Employee 
{
		private int id;
		private String name;
		private String addr;
		private double phone;


		public Employee(int id, String name, String addr, double phone) {
			super();
			this.id = id;
			this.name = name;
			this.addr = addr;
			this.phone = phone;
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

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public double getPhone() {
			return phone;
		}

		public void setPhone(double phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {

			return id + ":" + name;
		}
}
