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
import com.example.service.NumberJudgementService;

@Controller
public class FizzbuzzController {

	@Autowired
	private ItemService service;

	@Autowired
	private JudgementService resultService;

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private NumberJudgementService numberService;

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

		List<String> messageList = resultService.ResultJudgementService(inputNum);
		List<String> numeberList = numberService.NumberService(inputNum);
		
		//判定結果格納
		model.addAttribute("messageList", messageList);
		model.addAttribute("numeberList", numeberList);
		
		//数値追加
		service.insertNum(number);

		return this.getFizzbuzz(model, form);

	}
}
