package springboot.restful.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.restful.app.resource.Account;

@RestController
public class AccountController {

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String list() {
		return Account.list().toString();
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	public String get(@PathVariable String id) {
		return Account.get(Integer.parseInt(id)).toString();
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String create(@RequestBody String name) {
		return Account.create(name).toString();
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.PUT)
	public String update(@PathVariable String id, @RequestBody String name) {
		return Account.update(Integer.parseInt(id), name).toString();
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		return Account.delete(Integer.parseInt(id)).toString();
	}
}
