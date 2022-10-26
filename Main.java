import java.util.*;

public class Main {
    public static class store {
        public String address, nameofbuyer, contactNumber;
        private int total;

        public String getaddress() {
            return address;
        }

        public String getcontactNumber() {
            return contactNumber;
        }

        public String getnameofbuyer() {
            return nameofbuyer;
        }

        public int gettotal() {
            return total;
        }

        public void Setaddress(String newaddress) {
            address = newaddress;
        }

        public void SetcontactNumber(String newcontactNumber) {
            contactNumber = newcontactNumber;
        }

        public void Setnameofbuyer(String newnameofbuyer) {
            nameofbuyer = newnameofbuyer;
        }
        public void Settotal(int newtotal) {
            total = newtotal;
        }

    }
    static class receipt extends store{
        public receipt(String a, String b, String c, int d) {
            Setnameofbuyer(a);
            Setaddress(b);
            SetcontactNumber(c);
            Settotal(d);
        }
        public void print() {
            System.out.print("\n\n"+"--Receipt--");
            System.out.print("\n"+"Buyer: "+getnameofbuyer());
            System.out.print("\n"+"contactNumber: "+getcontactNumber());
            System.out.print("\n"+"address: "+getaddress());
            System.out.print("\n"+"total: "+gettotal()+"\n\n");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int choice = 0, quantity = 0, total = 0;
        String name, address, contactnum;
        System.out.println("\n"+"-------------------");
        System.out.println("STORE OF EJ AND JERSEY");
        System.out.println("-------------------"+"\n");
        System.out.println("-------------------");
        System.out.println("Buyer info ");
        System.out.println("-------------------");
        System.out.print("\n"+"Enter name of buyer: ");
        name = scan.nextLine();
        System.out.print("\n"+"Enter address: ");
        address = scan.nextLine();
        System.out.print("\n"+"Enter contact number: ");
        contactnum = scan.nextLine();
        System.out.println("-------------------");
        System.out.println("ITEMS ");
        System.out.println("-------------------");
        String[][] items = {
                {"1. Oversized Shirt", "Php 250"},
                {"2. LongSleeve Unisex", "Php 200"},
                {"3. Crew neck shirt", "Php 260"},
                {"4. V-neck shirt", "Php 170"},
                {"5. Shorts", "Php 190"},
                {"6. Baseball cap", "Php 150"},
        };
        for(int a = 0; a < 6; a++) {
            System.out.print(items[a][0]+" "+items[a][1] +"\n");
        }
        System.out.print("\n"+"Select a Number Of An Item: ");
        choice = scan.nextInt();
        System.out.print("\n"+"quantity: ");
        quantity = scan.nextInt();

        if(choice == 1) {
            total = 250 * quantity;
        } else if (choice == 2) {
            total = 200 * quantity;
        }else if (choice == 3) {
            total = 260 * quantity;
        }else if (choice == 4) {
            total = 170 * quantity;
        }else if (choice == 5) {
            total = 190 * quantity;
        }else if (choice == 6) {
            total = 150 * quantity;
        }
        receipt rec = new receipt(name, address, contactnum, total);
        rec.print();
    }
}
