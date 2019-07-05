import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        int size;
        do {
            System.out.println("Nhap so luong phan tu cua mang:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhap so luong phan tu nho hon 20");
            }
        } while (size > 20);
        array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:" + array[i]);
        }
        int position;
        System.out.println("Nhap vi tri can tim:");
        position = sc.nextInt();
        try {
            System.out.println("Phan tu cua mang tai vi tri " + position + " co gia tri la:" + array[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("chi so vuot qua phan tu cua mang");
        }
    }
}
