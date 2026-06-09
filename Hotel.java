import java.util.*;

public class Hotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

/------------------hotel name---------------------/ 

            System.out.println("<----- WELCOME TO FOOD ORDER ----->");
            System.out.println("");
            System.out.println("1. A2B - Adyar Ananda Bhavan");
            System.out.println("2. Sree Annapoorna");
            System.out.println("3. SS Hyderabad Briyani");
            System.out.println("4. Salem RR Briyani");
            System.out.println("5. Exit");
            System.out.println("");

            System.out.print("Choose Hotel: ");
            int hotel = sc.nextInt();

            switch (hotel) {

                case 1:
                    a2bMenu(sc);
                    break;

                case 2:
                    annapoornaMenu(sc);
                    break;

                case 3:
                    ssHyderabadMenu(sc);
                    break;

                case 4:
                    salemrrMenu(sc);
                    break;

                case 5:
                    System.out.println("Thank you!... Visit Again");
                    return;

                default:
                    System.out.println("Invalid Input!");
            }
        }
    }

    // ---------------- A2B ----------------
    public static void a2bMenu(java.util.Scanner sc) {
        while (true) {
            System.out.println(" ");
            System.out.println("Welcome to A2B :)");
            System.out.println("< A2B MENU >");
            System.out.println("");
            System.out.println("1. Idly - Rs.20");
            System.out.println("2. Dosa - Rs.40");
            System.out.println("3. Pongal - Rs.45");
            System.out.println("4. Poori - Rs.50");

            System.out.print("Choose Item: ");
            int item = sc.nextInt();
            int price = 0;

            switch (item) {
                case 1: price = 20; break;
                case 2: price = 40; break;
                case 3: price = 45; break;
                case 4: price = 50; break;
                default:
                    System.out.println("Invalid Item!");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Your Bill : Rs." + total);
            System.out.println("");

            if (payment(sc, total)) {
                System.out.println("Order Confirmed! Returning to Main Menu");
                System.out.println("Your Bill : Rs." + total);
                System.out.println("");
                return;
            } else {
                System.out.println("OTP Failed! Returning to A2B Menu");
            }
        }
    }

    // ---------------- ANNAPOORNA ----------------
    public static void annapoornaMenu(java.util.Scanner sc) {
        while (true) {
            System.out.println(" ");
            System.out.println("Welcome to Sree Annapoorna :)");
            System.out.println("< Sree Annapoorna MENU >");
            System.out.println("");
            System.out.println("1. Dosai - Rs.70");
            System.out.println("2. Meals - Rs.120");
            System.out.println("3. Chapathi - Rs.40");
            System.out.println("4. Coffee - Rs.25");

            System.out.print("Choose Item: ");
            int item = sc.nextInt();
            int price = 0;

            switch (item) {
                case 1: price = 70; break;
                case 2: price = 120; break;
                case 3: price = 40; break;
                case 4: price = 25; break;
                default:
                    System.out.println("Invalid Item!");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Your Bill : Rs." + total);
            System.out.println("");

            if (payment(sc, total)) {
                System.out.println("Order Confirmed! Returning to Main Menu");
                System.out.println("Your Bill : Rs." + total);
                System.out.println("");
                return;
            } else {
                System.out.println("OTP Failed! Returning to Annapoorna Menu");
            }
        }
    }

    // ---------------- SS HYDERABAD ----------------
    public static void ssHyderabadMenu(java.util.Scanner sc) {
        while (true) {
            System.out.println(" ");
            System.out.println("Welcome to SS Hyderabad :)");
            System.out.println("< SS Hyderabad Briyani MENU >");
            System.out.println("");
            System.out.println("1. Chicken Briyani - Rs.160");
            System.out.println("2. Mutton Briyani - Rs.220");
            System.out.println("3. Grill Chicken - Rs.180");
            System.out.println("4. Shawarma - Rs.90");

            System.out.print("Choose Item: ");
            int item = sc.nextInt();
            int price = 0;

            switch (item) {
                case 1: price = 160; break;
                case 2: price = 220; break;
                case 3: price = 180; break;
                case 4: price = 90; break;
                default:
                    System.out.println("Invalid Item!");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Your Bill : Rs." + total);
            System.out.println("");

            if (payment(sc, total)) {
                System.out.println("Order Confirmed! Returning to Main Menu");
                System.out.println("Your Bill : Rs." + total);
                System.out.println("");
                return;
            } else {
                System.out.println("OTP Failed! Returning to SS Hyderabad Menu");
            }
        }
    }

    // ---------------- SALEM RR ----------------
    public static void salemrrMenu(java.util.Scanner sc) {
        while (true) {
            System.out.println(" ");
            System.out.println("Welcome to Salem RR Briyani :)");
            System.out.println("< SALEM RR Briyani Menu >");
            System.out.println("");
            System.out.println("1. Chicken Briyani (1KG) --+ Rs.220");
            System.out.println("2. Mutton Briyani (1KG) - Rs.400");
            System.out.println("3. Grill - Rs.199");
            System.out.println("4. Bucket Briyani Combo (Both) - Rs.599");

            System.out.print("Choose Item: ");
            int item = sc.nextInt();
            int price = 0;

            switch (item) {
                case 1: price = 220; break;
                case 2: price = 400; break;
                case 3: price = 199; break;
                case 4: price = 599; break;
                default:
                    System.out.println("Invalid Item!");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Your Bill : Rs." + total);
            System.out.println("");

            if (payment(sc, total)) {
                System.out.println("Order Confirmed! Returning to Main Menu !");
                System.out.println("Your Bill : Rs." + total);
                System.out.println(" ");
                return;
            } else {
                System.out.println("OTP Failed! Returning to Salem RR Briyani Menu !");
            }
        }
    }

    // ---------------- PAYMENT + OTP ----------------//
    public static boolean payment(java.util.Scanner sc, int amount) {
        System.out.println("-$- PAYMENT -$-");
        System.out.println("");
        System.out.println("1. Google Pay");
        System.out.println("2. PhonePe");
        System.out.println("3. Paytm");
        System.out.println("");

        System.out.print("Select Payment App: ");
        int app = sc.nextInt();

        if (app == 1) {
            System.out.println("Google Pay Selected");
        } else if (app == 2) {
            System.out.println("PhonePe Selected");
        } else if (app == 3) {
            System.out.println("Paytm Selected");
        } else {
            System.out.println("<--- Invalid Payment App! --->");
            System.out.println(" ");
            System.out.println("<--- Returning to Select Payment Method --->");
            return payment(sc, amount);
        }

        System.out.print("Enter UPI Number: ");
        String upi = sc.next();

        int otp = (int)(100000 + Math.random() * 900000);
        System.out.println("Generated OTP (testing): " + otp);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter OTP Attempt (" + i + "/3): ");
            int userOtp = sc.nextInt();

            if (userOtp == otp) {
                System.out.println("Payment Successful!");
                return true;
            } else {
                System.out.println("Incorrect OTP!");
            }
        }
        return false;
    }
}