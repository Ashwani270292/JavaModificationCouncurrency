import java.util.ArrayList;
import java.util.List;

public class MyResponse {

	private String id;
	private String name;
	private List<Data1> data1List = new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Data1> getData1List() {
		return data1List;
	}
	public void setData1List(List<Data1> data1List) {
		this.data1List = data1List;
	}
	
	
	
}
