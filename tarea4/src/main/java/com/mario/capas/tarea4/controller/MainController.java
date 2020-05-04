package com.mario.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mario.capas.tarea4.domain.Producto;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");

		return mav;
	}

	@RequestMapping("/parametros")
	public ModelAndView validar(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("productName", product.getproductName());
			mav.setViewName("ingresadoconexito");
		}
		return mav;
	}

}
