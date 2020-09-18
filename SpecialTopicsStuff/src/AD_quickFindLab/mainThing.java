package AD_quickFindLab;

public class mainThing {
	
	public static void main(String[] args) {
		
		QuickFind bob = new QuickFind(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		
		bob.Union(1, 2);
		bob.Union(4, 5);
		bob.Union(4, 2);
		bob.Union(7, 9);
		bob.Union(8, 6);
		bob.Union(8, 9);
		bob.Union(1, 0);
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		
	}
	
}
