package models;

import play.*;
import play.mvc.*;
import javax.persistence.*;
import play.db.jpa.*;

@Entity
public class user extends Model{
   public String name;
   public String username;
   public String password;  
}
