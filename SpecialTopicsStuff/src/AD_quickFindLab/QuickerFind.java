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
		
		thingy[b] = a;
		
	}
	
	public int Find(int a) {
		
		if (thingy[a] == a) {
			
			return (a);
		
		} else {
			
			return (Find(thingy[a]));
			
		}
		
	}
	
}
