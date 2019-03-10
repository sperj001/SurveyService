package com.revature.services;

import java.util.List;

import com.revature.models.Editor;
import com.revature.models.Editor;

public interface EditorService {

	List<Editor> findAll();

	Editor findById(int id);

	Editor findByEmail(String email);

	List<Editor> findBySurveyId(int id);

	Editor createEditor(Editor editor);

	Editor updateEditor(Editor editor);
	
	void deleteEditor(int id);

}
