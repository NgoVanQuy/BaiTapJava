package demo;
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Scanner;
public class Khachhang {
	String makh;
	String tenkh;
	int sl;
	

	public String getmakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String gettenkh() {
		return tenkh;
	}
	public void settenkh(String tenkh) {
		this.tenkh = tenkh;
	}
	public int getsl() {
		return sl;
	}
	public void setsl(int sl) {
		this.sl = sl;
	}
	
	public Khachhang() {
		
	}
	public Khachhang(String makh,String tenkh,int sl) {
		this.makh=makh;
		this.tenkh=tenkh;
		this.sl=sl;
	
	}
	
	public static void main(String args[])
	{
		  new quanlykhachhang();
	}		
}
		
