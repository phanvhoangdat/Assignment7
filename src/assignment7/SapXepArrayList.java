/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7;
import java.util.ArrayList;
import java.util.Collections;

public class SapXepArrayList {
    public static void main(String[] args) {
        // Tạo ArrayList chứa các số nguyên
        ArrayList<Integer> soNguyen = new ArrayList<>();
        soNguyen.add(5);
        soNguyen.add(3);
        soNguyen.add(8);
        soNguyen.add(2);
        soNguyen.add(4);

        // In danh sách trước khi sắp xếp
        System.out.println("Danh sach truoc khi sap xep : " + soNguyen);

        // Sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(soNguyen);

        // In danh sách sau khi sắp xếp
        System.out.println("Danh sach sau khi sap xep theo thu tu : " + soNguyen);
    }
}
