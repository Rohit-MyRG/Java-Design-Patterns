import java.util.Scanner;

import mypack.OperatingSystemFactory;
import mypack.OS;

public class Main{
    public static void main(String[] args) {

        OS obj = new OperatingSystemFactory().getInstance(new Scanner(System.in).next());
        obj.spec();
    }
}
