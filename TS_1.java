package testscripts;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericscripts.Base_class;
import genericscripts.Generic_Read;
import pomscripts.PomFblogin;

public class TS_1 extends Base_class
{
@Test
public void script() throws EncryptedDocumentException, IOException
{
	String username=Generic_Read.getData("Sheet1", 0, 0);
	String password=Generic_Read.getData("Sheet1", 1, 0);
	PomFblogin pmc = new PomFblogin(driver);
	pmc.usname(username);
	pmc.passwd(password);
	Assert.fail();
	pmc.clicklogin();
}
}
