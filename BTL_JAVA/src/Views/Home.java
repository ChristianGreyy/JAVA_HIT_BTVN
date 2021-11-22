package Views;

import java.util.*;
import Routes.*;

public class Home {
    Scanner sc = new Scanner(System.in);

    static Routes.HomeRouter homeRouter = new HomeRouter();

    public void showHomeStart(String fullname) {
        System.out.println("----------------------Trường đại học công nghiệp Hà Nội----------------------");
        System.out.printf("%76s\n", "Họ và tên");
        System.out.printf("%80s\n", fullname);
        System.out.println("1. Trang chủ");
        System.out.println("2. Tiện ích");
        System.out.println("3. Thông tin cá nhân");
        System.out.println("4. Chương trình đào tạo");
        System.out.println("5. Đăng ký học phần");
        System.out.println("6. Thời khóa biểu");
        System.out.println("7. Theo dõi kì thi");
        System.out.println("8. Kết quả học tập");
        System.out.println("9. Mạng xã hội");
        System.out.println("10. Đăng xuất.");
        System.out.println("------------------------------------------------");
    }

    public void showHome_SurveySheet(String idStudent, String fullname) {
        System.out.printf("%-10s%-20s%-20s%-80s%-20s%-20s\n", "STT", "Mã sinh viên", "Họ tên", "Loại phiếu", "Mã phiếu", "Thời gian khảo sát");
        for(int i=0; i<10; i++) {
            System.out.printf("%-10d", (i+1));
            System.out.printf("%-20s", idStudent);
            System.out.printf("%-20s", fullname);
            System.out.printf("%-80s", "PHIẾU KHẢO SÁT THÔNG TIN PHỤC VỤ CÔNG TÁC PHÒNG CHỐNG DỊCH BỆNH COVID 19");
            System.out.printf("%-20s", "XU443");
            System.out.printf("%-20s\n", "07:04, 12/11/2021");
        }
    }

    public void showHome() {
        int choose;
        do {
            System.out.println("1. Khảo sát");
            System.out.println("2. Quay lại");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    homeRouter.Home__SurveySheet();
                    break;
                default:
                    System.out.println("Lựa chọn không tồn tại!!!");
            }
        } while(choose != 2);
    }
}
