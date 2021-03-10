package springboot.restful.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String list() {
		return "list";
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	public String get(@PathVariable String id) {
		return "get" + id;
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String create() {
		return "create";
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.PUT)
	public String update(@PathVariable String id) {
		return "update" + id;
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		return "delete" + id;
	}
}
