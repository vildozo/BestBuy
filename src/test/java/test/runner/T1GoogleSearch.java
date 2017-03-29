package test.runner;

import testing.starter.BaseTest;

public class T1GoogleSearch extends BaseTest{
	@Override
    public String[] filterSteps() {
        return new String[] {"BestBuyStepDefinitions"};
    }

    @Override
    protected String getStoryPath() {
        return "stories/tests/google/site_search/broad_search.story";
    }
}
