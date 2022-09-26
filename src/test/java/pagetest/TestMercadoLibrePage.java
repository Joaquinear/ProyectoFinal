package pagetest;

import actions.*;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.TGoogleClick;
import task.TGoogleSearch;
import task.TQuantity;
import ui.UiMercadoLibre;

import java.util.Arrays;
import java.util.List;

public class TestMercadoLibrePage extends BaseTest {
    private List<String> searchString = Arrays.asList("Playstarion","Nintendo","Laptop");
    @Test
    public void countrySelect(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.country));
        Click.on(driver,UiMercadoLibre.country);
    }
    @Test
    public void SearchFirstNews(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(0));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertTrue(TQuantity.itemsAvailableNews(driver));
        Assert.assertEquals(searchString.get(0), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
    @Test
    public void SearchFirstUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(0));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertTrue(TQuantity.itemsAvailableUsed(driver));
        Assert.assertEquals(searchString.get(0), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
    @Test
    public void SearchSecondNews(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(1));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertEquals(searchString.get(1), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
    @Test
    public void SearchSecondUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(1));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertTrue(TQuantity.itemsAvailableUsed(driver));
        Assert.assertEquals(searchString.get(1), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
    @Test
    public void SearchThridNew(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(2));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertTrue(TQuantity.itemsAvailableNews(driver));
        Assert.assertEquals(searchString.get(2), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
    @Test
    public void SearchThridUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(2));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Assert.assertTrue(TQuantity.itemsAvailableUsed(driver));
        Assert.assertEquals(searchString.get(2), GetText.getText(driver,UiMercadoLibre.resultSearch));
    }
}
