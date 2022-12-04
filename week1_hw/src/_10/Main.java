package _10;
// DİKKAT! AŞAĞISI TAM BİR SPAGETTİ KOD OLMUŞTUR. ŞİMDİDEN ÖZÜRLERİMİ İLETİRİM
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		// SİSTEMDEKİ BÜTÜN MÜŞTERİ SAYISI
		CustomerDB customerDB = new CustomerDB();
		System.out.println("Sistemdeki müşteri sayısı..: "+customerDB.numberOfCustomers());
		System.out.println();
		
		System.out.println("--------------------");
		//İSMİ CEM OLAN MÜŞTERİLERİN ALDIKLARI ÜRÜN SAYISINI
		//Bunu için önce cem isimli müşterilerin id'leri ile onlara sipariş oluşturalım
		
		ArrayList<Customer> customersNamedCem = new ArrayList<>();
		customersNamedCem = customerDB.getbyName("ceM"); //ismi cem olanlar alındı
		System.out.println("Cem isimli müşteri sayısı..: "+customersNamedCem.size()); // 2
		System.out.println();
		
		// 2 adet product listesi oluşturuldu
		ArrayList<Product> products1 = new ArrayList<Product>(); 
		products1.add(new Product(3,"TV",4000,"Samsung",5)); // Ürünler listeye eklendi. product_id, kategori, fiyat, ürün adı, stok
		products1.add(new Product(5, "COMPUTER", 7500, "Asus", 9));
		
		ArrayList<Product> products2 = new ArrayList<Product>(); 
		products2.add(new Product(3,"MOUSE",500,"Logitech",5)); 
		
		//Bu product listelerine ait faturalar oluşturuldu
		Invoice invoice1 = new Invoice(1, products1);
		Invoice invoice2 = new Invoice(2, products2);
		
		// Müşterilerimiz için oluşturulan ürün listesi, ürün listesine ait fatura ile beraber siparişler oluşturuldu.
		Order order1 = new Order(1, customersNamedCem.get(0), products1, invoice1);
		Order order2 = new Order(2, customersNamedCem.get(1), products2, invoice2);
		 
		// Siparişler kaydedildi
		OrderDB orderDB = new OrderDB();
		orderDB.add(order1);
		orderDB.add(order2);
		
		// cem isimli müşterilerimizin listesi yardımıyla bu müşterilerimize ait ürünler bastırıldı 
		for(Customer customer : customersNamedCem) {
			orderDB.getProductsbyCustomerId(customer);
		}
		System.out.println("--------------------");
		
		// ISMI CEM OLUP YAŞI 30'DAN KÜÇÜK 25'TEN BÜYÜK MÜŞTERİLERİN TOPLAM ALIŞVERİŞ TUTARI
		
		// Cem isimli müşteriler kullanılarak bunlara ait order nesneleri üzerinden koşul ifadesi için gerekli kodlar yazıldı
		for(Customer customer : customersNamedCem) {
			
			if(orderDB.getOrderbyCustomer(customer).getCustomer().getAge() < 30 && orderDB.getOrderbyCustomer(customer).getCustomer().getAge() >25) {
				System.out.print(orderDB.getOrderbyCustomer(customer).getCustomer().getName()+" isimli ve "+orderDB.getOrderbyCustomer(customer).getCustomer().getAge()+" yasinda olan musterinin fatura tutarı..:");
				System.out.println(orderDB.getOrderbyCustomer(customer).getInvoice().calculateInvoice(orderDB.getOrderbyCustomer(customer).getProductList())); 
			}
			
		}
		
		System.out.println("--------------------");
		
		// SİSTEMDEKİ 1500TL ÜZERİNDEKİ FATURALARI LİSTELEYİN
		// Siparişler üzerinde gezilerek 1500 TL'den fazla faturaya sahip ürünler listelendi
		for(Order order : orderDB.orderDb) {
			if(order.getInvoice().calculateInvoice(order.getProductList()) > 1500) {
				System.out.println("Musteri id..: "+order.getCustomer().getCustomer_id());
				System.out.println("Musteri faturasi..:"+order.getInvoice().calculateInvoice(order.getProductList()));
			}
		}
	}

}
