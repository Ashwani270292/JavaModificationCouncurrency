import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		
		//taking dummy data to fill data in MyResponse Object
		List<Data11> dataInnerList= new ArrayList<>();
		Data11 data11 = new Data11();
		data11.setId("1");
		data11.setDataToBeModified("String 1");
		dataInnerList.add(data11);
		
		data11 = new Data11();
		data11.setId("2");
		data11.setDataToBeModified("String 2");
		dataInnerList.add(data11);
		
		data11 = new Data11();
		data11.setId("3");
		data11.setDataToBeModified("String 3");
		dataInnerList.add(data11);
		
		data11 = new Data11();
		data11.setId("4");
		data11.setDataToBeModified("String 4");
		dataInnerList.add(data11);
		
	
		Data1 data1 = new Data1();
		data1.setData11List(dataInnerList);
		data1.setEmail("ashwani270292@gmail.com");
		data1.setId("1");
		
		List<Data1> dataOuterList = new ArrayList<>();
		dataOuterList.add(data1);
		
		MyResponse myResponse = new MyResponse();
		myResponse.setData1List(dataOuterList);
		myResponse.setId("99");
		myResponse.setName("Ashwani");
		
		
		
		//Now suppose you want to modify data in the dataInnerList whose id  = 3 and outer id = 1;
		
		modifyMyData(myResponse);
		
		
	}
	public static void modifyMyData(MyResponse myResponse){
		
		//taking out the outerlist
		List<Data1> outerList = myResponse.getData1List();
		for(Data1 data : outerList){
			//found the outer object
			if(data.getId().equals("1")){
				List<Data11> innerList = data.getData11List();
				//create a dummy List i.e. copy of existing list
				List<Data11> innerListCopy = innerList;
				
				//now traverse
				int index = 0;
				for(Data11 data11 : innerList){
					if(data11.getId().equals("3")){
						innerListCopy.get(index).setDataToBeModified("Modified String Successfully");
						Data11 temp = innerListCopy.get(index);
						System.out.println("Modified new value is:"+temp.getDataToBeModified());
					}
					index++;
				}
			}
		}
		
	}
	

}
