/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment7;
import java.util.ArrayList;

public class DanhSachBanBe {
    public static void main(String[] args) {
        // Tạo một ArrayList để lưu trữ tên của bạn bè
        ArrayList<String> banBe = new ArrayList<>();

        // Thêm 5 tên vào ArrayList
        banBe.add("Nam");
        banBe.add("Lan");
        banBe.add("Hoa");
        banBe.add("Khanh");
        banBe.add("Minh");

        // In danh sách bạn bè
        System.out.println("Danh sach ban be : " + banBe);
    }
}
