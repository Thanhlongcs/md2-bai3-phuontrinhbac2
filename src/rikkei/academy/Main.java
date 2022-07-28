package rikkei.academy;


import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("QuadraticEquation: ax2 + bx + c = 0 (a ≠ 0)");
        //LOGIC TÌM NGHIỆM
        // TH1:Nếu a khác 0 thì mới thực hiện tính delta.
        // TH2: Nếu a = 0, thì phương trình sẽ trở thành phương trình bậc nhất. Do đó phải yêu cầu nhập a khác 0
        do {
            System.out.println("Enter a: ");
            a = scanner.nextDouble();
            if (a == 0 ) {
                System.out.println("Please enter a ≠ 0");
            }
        } while (a == 0);
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();


        //BẮT ĐẦU TÌM NGHIỆM
        //Khởi tạo đối tượng phuongTrinh thuộc lớp QuadraticEquation đã tạo, truyền vào đối số a,b,c
        QuadraticEquation phuongTrinh = new QuadraticEquation(a, b ,c);
        //Nếu delta < 0, phương trình vô nghiệm; delta = 0 thì có 1 nghiệm kép; deta > 0 thì có 2 nghiệm phân biệtt
        System.out.println("delta======" + phuongTrinh.getDelta());
        if(phuongTrinh.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (phuongTrinh.getDelta() == 0) {
            System.out.println("Phương trình có 1 nghiệm kép là: " + phuongTrinh.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt là: x1 = " + phuongTrinh.getRoot1() + " ; " + "x2 = " + phuongTrinh.getRoot2());
        }
    }
}