public class Main {
    public static void main(String[] args) {
        Author harlanEllison = new Author("Харлан", "Эллисон");
        Author nikolayGogol = new Author("Николай", "Гоголь");
        Author philipReeve = new Author("Филип", "Рив");

        Book dangerousVisions = new Book("Опасные видения", harlanEllison, 1967);
        Book tarasBulba = new Book("Тарас Бульба", nikolayGogol, 1835);
        Book mortalEngines = new Book("Смертные машины", philipReeve, 2001);

        tarasBulba.setPublicationYear(2003);

        Book[] bookShelf = {dangerousVisions, tarasBulba, mortalEngines};

        for (int i = 0; i < bookShelf.length; i++) {
            System.out.println(bookShelf[i].getName() + ", " + bookShelf[i].getAuthor().getName() + " "
                    + bookShelf[i].getAuthor().getSurname() + ", " + bookShelf[i].getPublicationYear() + "г.");
        }
    }
}