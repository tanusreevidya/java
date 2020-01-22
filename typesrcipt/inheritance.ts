class ShapeIn { 
    Area:string
    
    constructor(a:string) { 
       this.Area = a 
    } 
 } 
 
 class CircleIn extends ShapeIn { 
    disp():void { 
       console.log("Area of the circle:  "+this.Area) 
    } 
 }
   
 var obj = new CircleIn('five'); 
 obj.disp()