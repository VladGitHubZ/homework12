
        public class Main {
            public static void main(String[] args) {
                Author author1 = new Author("Jack", "London");
                Author author2 = new Author("George", "Orwell");

                Book book1 = new Book("WHITE FANG", author1, 1906);
                Book book2 = new Book("1984", author2, 1949);

                book1.setPublicationYear(2000);

                System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFullName() +
                        ", published in " + book1.getPublicationYear());
                System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor().getFullName() +
                        ", published in " + book2.getPublicationYear());
            }
        }


