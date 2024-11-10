/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7;

import java.util.ArrayList;

public class TimKiemTuKhoa {
    public static void main(String[] args) {
        // Tạo ArrayList với các từ khóa
        ArrayList<String> tuKhoa = new ArrayList<>();
        tuKhoa.add("Java");
        tuKhoa.add("Python");
        tuKhoa.add("C++");
        tuKhoa.add("JavaScript");

        // Từ khóa cần tìm kiếm
        String timKiem = "Python";

        // Kiểm tra xem từ khóa "Python" có trong danh sách không
        if (tuKhoa.contains(timKiem)) {
            System.out.println("Tu khoa \"" + timKiem + "\" co trong danh sach .");
        } else {
            System.out.println("Tu khoa \"" + timKiem + "\" khong co trong danh sach .");
        }
    }
}
