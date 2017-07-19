import java.util.ArrayList;
import java.util.List;

public class Data1 {

	private String id;
	private String email;
	private List<Data11> data11List = new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Data11> getData11List() {
		return data11List;
	}
	public void setData11List(List<Data11> data11List) {
		this.data11List = data11List;
	}
	
}
