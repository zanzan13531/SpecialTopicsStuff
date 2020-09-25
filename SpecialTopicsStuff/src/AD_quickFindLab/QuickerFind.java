package AD_quickFindLab;

public class QuickerFind implements UnionFind {
	
	private int[] thingy;
	private int sizey;

	public QuickerFind(int n) {
		
		thingy = new int[n];
		sizey = n;
		
		for (int i = 0; i < sizey; i++) {
			thingy[i] = i;
		}
		
	}
	
	public void Union(int a, int b) {
		
		thingy[Find(a)] = Find(b);
		
	}
	
	public int Find(int a) {
		
		if (thingy[a] == a) {
			
			return (a);
		
		} else {
			
			return (Find(thingy[a]));
			
		}
		
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < sizey; i++) {
			s += thingy[i];
		}
		
		return (s);
	}
	
}
