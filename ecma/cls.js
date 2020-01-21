// class Polygon { 
//     constructor(height, width) { 
//        this.h = height; 
//        this.w = width;
//     } 
//     test() { 
//        console.log("The height of the polygon: ", this.h) 
//        console.log("The width of the polygon: ",this. w) 
//     } 
//  } 
 
 
//  var polyObj = new Polygon(10,20); 
//  polyObj.test();     

// class Person{ } 
// class Thing { }
// var obj = new Person() 
// var isPerson = obj instanceof Thing; 
// console.log(" obj is an instance of Person " + isPerson); 

// class Shape { 
//     constructor(a) { 
//        this.area = a
//     } 
//  } 
//  class Circle extends Shape { 
//     disp() { 
//        console.log("Area of the circle:  "+this.area) 
//     } 
//  } 
//  var obj = new Circle(223); 
//  obj.disp() 


class PrinterClass { 
    doPrint() { 
       console.log("PrinterClass");
    }
 }
 class StringPrinter extends PrinterClass { 
    doPrint() { 
        super.doPrint();
       console.log("StringPrinter"); 
    } 
 } 
 var obj = new StringPrinter(); 
 obj.doPrint();