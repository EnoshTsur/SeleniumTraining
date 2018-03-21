package tests;

import org.testng.annotations.Listeners;

import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;

@Listeners(il.co.topq.difido.ReportManagerHook.class)
public abstract class AbstractTestCase {

	// Report - for logs & reports
	protected ReportDispatcher report = ReportManager.getInstance();
}
