
public class CountNaturalNumber {
	
	public int CountNaturalNumber1(int number) {
		int count =0;
		for(int i=1; i<=number;i++) {
			if(number <= reverseTheNUmber(i)) {
				count++;
			}
		}
		String str="avinash";
		
		return count;
	}
	
	int reverseTheNUmber(int number) {
		int newNumber=0;
		int x =0;
		while(number > 0) {
	           x = number % 10;
	           newNumber = newNumber * 10 + x;
	           number = number / 10;
		}
		return newNumber;
	}

	int sum(int n)
	{    
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
	
	public static void main(String... args) {
		
		CountNaturalNumber countNaturalNumber =new CountNaturalNumber();
		System.out.println(countNaturalNumber.CountNaturalNumber1(21));
	}
}
