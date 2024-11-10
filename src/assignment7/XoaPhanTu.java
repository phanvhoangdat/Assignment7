/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7;

import java.util.ArrayList;

public class XoaPhanTu {
    public static void main(String[] args) {
        // Tạo ArrayList chứa các số nguyên từ 1 đến 10
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Xóa số 5 khỏi danh sách
        numbers.remove(Integer.valueOf(5));

        // In danh sách sau khi xóa
        System.out.println("Danh sach sau khi xoa : " + numbers);
    }
}
