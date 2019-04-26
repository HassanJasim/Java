package cas.XB3.lab4.wt;

public class PotentialGene {
	
	public static boolean isPotentialGene(String dna) {
		if (((dna.length() % 3 == 0) && dna.startsWith("ATG")) && dna.endsWith("TAA") || (dna.endsWith("TAG") || dna.endsWith("TGA"))){
			for (int i = 3; i < dna.length() - 6; i++) {
				if ((dna.charAt(i)=='T' && dna.charAt(i+1)=='A' && dna.charAt(i+2)=='A') || (dna.charAt(i)=='T' && dna.charAt(i+1)=='A' && dna.charAt(i+2)=='G') || (dna.charAt(i)=='T' && dna.charAt(i+1)=='G' && dna.charAt(i+2)=='A')) {
					return false;
				}
				
				
				
			}
			return true;
		
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String dna = args[0];
		System.out.println(isPotentialGene(dna));
	}

}
