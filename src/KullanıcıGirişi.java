import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String userName, password;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Şifreniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? ");
            System.out.println("1-Şifremi sıfırla\n2-İstemiyorum ");

            int sifreSecim;
            sifreSecim = input.nextInt();


            switch (sifreSecim) {
                case 1:
                    System.out.print("Yeni şifreniz : " + input.nextLine());
                    String yeniSifre = input.nextLine();

                    if (yeniSifre.equals("java123")) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz");

                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }

                    break;

                case 2:
                    System.out.println("İyi günler dileriz :)");
                    break;
            }


        }


    }
}
