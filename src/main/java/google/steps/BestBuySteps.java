package google.steps;

import com.webpt.testing.starter.google.pages.GoogleSearchPage;

import net.thucydides.core.annotations.Step;

public class BestBuySteps {
	private GoogleSearchPage searchPage;
	 	@Step
	    public void opensGoogleSearchPage(){
	        searchPage.open();
	        searchPage.waitForReady();
	    }

	    @Step
	    public void entersSearchTerm(String searchTerm){
	        searchPage.enterSearchTerm(searchTerm);
	    }

	    @Step
	    public void clicksSearch(){
	        searchPage.clickSearchButton();
	    }

	    @Step
	    public void seesSearchResultsContain(String term){
	        assertThat(searchPage.containsText(term))
	                .describedAs("Search results should have contained value ["+term+"]")
	                .isTrue();
	    }
}
