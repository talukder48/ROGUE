package pkg.RogueSession;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import pkg.utils.Calculator;
@Stateless
@LocalBean
public class Service implements ServiceRemote {
	Calculator c;
    public Service() {
    	c= new Calculator();       
    }
    @Override
    public long add(long i, long j) {	
    	return c.Sumation(i, j);
    }
    
}
