import java.util.ResourceBundle; 
import java.util.logging.*; 
  
public class GFG { 
  
    public static void main(String[] args) 
    { 
  
        // Create ResourceBundle using getBundle 
        // myResource is a properties file 
        ResourceBundle bundle 
            = ResourceBundle 
                  .getBundle("resourceBundle"); 
  
        // Create a Logger 
        // with GFG.class and resourceBundle 
        Logger logger 
            = Logger.getLogger( 
                GFG.class.getName(), 
                bundle.getBaseBundleName()); 
  
        // Log the info 
        logger.info("Message 1 for logger"); 
    } 
} 