package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import com.revature.models.Editor;
import com.revature.services.EditorServiceImpl;

@RestController
@RequestMapping("editors")
public class EditorController {

	@Autowired
	private EditorServiceImpl eSI;

	@GetMapping("")
	List<Editor> findAll() {
		return eSI.findAll();
	}

	@GetMapping("{id}")
	public Editor findEditorById(@PathVariable int id) {
		return eSI.findById(id);
	}

	@PostMapping("/email/{email}")
	public Editor findByEmail(@Valid @RequestBody String email) {
		return eSI.findByEmail(email);
	}

	@GetMapping("surveyId/{id}")
	public List<Editor> findEditorBySurveyId(@PathVariable int id) {
		return eSI.findBySurveyId(id);
	}
	
	@PostMapping
	public Editor createEditor(@RequestBody Editor editor) {
		return eSI.createEditor(editor);
	}
	
	@PatchMapping
	public Editor updateEditor(@RequestBody Editor editor) {
		return eSI.updateEditor(editor);
	}
	@DeleteMapping
	public void deleteEditor(int id) {
		eSI.deleteEditor(id);
	}
	

}
