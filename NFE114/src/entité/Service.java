package entité;

public class Service {
	String name;
	String description;
	String link;
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getDescription() {
		return description;
	}
	private void setDescription(String description) {
		this.description = description;
	}
	private String getLink() {
		return link;
	}
	private void setLink(String link) {
		this.link = link;
	}
	public Service(String name, String description, String link) {
		super();
		this.name = name;
		this.description = description;
		this.link = link;
	}
	public Service(String name, String link) {
		super();
		this.name = name;
		this.link = link;
	}
	
	

}
