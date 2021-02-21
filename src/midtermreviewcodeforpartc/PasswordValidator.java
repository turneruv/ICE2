/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author ruvon
 */
public class PasswordValidator  {
    
    public void validate(String password){
        
        
        boolean validPassword=false;
        while(!validPassword){  
            int specialCharCount=0;
            
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
            
/*loop only ends when password is valid so add any 
*aditional password requirements as a loop here
*/     

        }//end of while loop

      
    }//end of validation method
}
