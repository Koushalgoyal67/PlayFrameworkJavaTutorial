package controllers;

import play.mvc.*;


public class HomeController extends Controller {


    public Result index() {
        return ok("Routing in Play");
    }
    
    public Result queryString() {
    	String name =request().getQueryString("name");
    	int age = Integer.parseInt(request().getQueryString("age"));
    	String lastName=request().getQueryString("last-name");
    	return ok("name "+name+" age "+age +" lastName "+lastName);
    }
    
    //or method overloading is not allowed for Routing 
    
	  public Result queryString(String name ,int age) {
	      return ok("name "+name+" age "+age);
	  }
	  
	  public Result path(String name ,int age) {
	      return ok("name "+name+" age "+age);
	  }
	  
	    public Result multiplePath(String path) {
	    	String[] parts = path.split("/");
	    	return ok(parts[0]+"");
	    }
	  
}
