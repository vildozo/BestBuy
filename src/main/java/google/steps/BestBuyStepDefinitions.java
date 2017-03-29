package google.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;



public class BestBuyStepDefinitions {

	
		@Steps
	    private BestBuySteps user;
	 
		@Given("I am on the Google search page")
	    public void openGoogleSearchPage(){
	        user.opensGoogleSearchPage();
	    }

	    @When("I enter the search term '$searchTerm'")
	    public void searchFor(String searchTerm){
	        user.entersSearchTerm(searchTerm);
	    }

	    @When("I click the search icon")
	    public void clickSearch(){
	        user.clicksSearch();
	    }

	    @Then("I should see the '$term' in the search results")
	    public void searchResultsContain(String term){
	        user.seesSearchResultsContain(term);
	    }
	
	
	
}
