<!DOCTYPE html> 
<html lang="en"> 
  <head> 
    <title>Invoice</title> 
    <meta charset="UTF-8" /> 
    <meta name="viewport" content="width=device-width, initial-scale=1" /> 
    <link href="css/style.css" rel="stylesheet" /> 
  </head> 
  <body> 
    <form action="/result">
    <table border="2">
       <tr>
         <td>customer id: 
              <input type="text" name="id" /> 
        </td>
       </tr>
       <tr>
         <td>customer name:
               <input type="text" name="name" /> 
         </td>
        </tr>
        <tr>
           <td>mobile number:
                <input type="text" name="number" />
           </td>
        </tr>
        <tr>
            <td> product name:
                <input type="text" name="productName" />
            </td>
        </tr>
        <tr> 
             <td>price:
                <input type="text" name="price" />
             </td>
        </tr>
        <tr>
             <td> Quantity:
                  <input type="text" name="quantity"/>
             </td>
        </tr>
        <tr>
        <input type="submit"  value="printBill"/>
        <input type="submit" value="cancel"/>
        </tr>
   </table> 
   </form>
  </body> 
</html> 