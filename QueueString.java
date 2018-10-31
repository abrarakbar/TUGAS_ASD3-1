package TUGAS_ASD3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int abrar = -1;

	public void insert(String value) {
		ismail++;
		kelase.add(abrar,value);
	}
	public String get() {
		String value = "KOSONG";
		if(abrar>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			abrar--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+abrar+" > KELAS A: "+kelase.toString());
	}
}
