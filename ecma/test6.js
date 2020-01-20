// var person = { 
//         firstname:"Tom", 
//         lastname:"Hanks", 
//         func:function(){return "Hello!!"},    
//      }; 
     
//      console.log(person.firstname)   
//      console.log(person.lastname) 
//      console.log(person.func())

// var mycar = new Object();
// mycar.make = "ford";
// mycar.model = "mustang";
// mycar.year = "2020";

// console.log(mycar["make"]);
// console.log(mycar['model']);
// console.log(mycar['year']);

function MyCar(){
       this.make='ford';
       this.year='2020'

}

var obj = new MyCar();
console.log(obj.make);
console.log(obj.year);