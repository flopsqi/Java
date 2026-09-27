public class Book {
    public static void main(String[] args) {
        Book myBook = new Book("Приключение Гекльберри Финна", "Марк Твен", 1884);

        myBook.displayInfo();

        Book secondBook = new Book("Война и мир", "Лев Толстой", 1865);

        secondBook.setYear(1869);
        System.out.println(secondBook.getYear());

    }
        private String title;
        private String author;
        private int year;

    public Book(String title, String author, int year){
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle () {
            return title;
        }

        public String getAuthor () {
            return author;
        }

        public int getYear () {
            return year;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public void setAuthor (String author){
            this.author = author;
        }

        public void setYear ( int year){
            this.year = year;
        }

        public void displayInfo (){
            System.out.println(title + " " + author + " " + year);
        }
    }

