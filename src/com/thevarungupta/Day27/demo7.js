var Book = /** @class */ (function () {
    function Book(title, author, price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book.prototype.display = function () {
        //console.log('Book: Title = '+ book1.title+ ', Author = '+ book1.author+ ', Price = '+ book1.price);        
        console.log("Book: Title = ".concat(this.title, ", Author = ").concat(this.author, ", Price = ").concat(this.price));
    };
    return Book;
}());
var book1 = new Book('Title 1', 'Author 1', 1000);
book1.display();
