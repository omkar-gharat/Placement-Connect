import java.util.Scanner;
public class Main
{
    public static void freqCount(String num) {
        while(num.length()>0){
            char n=num.charAt(0);
            System.out.println("Frequncy of "+n+"is "+Occurence(num,n));
            num=num.replace(""+n,"");
            
        }
    }
    public static int Occurence(String num,char n) {
        int count=0;
        for (int i=0;i<num.length();i++) {
            if(num.charAt(i)==n){
                count++;
            }
        }
        return count;
    }
    
    
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    String number=sc.nextLine();
	    Main m=new Main();
	    m.freqCount(number);
	}
}
