let Person = class{
    constructor(name){
        this.name = name;
    }

    getName(){
        return this.name;
    }
}

let person = new Person('Mark')
console.log(person.getName())
