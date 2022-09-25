package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<SinhVien> dsSinhVien;
	private String luaChon;
	private String tenFile;

	public QLSVModel() {
		this.dsSinhVien = new ArrayList<SinhVien>();
		this.luaChon = "";
		this.tenFile="";
	}

	public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}

	public ArrayList<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	public void insert(SinhVien SinhVien) {
		this.dsSinhVien.add(SinhVien);
	}
	
	public void delete(SinhVien SinhVien) {
		this.dsSinhVien.remove(SinhVien);
	}
	
	public void update(SinhVien SinhVien) {
		this.dsSinhVien.remove(SinhVien);
		this.dsSinhVien.add(SinhVien);
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public boolean kiemTraTonTai(SinhVien ts) {
		for(SinhVien SinhVien: dsSinhVien) {
			if(SinhVien.getMaSinhVien() == ts.getMaSinhVien())
				return true;
		}
		return false;
	}
	
	
}