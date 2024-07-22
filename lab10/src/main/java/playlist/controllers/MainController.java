package playlist.controllers;

import playlist.DAO.SongDAO;
import playlist.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/music")
public class MainController {

	private final SongDAO songDAO = new SongDAO();

	@GetMapping()
	public String index(Model model){
		model.addAttribute("song", songDAO.index());
		return "music/index";
	}

	@GetMapping("/add")
	public String addMusic(Model model){
		model.addAttribute("song", new Song());
		return "music/add";
	}

	@PostMapping()
	public String create(@ModelAttribute("song") Song song){
		songDAO.save(song);
		return "redirect:/music";
	}

	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id, Model model){
		model.addAttribute("song", songDAO.show(id));
		return "music/show";
	}

	@GetMapping("/{id}/edit")
	public String edit(Model model, @PathVariable("id") int id){
		model.addAttribute("song", songDAO.show(id));
		//System.out.println("edit");
		return "music/edit";
	}

	@PostMapping("/{id}/update")
	public String update(@ModelAttribute("song") Song song, @PathVariable("id") int id){
		songDAO.update(id, song);
		return "redirect:/music";
	}

	@PostMapping("/{id}")
	public String delete(@PathVariable("id") int id){
		songDAO.delete(id);
		//System.out.println("delete");
		return "redirect:/music";
	}
}
