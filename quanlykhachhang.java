package demo;
import java.text.SimpleDateFormat; 
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class quanlykhachhang {	
	Vector list = new Vector();
	public quanlykhachhang() {
		while(true) {
			System.out.println("Quan ly Khach Hang");
			System.out.println("1. Nhap khach hang");
			System.out.println("2. Xem khach hang");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong khach hang :");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma khach hang=");
			String makh=key.nextLine();
			System.out.println("Nhap ten khach hang");
			String tenkh=key.nextLine();
			System.out.println("Nhap so luong san pham ao khoac khach da mua");
			int sl=Integer.parseInt(key.nextLine());
            Khachhang obj = new Khachhang(makh,tenkh,sl);
			list.add(obj);
		}	
		
	}
	public void InTT() {
		Enumeration kh1 = list.elements();
		int i=1;
		while(kh1.hasMoreElements()) {
			Khachhang kh = (Khachhang)kh1 .nextElement();
			System.out.println("Ma Khach Hang :"+kh.getmakh()+" , Ten Khach Hang: "+kh.gettenkh()+" , So luong ao khoac da mua:"+kh.getsl());
			i++;
		}
	}
}