function getScored(){
    return [70, 80, 90]
}

let scores = getScored()
let x = scores[0];
let y = scores[1];
let x = scores[2];

console.log(x);
console.log(y);
console.log(z);

// destructing
let [x,y,z] = getScored();
console.log(x);
console.log(y);
console.log(z);

let employee = {
    id: 1,
    firstName: 'Mark',
    lastName: 'Watson',
    email: 'm@gmail.com'
}

let id = employee.id;
let firstName = employee.firstName;
let lastName = employee.lastName;
let email = employee.email;

let { id, firstName, lastName, email } = employee;




