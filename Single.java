class Book{
    String name;
    String Author;
    float price;
    String ISBN;
    public Book(String name, String Author, float price, String isbn) {
		this.name = name;
		this.Author = Author;
        this.price = price;
		this.ISBN = isbn;
	}
}
class Invoice {

	public Book book;
	public int quantity;
	public double discount;
	public double tax;
	public double total;

	public Invoice(Book book, int quantity, double discount, double tax) {
		this.book = book;
		this.quantity = quantity;
		this.discount = discount;
		this.tax = tax;
		this.total = this.calculateTotal();
	}

	public double calculateTotal() {
	    double price = ((book.price - book.price * discount) * this.quantity);
		double priceWithTaxes = price + price * tax;
		return priceWithTaxes;
	}

    // public void print();
    //public void save();
}

class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void print() {
        System.out.println("Book: "+invoice.book.name);
        System.out.println("Quantity: "+invoice.quantity );
        System.out.println("Price: " + invoice.book.price);
        System.out.println("Discount Rate: " + invoice.discount);
        System.out.println("Tax Rate: " + invoice.tax);
        System.out.println("Total: Rs." + invoice.total);
    }
}
interface InvoicePersistence {
    public void save(Invoice invoice);
}
class DatabasePersistence implements InvoicePersistence {
    public void save(Invoice invoice) {
        System.out.println("Saved the "+invoice+" to DataBase");
    }
}
class FilePersistence implements InvoicePersistence {
    public void save(Invoice invoice) {
        System.out.println("Saved the "+invoice+" to File");
    }
}
public class Single{
    public static void main(String [] ar){
        Book book=new Book("Solid","Martin",350.6f,"93858X");
        Invoice invoice=new Invoice(book,2,0.2,5.5);
        InvoicePrinter inp=new InvoicePrinter(invoice);
        inp.print();
    }
}