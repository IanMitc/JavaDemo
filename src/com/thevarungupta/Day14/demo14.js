// old syntax
function add(a, b){
    return a + b
}
console.log(add(10, 20))

// new arraw syntax
let add2 = (x, y) => x + y;
console.log(add2(300, 200)) 

let add3 = (x, y) => { return x + y }

console.log(typeof add3)

let hello = name => 'Hello '+ name;
console.log(hello('mark'))

let say = () => 'welcome guest'