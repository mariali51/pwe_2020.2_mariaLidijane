package br.com.maria.agropopshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.agropopshop.api.models.Cliente;
import br.com.maria.agropopshop.api.repository.ClienteRepository;

	@Controller
	@RequestMapping("/")
	public class ClienteController {
		@Autowired
		ClienteRepository clienteRepository;
		
		
		@GetMapping
		public String index() {
			return "index.html";
		}
		
		@GetMapping("cadastrarcliente")
		public ModelAndView CadastarCliente() {
			 ModelAndView mav = new  ModelAndView("cadastrarcliente");
			 mav.addObject(new Cliente());
			 return mav;
		}
		@PostMapping("/cadastrarcliente")
		public String AddPessoa(Cliente cliente) {
			this.clienteRepository.save(cliente);
			return "redirect:/adm/listarClientes";    
	   }
	}

