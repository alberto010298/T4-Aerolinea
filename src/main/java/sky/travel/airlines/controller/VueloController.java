package sky.travel.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sky.travel.airlines.model.entity.Paquete;
import sky.travel.airlines.model.entity.Pasajero;
import sky.travel.airlines.model.entity.Vuelo;
import sky.travel.airlines.service.PasajeroService;
import sky.travel.airlines.service.VueloService;

@Controller
@RequestMapping("/vuelo")
@SessionAttributes({"vuelo"})
public class VueloController {

	@Autowired
	private PasajeroService pasajeroService;
	
	@Autowired
	private VueloService vueloService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Vuelo> vuelos = vueloService.findAll();
			model.addAttribute("vuelos", vuelos);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/vuelo/listavuelo";
	}
	
	@PostMapping("/savevuelo")
	public String saveVuelo(@ModelAttribute("vuelo") Vuelo vuelo, 
			Model model, SessionStatus status) {
		try {
			vueloService.save(vuelo);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/vuelo";
	}
	@GetMapping("/nuevovuelo")
	public String nuevoVuelo(Model model) {
		Vuelo vuelo = new Vuelo();
		model.addAttribute("vuelo", vuelo);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/vuelo/nuevovuelo";
	}
}
