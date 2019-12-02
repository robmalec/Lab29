package co.grandcircus.Lab29.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Lab29.model.Deck;



@Controller
public class HomeController {

	
	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("Hello world!");
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!");

		String url = "https://deckofcardsapi.com/api/deck/new/draw/?count=5";
		
		
		ResponseEntity<Deck> response = rt.exchange(url,  HttpMethod.GET,new HttpEntity<String>("parameters",headers),Deck.class);
				
		return new ModelAndView("index", "deck", response.getBody().getCards());
	}
}
