package Lists.ObjectsAndClasses.Articles;

import java.util.Scanner;


public class Articles {
    public static class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(", ");
        int n = Integer.parseInt(scan.nextLine());

        Article article = new Article(elements[0], elements[1], elements[2]);

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(": ");
            String command = tokens[0];
            switch (command) {
                case "Edit":
                    String content = tokens[1];
                    article.setContent(content);
                    break;
                case "ChangeAuthor":
                    String author = tokens[1];
                    article.setAuthor(author);
                    break;
                case "Rename":
                    String title = tokens[1];
                    article.setTitle(title);
                    break;
            }

        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());


    }
}
