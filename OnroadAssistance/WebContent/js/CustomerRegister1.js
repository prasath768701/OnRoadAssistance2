function UserNameValidation() {
     var UserName  = document.getElementById("UserName").value;
     var UserNamereq = /^[A-Za-z]+$/
     if (UserName!= "") {
          if (!UserName.match(UserNamereq)) {

              document.getElementById("UserNameError").innerHTML = "Only Alphabets"
          } else {
              document.getElementById("UserNameError").innerHTML = ""
          }
     } else {
          document.getElementById("UserNameError").innerHTML = "*"
     }

}
function PasswordValidation() {
    var Password = document.getElementById("Password").value;
    var Passwordreq =  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/
    
    if (Password != "") {
    	
    	if (!Password.match( Passwordreq)) {
    		
            document.getElementById("PasswordNameError").innerHTML = "password should be 6 to 20 characters with one numeric"
   
    } else {
             document.getElementById("PasswordNameError").innerHTML = ""
           }
         
       } 
    else {
         document.getElementById("PasswordNameError").innerHTML = "*"
          }
   }
   

function ContactValidation() {
    var ContactNumber = document.getElementById("PhoneNumber").value;
    var ContactNumberreq = /^[0-9]+$/
  
         if (ContactNumber != "") {
         if (!ContactNumber.match(ContactNumberreq)) {

              document.getElementById("ContactNumberError").innerHTML = "Only Numbers"
         } else {
              document.getElementById("ContactNumberError").innerHTML = ""
         }
    } else {
         document.getElementById("ContactNumberError").innerHTML = "*"
    }

}


