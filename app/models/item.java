package models;

import play.*;
import play.mvc.*;
import javax.persistence.*;
import play.db.jpa.*;

@Entity
public class item extends Model{
   public String name;
   public String descrip;
   public int size;
   public double price;  
}
