package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if(str.equals("앱")) {
        	appExecute();
        }
        else {
        	super.execute(str);
        }
    	
    }
 
  
    
    
    public void appExecute() {
	   System.out.println("앱실행");
   }
   
   
    
   
    
    
    
}
