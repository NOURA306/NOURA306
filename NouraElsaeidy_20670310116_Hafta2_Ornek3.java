package week2;

public class NouraElsaeidy_20670310116_Hafta2_Ornek3 {

	public static void main(String[] args) {
		Ogrenci[]array=new Ogrenci[2];
		array[0]=new Ogrenci();
		array[0].ogrenciNo=10;
		array[0].ogrenciAd="furkan";
		array[0].ogrenciSoyadi="Ayaz";
		System.out.println(array[0].ogrenciNo+" ,"+array[0].ogrenciAd+" ,"+array[0].ogrenciSoyadi);
		
		array[1]=new Ogrenci();
		array[1].ogrenciNo=11;
		array[1].ogrenciAd="ali";
		array[1].ogrenciSoyadi="veli";
		System.out.println(array[1].toString());
		System.out.println(array[1]);

	}

}
