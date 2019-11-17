package controllers;

import javax.inject.Inject;

import com.typesafe.config.Config;

import play.mvc.Controller;
import play.mvc.Result;


public class HomeController extends Controller {

	@Inject
	Config config;

    public Result index() {
        return ok(config.getString("hello-msg")+config.getInt("integer-value"));
    }

}
