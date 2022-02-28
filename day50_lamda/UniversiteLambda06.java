package day50_lamda;

public class UniversiteLambda06 {
private String fakulte;
private String bolum;
private int notOrtalama;
private int ögrenciNo;
public UniversiteLambda06(String fakulte, String bolum, int notOrtalama, int ögrenciNo) {
	super();
	this.fakulte = fakulte;
	this.bolum = bolum;
	this.notOrtalama = notOrtalama;
	this.ögrenciNo = ögrenciNo;
}
@Override
public String toString() {
	return "UniversiteLambda06 [fakulte=" + fakulte + ", bolum=" + bolum + ", notOrtalama=" + notOrtalama
			+ ", ögrenciNo=" + ögrenciNo + "]";
}
public String getFakulte() {
	return fakulte;
}
public String getBolum() {
	return bolum;
}
public int getNotOrtalama() {
	return notOrtalama;
}
public int getÖgrenciNo() {
	return ögrenciNo;
}
public void setFakulte(String fakulte) {
	this.fakulte = fakulte;
}
public void setBolum(String bolum) {
	this.bolum = bolum;
}
public void setNotOrtalama(int notOrtalama) {
	this.notOrtalama = notOrtalama;
}
public void setÖgrenciNo(int ögrenciNo) {
	this.ögrenciNo = ögrenciNo;
}
}
