package test.java.config;

public class Constants {
	 
	//This is the list of System Variables
	public static final String URL = "http://www.amazon.co.uk/";
	public static final String Path_TestData = "C://Users//welcome//workspace//OnlineStore//src//test//java//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "C://Users//welcome//workspace//OnlineStore//src//test//java//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_RunMode =2 ;
	public static final int Col_Result =3 ;
	public static final int Col_DataSet =6 ;
	public static final int Col_TestStepResult =7 ;
	
	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "TestSteps";
	public static final String Sheet_TestCases = "TestCases";
	 
}