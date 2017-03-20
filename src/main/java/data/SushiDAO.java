package data;

import java.util.List;

public interface SushiDAO {
	public List<Sushi> getSushi();
	public List<Sushi>  addSushi(Sushi sushi);
	public List<Sushi> removeSushi(Sushi sushi);
	public List<Sushi> editSushi(Sushi sushi);
	public Sushi getSushiByID(Integer id);
}
