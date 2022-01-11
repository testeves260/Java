package entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private Integer age;
	private List playerList = new ArrayList <>();
	
	
	public Player() {}
	
	public Player (String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	

}
