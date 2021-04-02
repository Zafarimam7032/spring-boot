package com.zafar.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.server.LinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zafar.student.pojo.StudentVo;

@RestController
@RequestMapping(path = "/student")
public class Controller {
	private List<StudentVo> list = new ArrayList<StudentVo>();
	@Autowired
	StudentVo studentVo;
	

	public Controller() {
		studentVo = new StudentVo();
		studentVo.setId(1);
		studentVo.setName("Zafar Imam");
		studentVo.setCity("new Delhi");
		studentVo.setMobile("9823432");
		list.add(studentVo);
		studentVo = new StudentVo();
		studentVo.setId(2);
		studentVo.setName("Asi");
		studentVo.setCity("Delhi");
		studentVo.setMobile("9823212432");
		list.add(studentVo);
		studentVo = new StudentVo();
		studentVo.setId(13);
		studentVo.setName("Rasika");
		studentVo.setCity("Delhi");
		studentVo.setMobile("98233432");
		list.add(studentVo);
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<StudentVo>> getAllStudent() {
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		return ResponseEntity.created(uri).body(list);
	}

	@GetMapping(path = "/all/{id}")
	public StudentVo getStudentById(@PathVariable("id") int id ) {
		Iterator<StudentVo> iterator = list.iterator();
		if (iterator.hasNext()) {
			while (iterator.hasNext()) {
				StudentVo next = iterator.next();
				if (next.getId() == id) {
					//Link selfRel = WebMvcLinkBuilder.linkTo(this.getClass()).slash("/all/"+next.getId()).withRel("Student");
					Link selfRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).getStudentById(id)).withSelfRel();
					return next.add(selfRel);
				}
			}

		} else {

		}

		
		return null;
	}

}
