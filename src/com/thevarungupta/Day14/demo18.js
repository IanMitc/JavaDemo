class Person{
    constructor(name){
        this.name = name;
    }

    getName(){
        return this.name;
    }

    static foo(){
        console.log('static method')
    }
}

let person = new Person('Paul');
//person.foo()  // error
Person.foo()  // static method