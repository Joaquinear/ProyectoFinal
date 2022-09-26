package pagetest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.*;

public class TestGoogleSearch extends BaseTest {
    @Test
    public void testGoogleSerach(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        Assert.assertEquals("Mercado Libre - Envíos Gratis en el día", TResultGetTextGoogle.firstResult(driver));
        System.out.println(TResultGetTextGoogle.firstResult(driver));
    }
    @Test
    public void testGoogleResultClick(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Assert.assertEquals(driver.getTitle(),"Mercado Libre - Envíos Gratis en el día");
    }
}
