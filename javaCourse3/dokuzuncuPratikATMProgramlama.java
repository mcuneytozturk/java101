package javaCourse3;

import java.util.Scanner;

public interface dokuzuncuPratikATMProgramlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Lütfen kullanıcı adınızı girin: ");
            String username = scanner.nextLine();

            System.out.print("Lütfen kullanıcı adınızı girin: ");
            String password = scanner.nextLine();
            if (username.equals("mcuneytozturk") && password.equals("123456cc")) {
                System.out.println("Giriş başarılı. Hoşgeldiniz");
                do {
                    System.out.println("1- Para yatırma\n2- ParaÇekme\n 3- Bakiye Sorgulama\n 4- Çıkış Yap");
                    select = scanner.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar = ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktar = ");
                            int price2 = scanner.nextInt();
                            if(price2 > balance){
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3: 
                            System.out.println("Bakiyeniz =" + balance);
                            break; 
                    }
                } while(select != 4);
                    System.out.println("Sistemden çıkartıldınız.");
                    break;
            } else {
                right--;
                System.out.println("Bişeyler yanlış oldu. Tekrar deneyin");
                if (right == 0) {
                    System.out.println("Hesap blokelendi lütfen banka ile görüşünüz!");
                }
                System.out.println("Kalan hakkınız = " + right);
            }
        }

    }
}
