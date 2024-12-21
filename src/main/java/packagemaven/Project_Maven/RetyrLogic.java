package packagemaven.Project_Maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetyrLogic implements IRetryAnalyzer {

	int initialcount = 0;
	int retrtycount = 1;

	@Override
	public boolean retry(ITestResult result) {

		if (initialcount < retrtycount) {

			initialcount++;
			return true;

		}

		return false;
	}

}
