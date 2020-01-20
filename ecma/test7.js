// var roles = { 
//     type: "Admin", 
//     displayType : function() {  
//        console.log(this.type); 
//     } 
//  }  
//  var super_role = Object.create(roles); 
//  super_role.displayType(); 
 
//   var guest_role = Object.create(roles); 
//  guest_role.type = "Guest00000"; 
//  guest_role.displayType();

var o1 = { a: 10 }; 
// var o2 = { b: 20 }; 
// var o3 = { c: 30 }; 
// var obj = Object.assign(o2,o1, o3); 
var sample = Object.assign(o1);
// console.log(obj);  
// console.log(o2);
// console.log(o1);
// obj.c++
// console.log(obj.o3);
sample.a++
console.log(sample.a);