package advance.dev;

import java.util.LinkedList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		// Nhập số phần tử của danh sách
		System.out.print("Nhập số phần tử của danh sách: ");
		int n = scanner.nextInt();

		// Nhập các phần tử của danh sách và tạo danh sách liên kết đơn sắp xếp
		System.out.println("Nhập các phần tử của danh sách:");
		for (int i = 0; i < n; i++) {
			// for dùng để lặp qua từng phần tử nhập từ bàn phím
			// i dùng để đếm các phần tử đã nhập
			System.out.print("Phần tử thứ " + (i + 1) + ": ");
			int data = scanner.nextInt();
			// đọc giá trị nhập vào từ bàn phím và lưu vào biến data
			insertSorted(linkedList, data);
			// chèn biến data vào danh sách
		}
		// Tạo danh sách liên kết đơn sắp xếp
		// Thêm các phần tử vào danh sách

		// Bổ sung một phần tử mới vào danh sách
		System.out.print("Nhập phần tử mới: ");
		int newElement = scanner.nextInt();
		linkedList.add(newElement);

		// Xử lý loại bỏ phần tử thứ 10
		if (linkedList.size() >= 10) {
			linkedList.remove(9); // Vị trí 10 (đếm từ 0)
		}

		// Loại bỏ phần tử tại vị trí yêu cầu (i)
		System.out.print("Nhập vị trí cần loại bỏ (i): ");
		int position = scanner.nextInt();
		if (position >= 0 && position < linkedList.size()) {
			linkedList.remove(position);
		} else {
			System.out.println("Vị trí không hợp lệ.");
		}

		// In danh sách sau khi thực hiện các thao tác
		System.out.println("Danh sách sau khi thực hiện:");
		for (Integer element : linkedList) {
			System.out.print(element + " ");
		}
	}

	private static void insertSorted(LinkedList<Integer> linkedList, int data) {
		// TODO Auto-generated method stub
		
	}
}
