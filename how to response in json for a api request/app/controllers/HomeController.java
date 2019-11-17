package controllers;

import javax.inject.Inject;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import response.PersonDetails;

public class HomeController extends Controller {


	@Inject
	PersonDetails personDetails;
	
    public Result index() {
    	
    	personDetails.setAge(22);
    	personDetails.setName("Ram");
    	
        return ok(Json.toJson(personDetails));
    }

}
