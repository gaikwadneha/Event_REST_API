package io.neha.show_event.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.neha.show_event.Model.Show;
import io.neha.show_event.Service.ShowService;

@CrossOrigin(origins = "http://127.0.0.1:8080")
@RestController
@RequestMapping(path = "show")
public class ShowController {

	@Autowired
	ShowService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ArrayList<Show> getAll(){
		return service.getAll();
	}
	
}
