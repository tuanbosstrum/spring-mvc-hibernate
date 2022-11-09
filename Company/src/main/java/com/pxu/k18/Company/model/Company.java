package com.pxu.k18.Company.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "masp")
	private String masp;
	
	@Column(name = "nhomsp")
	private String nhomsp;
	
	@Column(name = "tensp")
	private String tensp;
	
	@Column(name = "gia")
	private int gia;
	
	@Column(name = "mota")
	private String mota;
	
	@Column(name = "ngaytao")
	private String ngaytao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	  private Set<Employee> listEmployee = new HashSet<>();

	public Company() {  
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMasp() {
		return masp;
	}



	public void setMasp(String masp) {
		this.masp = masp;
	}



	public String getNhomsp() {
		return nhomsp;
	}



	public void setNhomsp(String nhomsp) {
		this.nhomsp = nhomsp;
	}



	public String getTensp() {
		return tensp;
	}



	public void setTensp(String tensp) {
		this.tensp = tensp;
	}



	public int getGia() {
		return gia;
	}



	public void setGia(int gia) {
		this.gia = gia;
	}



	public String getMota() {
		return mota;
	}



	public void setMota(String mota) {
		this.mota = mota;
	}



	public String getNgaytao() {
		return ngaytao;
	}



	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}



	@Override
	public String toString() {
		return "Company [id=" + id + ", masp=" + masp + ", nhomsp=" + nhomsp + ", tensp=" + tensp + ", gia=" + gia
				+ ", mota=" + mota + ", ngaytao=" + ngaytao + "]";
	}


	
	
	
}
