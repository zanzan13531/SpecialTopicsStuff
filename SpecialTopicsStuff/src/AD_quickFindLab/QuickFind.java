package AD_quickFindLab;

public class QuickFind implements UnionFind {
	
	private int[] thingy;
	private int sizey;

	public QuickFind(int n) {
		
		thingy = new int[n];
		sizey = n;
		for (int i = 0; i < sizey; i++) {
			thingy[i] = i;
		}
		
	}
	
	public void Union(int a, int b) {
		
		int newVal = thingy[a];
		int oldVal = thingy[b];
		
		for (int i = 0; i < sizey; i++) {
			
			if (thingy[i] == oldVal) {
				
				thingy[i] = newVal;
				
			}
			
		}
		
	}
	
	public int Find(int a) {
		
		return thingy[a];
		
	}
	
}
