package HooksFile;


import com.Base.CommonBase;
import com.Screens.HideShowButton;
import com.Utils.commonUtilities;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooks extends CommonBase {
	
	public Scenario scenario;
	public HideShowButton hide;
	static String featureName;
	
	

	
	
	
	@Before
	public void launchApp(Scenario scenario) {
		
		commonUtilities obj = new commonUtilities();
		obj.setCapabilities();
		driver = obj.getAndroidDriver();
		this.scenario = scenario;
		
		
		
		
	}
	
	@After
	public void after(Scenario scenario) {
		commonUtilities.stopAppium();
	}
	
	
	
	
}
