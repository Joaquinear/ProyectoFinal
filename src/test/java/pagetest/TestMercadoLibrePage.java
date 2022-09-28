package pagetest;

import actions.*;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.StateItem;
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
        Click.on(driver,UiMercadoLibre.cacheBtn);
        Assert.assertTrue(TQuantity.itemsAvailableNews(driver));
        if(TQuantity.itemsAvailableNews(driver)){
            Click.on(driver,UiMercadoLibre.newQuantity);
            Assert.assertEquals("Nuevo", Text.getText(driver,UiMercadoLibre.filterOption));
        }else{
            Assert.assertEquals(searchString.get(0), Text.getText(driver,UiMercadoLibre.resultSearch));
        }

    }
    @Test
    public void SearchFirstUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(0));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Click.on(driver,UiMercadoLibre.cacheBtn);
        //Assert.assertTrue(TQuantity.itemsAvailableNews(driver));
        if(TQuantity.itemsAvailableUsed(driver)){
            ClickNonClickable.Click(driver,UiMercadoLibre.usedQuantity);
            System.out.println(StateItem.getText(driver));
            Assert.assertEquals("Usado", Text.getText(driver,UiMercadoLibre.filterOption));
        }else {
            Assert.assertEquals("la cantidad  de items era menor que 3",Text.getText(driver,UiMercadoLibre.usedQuantity));
        }
    }
    @Test
    public void SearchSecondNews(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(1));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Click.on(driver,UiMercadoLibre.cacheBtn);
        if(TQuantity.itemsAvailableNews(driver)){
            Click.on(driver,UiMercadoLibre.newQuantity);
            System.out.println(StateItem.getText(driver));
            Assert.assertEquals("Nuevo", StateItem.getText(driver));
        }else{
            Assert.assertEquals("la cantidad  de items era menor que 3",Text.getText(driver,UiMercadoLibre.newQuantity));
        }
    }
    @Test
    public void SearchSecondUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(1));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Click.on(driver,UiMercadoLibre.cacheBtn);
        //Assert.assertTrue(TQuantity.itemsAvailableUsed(driver));
        if(TQuantity.itemsAvailableUsed(driver)){
            Click.on(driver,UiMercadoLibre.usedQuantity);
            Assert.assertEquals("Usado", StateItem.getText(driver));
        }else {
            Assert.assertEquals("la cantidad  de items era menor que 3",Text.getText(driver,UiMercadoLibre.usedQuantity));
        }
    }
    @Test
    public void SearchThridNew(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(2));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Click.on(driver,UiMercadoLibre.cacheBtn);
        if(TQuantity.itemsAvailableNews(driver)){
            Click.on(driver,UiMercadoLibre.newQuantity);
            Assert.assertEquals("Nuevo", StateItem.getText(driver));
        }else{
            Assert.assertEquals("la cantidad  de items era menor que 3",Text.getText(driver,UiMercadoLibre.newQuantity));
        }
    }
    @Test
    public void SearchThridUsed(){
        TGoogleSearch.InputSearch(driver,"mercado libre");
        TGoogleClick.firstResult(driver);
        Click.on(driver,UiMercadoLibre.country);
        EnterText.text(driver, UiMercadoLibre.searchBar, searchString.get(2));
        Enter.enter(driver,UiMercadoLibre.searchBar);
        Click.on(driver,UiMercadoLibre.cacheBtn);
        if(TQuantity.itemsAvailableUsed(driver)){
            Click.on(driver,UiMercadoLibre.usedQuantity);
            Assert.assertEquals("Usado", Text.getText(driver,UiMercadoLibre.filterOption));
        }else {
            Assert.assertEquals("la cantidad  de items era menor que 3",Text.getText(driver,UiMercadoLibre.usedQuantity));
        }
    }
}
