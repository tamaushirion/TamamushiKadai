package com.example.Controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.Form;
import com.example.model.FModel;
import com.example.service.ItemService;
import com.example.service.JudgementService;

@Controller
public class FizzbuzzController {

	@Autowired
	private ItemService service;

	@Autowired
	private JudgementService resultService;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/Fizzbuzz")
	public String getFizzbuzz(Model model, @ModelAttribute Form form) {

		List<FModel> numedList = service.findNum();

		model.addAttribute("numedList", numedList);

		return "/html/form";
	}

	@PostMapping("/Fizzbuzz")
	public String postFizzbuzz(Model model, @ModelAttribute @Validated Form form, BindingResult bindingResult) {

		FModel number = modelMapper.map(form, FModel.class);

		String inputNum = number.getNum();

		if (bindingResult.hasErrors()) {
			
			return this.getFizzbuzz(model, form);
		}

		String[][] resultList = resultService.ResultJudgementService(inputNum);
		
		//判定結果格納
		model.addAttribute("resultList", resultList);
		
		//数値追加
		service.insertNum(number);

		return this.getFizzbuzz(model, form);

	}
}
