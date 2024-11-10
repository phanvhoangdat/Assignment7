/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7;
import java.util.ArrayList;

public class DuyetVaTimKiem {
    public static void main(String[] args) {
        // Tạo ArrayList chứa tên của 5 thành phố
        ArrayList<String> thanhPho = new ArrayList<>();
        thanhPho.add("Ha Noi");
        thanhPho.add("Ho Chi Minh ");
        thanhPho.add("Da Nang ");
        thanhPho.add("Hai Phong ");
        thanhPho.add("Can Tho ");

        // Duyệt qua ArrayList và in ra tên của từng thành phố
        System.out.println("Danh sach cac thanh pho :");
        for (String tp : thanhPho) {
            System.out.println(tp);
        }

        // Tìm kiếm một thành phố trong ArrayList
        String timKiem = "Da Nang ";
        if (thanhPho.contains(timKiem)) {
            System.out.println("\nThanh pho  " + timKiem + "co trong danh sach .");
        } else {
            System.out.println("\nThanh pho " + timKiem + " khong co trong danh sach .");
        }
    }
}
