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

  public static void main(String[] args) {
    
  }
}
