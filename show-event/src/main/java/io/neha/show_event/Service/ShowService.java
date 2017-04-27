package io.neha.show_event.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.neha.show_event.Model.Show;
import io.neha.show_event.Repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	ShowRepository repo;
	
	public ArrayList<Show> getAll(){
		
		return repo.getAll();
	}
}
