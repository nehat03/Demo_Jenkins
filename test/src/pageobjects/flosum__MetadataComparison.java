package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Flosum__ Metadata Comparison"                                
               , summary=""
               , page="MetadataComparison"
               , namespacePrefix="Flosum"
               , object=""
               , connection="Adm"
     )             
public class flosum__MetadataComparison {

	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='selectedSourceOption']")
	public WebElement selectedSourceOption;
	
}
