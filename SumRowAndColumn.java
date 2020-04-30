package BT_TinhTongCotCuaMang;

import java.util.Random;
import java.util.Scanner;

public class SumRowAndColumn {
    public static void main(String[] args) {
        //Khai Báo Số Cột Và Dòng Của Mảng Cần Tạo
        int row;
        int column;
        int check = 2;
        // khởi tạo phương thước Random & nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        //gán giá trị cho row and column;
        do {
            System.out.println("Nhập Số Cột Muốn tạo :");
            row = scanner.nextInt();
            System.out.println("Nhập Số Hàng Muốn Tạo :");
            column = scanner.nextInt();
            if (row != column) {
                System.out.println("Mảng Bạn Chọn Không Phải LÀ Ma Trận \n" +
                        "Bạn Có Muốn Khởi Tạo Mảng Ma Trận Không ? ");
                do {
                    System.out.println("Menu :");
                    System.out.println("1 : Có");
                    System.out.println("2 : Không");
                    check = scanner.nextInt();
                    System.out.println("Bạn đã Lựa Trọn : " + check);
                    if (check < 1 || check > 2) {
                        System.out.println("Bạn Chọn Không Đúng...!\n Chọn 1 Hoặc 2");
                    }
                }
                while (check < 1 || check > 2);
                if (check == 1) {
                    System.out.println("Ma trận Có Số Dòng Và Cột Bằng Nhau");
                }
            } else {
                check = 2;
            }
        } while (check != 2);
        //khỏi Tạo Mảng:
        System.out.println("Mảng Bạn Khởi Tạo Là : ");
        int[][] array = arr(row, column);
        if (row == column) {
            int sumDiagonalMain = sumDiagonalMain(array);
            System.out.println("Tổng Đường Chéo Chính = " + sumDiagonalMain);
            int sumDiagonal=sumDiagonal(array);
            System.out.println("Tổng Đường Chéo Phụ = "+sumDiagonal);
        } else {

        }
    }

    // Phương thươc Random Mảng Arr 2 Chiều
    public static int[][] arr(int row, int column) {
        Random random = new Random();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = random.nextInt(9) +1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    //Tạo Phương Thức Tính Tổng Đường Chéo Chính Mảng
    public static int sumDiagonalMain(int[][] arr) {
        int sumDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumDiagonal += arr[i][i];
        }
        return sumDiagonal;
    }

    // Tạo Phương Thức Tính Tổng Đường Chéo phụ Của Mảng
    public static int sumDiagonal(int[][] arr) {
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
}
