// var firstDiv = document.querySelector('div');
// firstDiv.style.color = 'red';

// var paragraphs = document.querySelectorAll('p');
// for(var p of paragraphs)
//   p.style.color = 'blue';
 
//   var btn = document.querySelector('button');
//   btn.addEventListener('click', foo);
//   function foo() { alert('hello'); }


//    var div = document.querySelector('div');
//    var strong = document.createElement('strong');
//    strong.textContent = 'Hello';
//       div.appendChild(strong);

// var em = document.createElement('em');
// var strong = document.querySelector('strong');
// //var copy = strong.cloneNode(true);
// var div = document.querySelector('div');
// em.textContent = 'hi';
// //div.replaceChild(em, strong);
// //div.appendChild(copy);
// div.insertBefore(em, strong);

// var table = document.querySelector("table");
// var df = document.createDocumentFragment();
 
// for(var i=0; i<5; i++) {
//   var td = document.createElement("td");
//   var tr = document.createElement("tr");
//   td.textContent = i;
//   tr.appendChild(td)
//   df.appendChild(tr);
// }
 
// table.appendChild(df);

// var style = getComputedStyle(document.querySelector('div'));
// alert('hello');

 var div = document.querySelector('div');
 //div.setAttribute('contenteditable','')
 //alert(div.getAttribute('contenteditable'))
div.removeAttribute('contenteditable')