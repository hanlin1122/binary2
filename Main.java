import java.util.*;

class Main {
  public static int intBinary8Bit(int a){
    int pow = 1;
    int t = 0;
    int count2 = 0;
    while (a != 0) {
      count2++;
      if (count2 == 8) {
        t += (a % 10) * pow * -1;
        a = a / 10;
        break;
      }
      t += (a % 10)*pow;
      pow *= 2;
      a = a / 10;
    }

    return t;
  }
  public static int intBinaryNBit(int a, int n) {
    int pow = 1;
    int t = 0;
    int count2 = 0;
    while (a != 0) {
      count2++;
      if (count2 == n) {
        t += (a % 10) * pow * -1;
        a = a / 10;
        break;
      }
      t += (a % 10)*pow;
      pow *= 2;
      a = a / 10;
    }

    return t;
    
  }
  public static double doubleBinary8Bit(int a){
    return intBinaryNBit(a%10000, 4) * Math.pow(2, intBinaryNBit(a/10000, 4)); 
  }
  public static double doubleBinaryNBit(int a, int e, int m) {
    int divisor = 1;
    int n = m;
    while (m > 0){
      m = m - 1;
      divisor = divisor * 10;
    }
    int upper = a / divisor;
    int lower = a % divisor;
    int exponent = intBinaryNBit(upper, e);
    int base = intBinaryNBit(lower, n);
    return base * Math.pow(2, exponent);
  }
   public static void gradeLab4(){
       int score=0;
       int number=1;
       try{
           number = 1;
           boolean b = intBinary8Bit(1001) == 9;
           if(b)
               score++;
           System.out.println(number + ". intBinary8Bit():\t\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 2;
           boolean b = intBinary8Bit(10011100) == -100;
           if(b)
               score++;
           System.out.println(number + ". intBinary8Bit() negative:\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 3;
           boolean b = intBinaryNBit(1100, 5) == 12;
           if(b)
               score++;
           System.out.println(number + ". intBinaryNBit():\t\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 4;
           boolean b = intBinaryNBit(1000001100, 11) == 524;
           if(b)
               score++;
           System.out.println(number + ". intBinaryNBit() big:\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 5;
           boolean b = intBinaryNBit(1000001100, 11) == 524;
           if(b)
               score++;
           System.out.println(number + ". intBinaryNBit() big:\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 6;
           boolean b = intBinaryNBit(11100, 5) == -4;
           if(b)
               score++;
           System.out.println(number + ". intBinaryNBit() neg:\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 7;
           boolean b = Math.abs(doubleBinary8Bit(11) - 3) < .0001;
           if(b)
               score++;
           System.out.println(number + ". doubleBinary8Bit() mantissa:\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 8;
           boolean b = Math.abs(doubleBinary8Bit(110010) - 16) < .0001;
           if(b)
               score++;
           System.out.println(number + ". doubleBinary8Bit() exp:\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 9;
           boolean b = Math.abs(doubleBinary8Bit(1100110) - 384) < .0001;
           if(b)
               score++;
           System.out.println(number + ". doubleBinary8Bit() full:\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }
       try{
           number = 10;
           boolean b = Math.abs(doubleBinaryNBit(11001100, 3, 5) - 3) < .0001;
           if(b)
               score++;
           System.out.println(number + ". doubleBinaryNBit():\t\t\t\t\t" + b);
       }
       catch(Exception e1){
           System.out.println("\n\n" + number + ". Your code crashed.");
       }

       System.out.println("\nTotal: " + score + " / 10\n");
   }

  public static void main(String[] args) {
    gradeLab4();
  }
}
