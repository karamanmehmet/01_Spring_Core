package com.cybertek.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cybertek.dto.StudentDto;

@Controller
public class StudentController {

	@GetMapping("/add")
	public String showForm(Model model) {
		StudentDto student = new StudentDto();
		model.addAttribute("student", student);

		List<String> listLevel = Arrays.asList("Pre-K", "KinderG", "1st Grade");
		model.addAttribute("listLevel", listLevel);

		return "add";
	}

	@PostMapping("/add")
	public String submitForm(@ModelAttribute("student") StudentDto student) {
		System.out.println(student);
		return "register_success";
	}
}
