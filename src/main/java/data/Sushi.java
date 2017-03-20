package data;

public class Sushi {

	private Integer id;
	private String fish;
	private String rice;
	private String wrapper;
	
	public Sushi(){
		
	}
	public Sushi(Integer id, String fish, String rice, String wrapper) {
		
		this.id = id;
		this.fish = fish;
		this.rice = rice;
		this.wrapper = wrapper;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFish() {
		return fish;
	}
	public void setFish(String fish) {
		this.fish = fish;
	}
	@Override
	public String toString() {
		return "Sushi [id=" + id + ", fish=" + fish + ", rice=" + rice + ", wrapper=" + wrapper + "]";
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getWrapper() {
		return wrapper;
	}
	public void setWrapper(String wrapper) {
		this.wrapper = wrapper;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Sushi other = (Sushi) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
