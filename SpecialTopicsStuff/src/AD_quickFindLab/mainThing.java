package AD_quickFindLab;

public class mainThing {
	
	public static void main(String[] args) {
		
		QuickFind bob = new QuickFind(10);
		QuickerFind joe = new QuickerFind(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joe.Find(i));
		}
		
		bob.Union(1, 2);
		bob.Union(4, 5);
		bob.Union(4, 2);
		bob.Union(7, 9);
		bob.Union(8, 6);
		bob.Union(8, 9);
		bob.Union(1, 0);
		joe.Union(1, 2);
		joe.Union(4, 5);
		joe.Union(4, 2);
		joe.Union(7, 9);
		joe.Union(8, 6);
		joe.Union(8, 9);
		joe.Union(1, 0);
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joe.Find(i));
		}
		
	}
	
}
