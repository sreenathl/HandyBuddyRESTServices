package com.slickarc.hb.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppErrorController implements ErrorController{
    private static final String PATH = "/flash";

	@RequestMapping(value=PATH)
	public String flashErrorMessage()
	{
		return "<h2 > Something unexpected happened. <h2>";
	}
	
    @Override
    public String getErrorPath() {
        return PATH;
    }
}
