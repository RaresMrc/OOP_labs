// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Vector;
class GoldbachCheck {
    int start;
    int end;

    GoldbachCheck(int start, int end) {
        this.start = start;
        this.end = end;
    }

    boolean checkInterval() {
        if (this.end - this.start <= 1) return false;
        for (int i = this.start + 1; i < this.end; i++) {
            if (i % 2 != 0) continue;
            int check = 0;
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < i; k++) {
                    if (this.isPrime(j) && this.isPrime(k) && ((j + k) == i)) check = 1;
                }
            }
            if (check == 0) return false;
        }
        return true;
    }

    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

class PersonInfo {
    PersonInfo(char height, char age, char sex) {
        this.height = height;
        this.age = age;
        this.sex = sex;
    }
    private char height;
    private char age;
    private char sex;
    private short wrappedInfo;

    public short wrapInfo() {
        this.wrappedInfo = 0xff;
        this.wrappedInfo = (short) (this.wrappedInfo & height);
        short tempValue = (short) age;
        tempValue <<= 8;
        this.wrappedInfo = (short) (this.wrappedInfo ^ tempValue);
        tempValue = (short) sex;
        tempValue <<= 15;
        this.wrappedInfo = (short) (this.wrappedInfo ^ tempValue);
        System.out.printf("%x\n", this.wrappedInfo);
        return this.wrappedInfo;
    }

    public void unwrapInfo(short wrappedInfo) {
        this.height = (char) (wrappedInfo & 0xff);
        wrappedInfo = (short) (wrappedInfo >> 8);
        wrappedInfo = (short) (wrappedInfo & 0x00ff);
        this.age = (char) (wrappedInfo & 0xff);
        this.age = (char) (this.age & 0x7f);
        wrappedInfo >>= 7;

        this.sex = (char) (wrappedInfo & 0x1);
        System.out.println((int) this.height);
        System.out.println((int) this.age);
        System.out.println((int) this.sex);
    }

}

public class Main {
    public static void main(String[] args) {
//    String firstString = "Something ";
//    String secondString = "else ";
//    String thirdString = "is here.";
//    System.out.println(firstString + secondString + thirdString);
//    System.out.println(firstString.equals("Something "));

//        int x,y;
//        x = 5;
//        y = 3;
//        x = x - y;
//        y = y + x;
//        x = x - y;
//        x *= -1;
//        System.out.println(x);
//        System.out.println(y);

//        int start = 3;
//        int end = 3;
//        GoldbachCheck check = new GoldbachCheck(start, end);
//        System.out.println(check.checkInterval());
//
        char height, age, sex;
        height = 16;
        age = 18;
        sex = 1;
        PersonInfo personInfo = new PersonInfo(height, age, sex);
        short wrappedInfo = personInfo.wrapInfo();
        personInfo.unwrapInfo(wrappedInfo);
    }


}