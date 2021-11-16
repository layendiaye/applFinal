package com.m2i.appliTpFinal.rest;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.entity.Spectacle;
import com.m2i.appliTpFinal.service.ServiceCategory;
import com.m2i.appliTpFinal.service.ServiceSpectacle;

@RestController
@RequestMapping(value = "/rest/spectacle", headers = "Accept=application/json")
public class SpectacleRestCtl {

	@Autowired
	private ServiceSpectacle serviceSpectacle;
	@Autowired
	private ServiceCategory serviceCategory;

	@PostConstruct
	public void initialiserSpectaclePourExemple() {
		Category c1 = new Category(null, "Sport");
		serviceCategory.saveOrUpdateCategory(c1);
		Category c2 = new Category(null, "Cinema");
		serviceCategory.saveOrUpdateCategory(c2);

		serviceSpectacle.addSpectacleCat(new Spectacle(null, "Football", "championat", 2, 20.0, 250000), c1.getId());

		serviceSpectacle.addSpectacleCat(new Spectacle(null, "spectacle 2", "le grang spectacle", 5, 200.0, 3),
				c2.getId());
		serviceSpectacle.addSpectacleCat(new Spectacle(null, "Danse", "Tournoi de danse", 2, 50.0, 250), c2.getId());
		serviceSpectacle.addSpectacleCat(
				new Spectacle(null, "Tournoi de lutte", "Championat de lutte avec frappe", 6, 20.0, 30000), c1.getId());
	}

	@RequestMapping(value = "/{idSple}", method = RequestMethod.GET) // ou @GetMapping("/{idSple}")
	public Spectacle getSpectacleById(@PathVariable("idSple") Long idSple) {

		return serviceSpectacle.findSpectacleById(idSple);

	}

	@RequestMapping(value = "", method = RequestMethod.POST) // ou @PostMapping("")
	public Spectacle postSpectacle(@RequestBody Spectacle spectacle) {
		serviceSpectacle.saveOrUpdateSpectacle(spectacle);
		return spectacle;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Spectacle> getAllSpectacle() {
		return serviceSpectacle.rechercherTousLesSpectacles();

	}
	/*
	 * @RequestMapping(value = "", method = RequestMethod.POST) public
	 * SpectacleCategory postSpectacleCat(@RequestBody SpectacleCategory dtoCat) {
	 * serviceSpectacle.addSpectacleCat(dtoCat.getSpectacle(),
	 * dtoCat.getCategoryId()); return dtoCat;
	 * 
	 * }
	 */

}
