import java.util.HashMap;
import java.util.Map;

public class NameFetcher {
  private static NameFetcher fetcher;

  private NameFetcher() {
  }

  public static synchronized NameFetcher getInstance() {
    if (fetcher == null) {
      fetcher = new NameFetcher();
    }
    return fetcher;
  }
  
public String retrieveState(String abbreviation){
	
	
	
	//Load map with values from state database
	Map<String, String> stateMap = new HashMap<String, String>();
	
	if(!abbreviation.isEmpty() && abbreviation != "" ){
		
		return stateMap.get(abbreviation);
		
		
	} else {
		throw new IllegalArgumentException("Enter Valid State abbreviation");
	}
	
	
 }


  
} 

