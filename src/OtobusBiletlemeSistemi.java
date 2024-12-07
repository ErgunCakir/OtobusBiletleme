import java.util.Scanner;

public class OtobusBiletlemeSistemi {
    public static void main(String[] args) {
        //Rota için koltuk sayıları komutları
        int birinciRotaKoltuk = 10;
        int ikinciRotaKoltuk = 10;
        int ucuncuRotaKoltuk = 10;

        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        System.out.println("Biletleme Sistemimize Hoşgeldiniz..");

        while (devam){
            System.out.println("\nMevcut Rotalar");
            System.out.println("1. Rota İstanbul-Ankara seferi (Kalan Koltuk : "+birinciRotaKoltuk + ")");
            System.out.println("2. Rota İstanbul-İzmir seferi (Kalan Koltuk : "+ikinciRotaKoltuk + ")");
            System.out.println("3. Rota İstanbul-Antalya (Kalan Koltuk : "+ucuncuRotaKoltuk + ")");
            System.out.println("4. Çıkış");

            System.out.print("\nBir rota seçin (1-3): ");
            int secim = scanner.nextInt();

            switch (secim){
                case 1: // birinci rota için işlem
                    if (birinciRotaKoltuk > 0){
                        System.out.println("Kaç tane koltuk satın almak istiyorsunuz?");
                        int alinanKoltuk = scanner.nextInt();
                        if (alinanKoltuk > 0 && alinanKoltuk <= birinciRotaKoltuk){
                            birinciRotaKoltuk -= alinanKoltuk;
                            System.out.println(alinanKoltuk + " koltuk satın alındı!");
                        }else{
                            System.out.println("Yeterli koltuk yok veya hatalı giriş!!");
                        }
                    }else{
                        System.out.println("Birinci Rotada hiç koltuk kalmadı!");
                    }
                    break;
                case 2: // ikinci rotamız için işlem
                    if (ikinciRotaKoltuk > 0){
                        System.out.println("Kaç koltuk satın almak istiyorsunuz?");
                        int alinanKoltuk = scanner.nextInt();
                        if (alinanKoltuk > 0 && alinanKoltuk <= ikinciRotaKoltuk) {
                            ikinciRotaKoltuk -= alinanKoltuk;
                            System.out.println(alinanKoltuk + " koltuk satın alındı");
                        }else{
                            System.out.println("Yeterli koltuk yok veya hatalı giriş");
                        }
                    }else{
                        System.out.println("İkicni rotada hiç koltuk kalmadı");
                    }
                    break;
                case 3:
                    if (ucuncuRotaKoltuk > 0){
                        System.out.println("Kaç koltuk satın almak istiyorsunuz?");
                        int alinanKoltuk = scanner.nextInt();
                        if (alinanKoltuk > 0 && alinanKoltuk <= ucuncuRotaKoltuk){
                            ucuncuRotaKoltuk -= alinanKoltuk;
                            System.out.println(alinanKoltuk + " koltuk satın alındı");
                        }else{
                            System.out.println("Yeterli koltuk yok veya hatalı giriş");
                        }
                    }else{
                        System.out.println("Üçüncü rotada hiç koltuk kalmadı");
                    }
                    break;
                case 4: //çıkış için oluşturuyorum
                    devam = false;
                    System.out.println("Sistemden çıkılıyor, teşekkürler.");
                    break;

                default:
                    System.out.println("Geçersiz seçim");
            }
        }
        scanner.close();
    }
}
