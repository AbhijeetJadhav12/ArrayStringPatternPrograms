import java.io.Serializable;

public class Player implements Serializable{

	private int id;
	private String name;
	private int runs;
	public Player() {
		
	}
	public Player(int id,String name, int runs) {
		this.id=id;
		this.name=name;
		this.runs=runs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
