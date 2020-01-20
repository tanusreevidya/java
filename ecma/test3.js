outerloop:
for( var i=0; i < 5; i++)
{
   console.log("outerloop :" +i);
   innerloop:
   for(j=0; j < 5 ; j++ )
   {
       console.log("innerloop :" +j);
       if( j = 2) {
           break;
       }
       if (i == 2) break innerloop;

      if(i == 3) break outerloop;
    }
}