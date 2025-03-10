import java.util.Scanner;
public class bai1{
private int maSo;
private String hoTen;
private float diemTrungBinhh;
//get,set
 public int getmaSo(){
	return maSo;
 }	
 public void setmaSo(){
	this.maSo=maSo;
 }
 public String gethoTen(){
	return hoTen;
 }	
 public void sethoTen(){
	this.hoTen=hoTen;
 }
 public float getdiemTrungBinh(){
	return diemTrungBinhh;
 }	
 public void setdiemTrungBinh(){
	this.diemTrungBinhh=diemTrungBinh;
 }
//constructor khong co tham soso
 public bai1(){
	this.maSo=0;
	this.hoTen=null;
	this.diemTrungBinh=0f;
 }
 // constructor co tham soso
 public bai1(int maSo, String hoTen){
	this.maSo=maSo;
	this.hoTen=hoTen;
 }
 //constructoror co day du tham so
  public bai1(int maSo, String hoTen, float diemTrungBinh){
	this.maSo=maSo;
	this.hoTen=hoTen;
	this.diemTrungBinh=diemTrungBinh;
 
 }
//phuong thuc nhap thong tin
public void nhapThongtin(){
	Scanner nhap=new Scanner(System.in);
	System.out.println("Nhập vào mã số:");
	maSo=nhap.nextInt();
	System.out.println( "Nhập vào họ tên");
	hoTen=nhap.nextString();
	System.out.println("Nhập vào điểm trung bình");
	diemTrungBinh=nhap.nextFloat();
}
//phuong thuc xuat thong tin
public void xuatThongTin(){
	System.out.println( "Mã số:"+ maSo +", Họ tên :"+ hoTen+", Diểm Trung Bình:"+diemTrungBinh);
}
}