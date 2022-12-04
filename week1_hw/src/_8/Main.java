package _8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// JAVA'DA COLLECTION FRAMEWORK'Ü
		
		/*
		 * Collection framework'ü object öğelerini depolamayı ve işlemeyi sağlayan bir mimaridir.
		 * Java'da bir collection, nesnelerden oluşan bir topluluğu bir arada tutan yapıdır.
		 * Collection Framework ise interface'ler ve onların implementasyonlarından oluşur.
		 * 
		 * Avantajları:
		 * Yazılımın tekrar kullanılmasını sağlayan arayüzleri ve veriler üzerinde işlem yapmaya yarayan algoritmalar içerir.
		 * İçerdiği veri yapıları onlara uygulanan algoritmalar, programcının işini kolaylaştırır.
		 * Veri ekleyip çıkardıkça, koleksiyonların uzunluğu (büyüklüğü) kendi kendine değişir; programcının o değişimi ayarlaması gerekmez. 
		 * 
		 * Dezavantajları:
		 * Derleme anında veri tipi denetimi yapamaz. 
		 * Veri tipini doğru seçmek gerekir
		 */
		
		
		// LIST INTERFACE
		// -> Kendisine verilen elemanları sıralı şekilde tutar. Tekrarlanan elemanları barındırabilir.
		// List interface'ini implement eden class'lar: ArrayList, LinkedList, Vector, ve Stack şeklindedir.
		
		// QUEUE INTERFACE
		// -> Bu interface FIFO yani "First In First Out" prensibine göre çalışır.
		// Queue interface'ini implement eden class'lar: PriorityQueue, Deque, ve ArrayDeque şeklindedir.
		
		// SET INTERFACE
		// Bu interface bir küme görevi görür. Duplike verileri saklamamıza izin vermez.
		// Set interface'ini implement eden class'lar: HashSet, LinkedHashSet, ve TreeSet şeklindedir.
		
		// Şimdi de bu framework'ün önemli metodlarına bakalım:
		
		/* add */
		ArrayList<String> list= new  ArrayList<String>(); // arraylist oluşturulur
		list.add("Seyma"); // listeye eleman ekleme;
		list.add("Canbaz");
		
		
		/* size */
		System.out.println(list.size()); // listenin boyutunu verir.
		
		
		/* contains */
		System.out.println(list.contains("Seyma")); // liste içinde eleman araması yapar. Boolean değer döndürür.
		
		
		/* equals */
		ArrayList<String> list2= new  ArrayList<String>();
		list2.add("Semanur");
		list2.add("Talha Burak");
		
		System.out.println(list.equals(list2)); // Kendisine verilen nesne ile karşılaştırma yapar
		// Yalnızca kendisine verilen de bir listeyse, boyutları ve elemanları aynıysa true döner.
		
		
		/* get */
		System.out.println(list.get(0)); // Indexteki elemanı döner
		
		
		/* set */
		list.set(0, "Sultan"); // Indexteki elemanı verilen ile değiştirir.
		list.set(1, "Seyma");
		
		
		/* indexOf - lastIndexOf */
		list.add("Canbaz");
		list.add("Seyma");
		System.out.println(list.indexOf("Seyma")); // Objeyi listede soldan sağa doğru tarayarak bulunduğu ilk indexi verir.
		System.out.println(list.lastIndexOf("Seyma")); // Objeyi listede sağdan sola doğru tarayarak bulunduğu ilk indexi verir.
		
		
		/* remove */
		list.remove(3); // Verilen indexteki elemanı siler.
		
		
		/* subList */
		List<String> subList = new ArrayList<String>(); // List'ten implement alındığı için bu şekilde de tanımlanabilir.
		subList = list.subList(0, 2); // index 0'dan 2'ye kadar olan elemanları yeni listeye atar. (0 dahil 2 hariç);
		
		
		/* sort */
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(2);
		intList.add(7);
		System.out.println(intList);
		Collections.sort(intList); // Verilen listeyi sıralar.
		System.out.println(intList);
		
		
		/* toArray */
		String namesArray[] = new String[list.size()]; // Array oluştururken boyut belirlememiz gerektiği için listemizin size'ını aldık.
		namesArray = list.toArray(namesArray); // Verilen listeyi array'a çevirir. 
		System.out.println(Arrays.toString(namesArray));
		
		
		/* clear */
		list.clear(); // listenin içini tamamen temizler
					
	}

}
