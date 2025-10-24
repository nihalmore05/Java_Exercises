package OOP_P1_DAY_2_ENCAPSULATION;

//3. Create a `Book` class that hides its `price` variable.

public class book {
    public String bookName;
    public String author;
    public int publish_Year;
    private double price; // private encapsulation (hidden variable) here

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {

            System.out.println("The Price must be positive");
        }

    }

    public static void main(String[] args) {

        book b1 = new book(); // creating object

        b1.bookName = "Jungle book"; // set public variable
        b1.author = "Rudyard Kipling";
        b1.publish_Year = 1894;
        b1.setPrice(100); // set value for setter

        System.out.println("Name :" + b1.bookName);
        System.out.println("Author :" + b1.author);
        System.out.println("Publish :" + b1.publish_Year);
        System.out.println("Price :Rs " + b1.getPrice()); // get thr value
    }

}
