public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Edson");

        Movie movie1 = new Movie("Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("John Wick 4", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}