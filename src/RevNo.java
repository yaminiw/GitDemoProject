
public class RevNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int No=126;
		int RevNo=0;
		int origin=No;
		while(No!=0) {
			int Rem=No%10;
			RevNo=RevNo*10+Rem;
			No=No/10;
		}
		
     System.out.println(RevNo);
     if(RevNo==origin) {
    	 System.out.println("No is Palindrome");
     }
    	 else
    	 {
    		 System.out.println("No is not Palindrome");
     }
	}

}
