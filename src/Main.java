import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);


        String hata = "Lütfen geçerli bir gün giriniz";

        System.out.print("Doğduğunuz Günü Giriniz: ");
        day = input.nextInt();

        System.out.print("Doğduğunuz Ayı Giriniz: ");
        month = input.nextInt();


        if (month == 1) {
            if (day < 32 && day > 0) {
                if (day < 23) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 2) {
            if (day < 29 && day > 0) {
                if (day < 21) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 3) {
            if (day < 32 && day > 0) {
                if (day < 21) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 4) {
            if (day < 31 && day > 0) {
                if (day < 22) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            } else {

                System.out.println(hata);
            }
        } else if (month == 5) {
            if (day < 32 && day > 0) {
                if (day < 22) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 6) {
            if (day < 31 && day > 0) {
                if (day < 23) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            } else {
                System.out.println(hata);
            }

        } else if (month == 7) {
            if (day < 32 && day > 0) {
                if (day < 24) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else {
                System.out.println(hata);
            }

        } else if (month == 8) {
            if (day < 32 && day > 0) {
                if (day < 23) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 9) {
            if (day < 31 && day > 0) {
                if (day < 24) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 10) {
            if (day < 32 && day > 0) {
                if (day < 23) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 11) {
            if (day < 31 && day > 0) {
                if (day < 22) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            } else {
                System.out.println(hata);
            }
        } else if (month == 12) {
            if (day < 32 && day > 0) {
                if (day < 22) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
            } else {
                System.out.println(hata);
            }
        }
    }
}