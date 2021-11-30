class Book{
    public title: string;
    public author: string;
    public price: number;

    public display(){
        //console.log('Book: Title = '+ book1.title+ ', Author = '+ book1.author+ ', Price = '+ book1.price);        
        console.log(`Book: Title = ${this.title}, Author = ${this.author}, Price = ${this.price}`)
    }

}

let book1 = new Book();
book1.title = 'Title 1';
book1.author = 'Author 1';
book1.price = 100;

//console.log('Book: Title = '+ book1.title+ ', Author = '+ book1.author+ ', Price = '+ book1.price);


let book2 = new Book();
book2.title = 'Title 2';
book2.author = 'Author 2';
book2.price = 200;

//console.log('Book: Title = '+ book2.title+ ', Author = '+ book2.author+ ', Price = '+ book2.price);


book1.display()
book2.display();

