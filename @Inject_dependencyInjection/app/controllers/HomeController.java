package controllers;

import javax.inject.Inject;

import play.mvc.Controller;
import play.mvc.Result;
import services.DependencyService;


public class HomeController extends Controller {

	@Inject
	DependencyService dependencyService;

    public Result index() {
        return ok(dependencyService.getMsg());
    }

}
