package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;


public class Application extends Controller {

    public static void index() {
        render();
     }
 
       public static void prueba() {
        render();
    }
 
    
    public static void update(Long id, String n,String d,int s, int p){      
       item ui = item.findById(id);
      if(ui!=null){
        ui.name = n;
        ui.descrip = d;
        ui.size = s;
        ui.price = p;        
        ui.save();
        renderJSON(ui);
      }        
    }
  
    public static void addItem(String n, String d, int s, double p){
        item ni = new item();
        ni.name = n;
        ni.descrip = d;
        ni.size = s;
        ni.price = p;        
        ni.save();
        renderJSON(ni);    
    }
  
     public static void items() {
        List<item> items = item.findAll();                        
        renderJSON(items);        
    }

     public static void delete(Long id) {
          item i = item.findById(id);
          if(i!= null)
          i.delete();
          renderJSON(i);
     }
  
    public static void search(Long id) {
          item i = item.findById(id);
          if(i!= null)         
          renderJSON(i);
     }
  
  //     public static void Login(Long id,pass) {
  //           user u = user.findById(id);
  //           if(i!= null)
  //             if(u.password = pass)
  //                 render("Login");                   
  //           renderJSON(i);
  //      }
  
}
