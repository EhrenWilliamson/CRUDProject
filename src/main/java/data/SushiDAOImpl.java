package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class SushiDAOImpl implements SushiDAO {
	private static final String FILE_NAME = "/WEB-INF/sushi.csv";
	private List<Sushi> sushiList = new ArrayList<>();

	@Autowired
	private WebApplicationContext wac;

	@PostConstruct
	public void init() {
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system

		try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			System.out.println("in try");
			while ((line = buf.readLine()) != null) {
				System.out.println("in while");
				String[] tokens = line.split(",");
				Integer id = Integer.parseInt(tokens[0]);
				String fish = tokens[1];
				String rice = tokens[2];
				String wrapper = tokens[3];
				sushiList.add(new Sushi(id, fish, rice, wrapper));
			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public List<Sushi> getSushi() {
		return sushiList;
	}

	@Override
	public List<Sushi> addSushi(Sushi sushi) {
		sushiList.add(sushi);
		return sushiList;
	}

	@Override
	public List<Sushi> removeSushi(Sushi sushi) {
		List<Sushi> sushiList = new ArrayList<>();
		getSushi().remove(sushi);
		return sushiList;
	}

	@Override
	public List<Sushi> editSushi(Sushi sushi) {

		int index = 0;
		for (Sushi sushi1 : sushiList) {
			if (sushi.getId() == sushi1.getId()) {
				index = getSushi().indexOf(sushi);
				break;
			}
		}
		Sushi s = new Sushi();
		s.setFish(sushi.getFish());
		s.setRice(sushi.getRice());
		s.setWrapper(sushi.getWrapper());
		s.setId(sushi.getId());
		sushiList.set(index, s);

		// TODO Auto-generated method stub
		return sushiList;
	}

	@Override
	public Sushi getSushiByID(Integer id) {
				return sushiList.get(id);
	}

}
