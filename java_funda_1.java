1.fibonacci series

0,1,1,2,3,5,8,13,21





############################################
2.loops 

a^b power;

public class Main
{
	public static void main(String[] args) {
	  int a = 5;
	  int b =2;
	  int result=1;
	  
	   for (int i =1;i<=b;i++){
	       result*=a;  //1*5 / 5*5 
	       System.out.println(result);
	   }
	}
	
	#######################################
	Prime number with 
	// with count++
	public class Main
{

  public static void main (String[]args)
  {
    // prime numbers
    // the factors are more than 2 non prime
    // say 10 // 1,2, 5 ,10
    // say 13 // factors are 1 and 13
   static int n =13;
   static int count=0;
   //boolean isPrime= false;
    
    for (int i=2;i<13;i++)
    {
        if(n%i==0)
        count++;
    }
    if(count>2)
    System.out.println("Not prime");
    else
    System.out.println("prime");
    // check for 1 also
  }
}


###########################################
properties of prime number 
1. //if a number has more than 2 factors then its not prime
2.// 13 its factors are 1 and 13 // 
3. // 1 is not a prime number
4.// another property of prime number is 
5.//  say a Sqrt of 25 is 5 //
6. // sqrt of 35 is 6.08 so there exits a number from 1 to 6.08 which divides 35 
prime number with boolean;



public class Main
{

  public static void main (String[]args)
  {
    // prime numbers
    // the factors are more than 2 non prime
    // say 10 // 1,2, 5 ,10
    // say 13 // factors are 1 and 13
    // 1 is not a prime number 
    int n =1;
   //static int count=0;
   boolean isPrime= true ;
   // check for 1 also
   if (n<2)
   isPrime=false;
    
    for (int i=2;i<13;i++)
    {
        if(n%i==0)
        isPrime=false;
        break;
    }
    System.out.println("No is prime "+isPrime);

  }
}

######################################################
// serie Sum 

//1+1/2+1/3+1/4..........+1/n

class Main{
    public static void main (String[] args) {
        int n =9;
        float sum=0;
        
        for (float i =1;i<=n;i++){
            sum+=(1/i);    // 1//   
            
        }
        System.out.print(sum);
    }
}

########################################################

nested for loops  
// multiplication 1 to 20 "20" times

class Main{
    public static void main (String[] args) {
    
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                System.out.printf(String.format("%4d",i*j));
				// %4d reprsents number of spaces in left of a number
				// if a number is greater than the format no changes is reflected
				// if a number is smaller than the foarmat we can see the spaces.
            }
            System.out.println(" ");
        }
    }
       
    }
################  OUTPUT #######################################################
   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20 
   2   4   6   8  10  12  14  16  18  20  22  24  26  28  30  32  34  36  38  40 
   3   6   9  12  15  18  21  24  27  30  33  36  39  42  45  48  51  54  57  60 
   4   8  12  16  20  24  28  32  36  40  44  48  52  56  60  64  68  72  76  80 
   5  10  15  20  25  30  35  40  45  50  55  60  65  70  75  80  85  90  95 100 
   6  12  18  24  30  36  42  48  54  60  66  72  78  84  90  96 102 108 114 120 
   7  14  21  28  35  42  49  56  63  70  77  84  91  98 105 112 119 126 133 140 
   8  16  24  32  40  48  56  64  72  80  88  96 104 112 120 128 136 144 152 160 
   9  18  27  36  45  54  63  72  81  90  99 108 117 126 135 144 153 162 171 180 
  10  20  30  40  50  60  70  80  90 100 110 120 130 140 150 160 170 180 190 200 
  11  22  33  44  55  66  77  88  99 110 121 132 143 154 165 176 187 198 209 220 
  12  24  36  48  60  72  84  96 108 120 132 144 156 168 180 192 204 216 228 240 
  13  26  39  52  65  78  91 104 117 130 143 156 169 182 195 208 221 234 247 260 
  14  28  42  56  70  84  98 112 126 140 154 168 182 196 210 224 238 252 266 280 
  15  30  45  60  75  90 105 120 135 150 165 180 195 210 225 240 255 270 285 300 
  16  32  48  64  80  96 112 128 144 160 176 192 208 224 240 256 272 288 304 320 
  17  34  51  68  85 102 119 136 153 170 187 204 221 238 255 272 289 306 323 340 
  18  36  54  72  90 108 126 144 162 180 198 216 234 252 270 288 306 324 342 360 
  19  38  57  76  95 114 133 152 171 190 209 228 247 266 285 304 323 342 361 380 
  20  40  60  80 100 120 140 160 180 200 220 240 260 280 300 320 340 360 380 400 
  
  
#################################################################################














