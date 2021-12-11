package Bai3;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<News> ArrayNews = new ArrayList();
        int choose;
        do {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Enter you choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    One(ArrayNews);
                    break;
                case 2:
                    Two(ArrayNews);
                    break;
                case 3:
                    Three(ArrayNews);
                    break;
                case 4:
                    System.out.println("End!!");
                    break;
            }

        } while(choose != 4);
    }

    static void One(ArrayList<News> ArrayNews) {
        News news = new News();
        sc.nextLine();
        System.out.print("Enter the title: ");  news.setTitle(sc.nextLine());
        System.out.print("Enter the publishDate: "); news.setPublishDate(sc.nextLine());
        System.out.print("Enter the author: "); news.setAuthor(sc.nextLine());
        System.out.print("Enter the content: "); news.setContent(sc.nextLine());
        news.inputRateList();
        ArrayNews.add(news);
    }

    static void Two(ArrayList<News> ArrayNews) {
        for(int i=0; i<ArrayNews.size(); i++) {
            ArrayNews.get(i).Display();
        }
    }

    static void Three(ArrayList<News> ArrayNews) {
        for(int i=0; i<ArrayNews.size(); i++) {
            ArrayNews.get(i).Calculate();
            ArrayNews.get(i).Display();
            System.out.println("=========================");
        }
    }
}
