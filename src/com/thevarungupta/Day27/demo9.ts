export default class Test{
    getName(){
        console.log('test')
    }
}

export class Employee{
    public empid: number;
    public firstName: string;
    public lastName: string;
    public email: string;
    
    getFullName(){
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

export class FullTimeEmployee extends Employee{
    public annualSalary: number;
}

export class PartTimeEmployee extends Employee{    
    public hourSalary: number;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';

let pte = new PartTimeEmployee();
pte.firstName = 'Paul';
pte.lastName = 'Watson';

fte.getFullName();
pte.getFullName();


