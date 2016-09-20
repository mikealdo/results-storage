package cz.mikealdo.storage.geb.pages
import geb.Page

class HealthEndpointPage extends Page{
    static url = "/health"
    
    static at ={
        statusJson.isDisplayed()
    }
    
    static content = {
        statusJson {$("body")}
    }
    
}
