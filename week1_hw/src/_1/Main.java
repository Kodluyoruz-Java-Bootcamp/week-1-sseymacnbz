package _1;

public class Main {
	
	public static String reverse(String s) {
		
		String s_new= "";
		
		for (int i=s.length()-1; i>=0; i--) {
			s_new += s.charAt(i);
		}
		
		return s_new;
	}

	public static void main(String[] args) {
		
		String chain; // it will hold every palindrome chain
		String longest_chain=""; // it will hold longest chain
		int step; // it will hold every palindrome steps
		int biggest_step=0; // with this we will decide what step is the biggest and so we can find the longest chain
		String snum; // it will hold string versions of numbers
		long sum;
		
		for (int i=10; i<100; i++) {
			step = 0;
			sum = i;
			chain="";
			
			while(true) {
				snum = Long.toString(sum);
				
				if(snum.equals(reverse(snum))) {
					
					if(biggest_step<step) {
						longest_chain = String.valueOf(chain);
						longest_chain = longest_chain.substring(1);
					}
					
					System.out.println(i+" step size..:"+step+"     sum..:"+sum);
					System.out.println();
					break;
				}
				else {
					chain += "+"+Long.toString(sum)+"+"+reverse(Long.toString(sum));
					sum = sum + Long.parseLong(reverse(Long.toString(sum)));
					
				}
				
				step++;
			}
		}
		
		System.out.println("The longest chain is "+longest_chain);

	}

}
