package javaCourse2;

import java.util.Scanner;

public class ikinciPratikKullaniciGirisi {
    public static void main(String[] args) {
        String userName, passWord, yeniSifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        passWord = input.nextLine();

        if(userName.equals("patika") && passWord.equals("java123")){
            System.out.println("Kullanıcı adı ve şifre doğru");
        } else if(userName.equals("patika")) {
            System.out.println("Şifreniz hatalı!");
            System.out.print("Şifrenizi değiştirmek isterseniz  evet istemezseniz hayır yazıp enter'a tıklayın: ");
            yeniSifre = input.nextLine();
            if(yeniSifre.equals("evet")){
                System.out.print("Yeni sifreyi giriniz: ");
                passWord = input.nextLine();

                System.out.println("Şifreniz başarıyla değiştirildi. Sisteme yeni şifreniz ile giriş yapabilirsiniz.");
            } else {
                System.out.println("Sifrenizi hatırlayınca gelin.");
            }
        } else if (passWord.equals("java123")){
            System.out.println("Kullanıcı adınız hatalı. Bu konuda bir işlem gerçekleştiremezsiniz. Tekrar deneyiniz");
        } else {
            System.out.println("Doğru bildiğin bişey yok git buradan!!");
        }

    }
}
