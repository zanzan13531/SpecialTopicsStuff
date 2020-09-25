package AD_quickFindLab;

public class mainThing {
	
	public static void main(String[] args) {
		
		QuickFind bob = new QuickFind(10);
		QuickerFind joe = new QuickerFind(10);
		QuickerFind joes = new QuickerFind(10);
		WeightedQuickFind bobs = new WeightedQuickFind(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joe.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joes.Find(i));
		}
		System.out.println();
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
		joe.Union(1, 2);
		joe.Union(4, 5);
		joe.Union(4, 2);
		joe.Union(7, 9);
		joe.Union(8, 6);
		joe.Union(8, 9);
		joe.Union(1, 0);
		
		joes.Union(0, 1);
		joes.Union(1, 2);
		joes.Union(2, 3);
		joes.Union(3, 4);
		joes.Union(4, 5);
		joes.Union(5, 6);
		joes.Union(6, 7);
		joes.Union(7, 8);
		joes.Union(8, 9);
		
		bobs.Union(0, 1);
		bobs.Union(1, 2);
		bobs.Union(2, 3);
		bobs.Union(3, 4);
		bobs.Union(4, 5);
		bobs.Union(5, 6);
		bobs.Union(6, 7);
		bobs.Union(7, 8);
		bobs.Union(8, 9);
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(bob.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joe.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(joes.Find(i));
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(bobs.Find(i));
		}
		
		System.out.println();
		
		System.out.println(joes.toString());
		
		System.out.println(bobs.toString());
		
	}
	
}
