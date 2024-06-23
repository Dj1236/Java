package programs.QAFOX;

import java.net.InetAddress;
import java.util.Scanner;

public class Ipaddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the website url:");
        String website = scanner.nextLine();

        try {
            InetAddress ip = InetAddress.getByName(website);
            System.out.println("the ip address of the given website is"+ip);
            
        } catch (Exception e) {
            System.out.println("nathi devo ja");
           
        }
    }
    
}
