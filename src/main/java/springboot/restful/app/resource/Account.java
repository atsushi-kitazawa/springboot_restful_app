package springboot.restful.app.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Account {

	private static Integer nextId = 0;
	private static Map<Integer, Account> map = new HashMap<>();

	private Integer id;
	private String name;

	public Account(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public static List<Account> list() {
		List<Account> accounts = new ArrayList<>();
		for (Map.Entry<Integer, Account> e : map.entrySet()) {
			accounts.add(e.getValue());
		}
		return accounts;
	}

	public static Account get(Integer id) {
		return map.get(id);
	}

	public synchronized static Account create(String name) {
		Account account = new Account(nextId, name);
		map.put(nextId, account);
		incrementId();
		return account;
	}

	public static Account update(Integer id, String name) {
		Account account = map.get(id);
		account.name = name;
		map.put(id, account);
		return account;
	}

	public static Account delete(Integer id) {
		Account account = map.remove(id);
		return account;
	}

	public synchronized static void incrementId() {
		nextId++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
}