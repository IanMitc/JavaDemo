let name = 'fullName';

class Person{
    constructor(firstName, lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    get[name](){
        return `${this.firstName} ${this.lastName}`
    }
}

let person = new Person('Paul', 'Watson');
console.log(person.fullName)