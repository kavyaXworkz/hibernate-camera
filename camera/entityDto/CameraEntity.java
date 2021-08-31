package com.xworkz.camera.entityDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="camera")

	public class CameraEntity {
	@Column(name="id")
	@Id
		private int id;
	@Column(name="name")
		private String name;
	@Column(name="brand")
		private String brand;
	@Column(name="warrantyYear")
		private int warrantyYear;
	@Column(name="shopName")
		private String shopName;
		public CameraEntity(int id, String name, String brand, int warrantyYear, String shopName) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.warrantyYear = warrantyYear;
			this.shopName = shopName;
		}
		public CameraEntity() {
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
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getWarrantyYear() {
			return warrantyYear;
		}
		public void setWarrantyYear(int warrantyYear) {
			this.warrantyYear = warrantyYear;
		}
		public int getShopName() {
			return shopName;
		}
		public void setShopName(int shopName) {
			this.shopName = shopName;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CameraEntity other = (CameraEntity) obj;
			if (id != other.id)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "CameraEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", warrantyYear=" + warrantyYear
					+ ", shopName=" + shopName + "]";
		}
	}
