package pkg.RogueSession;
import java.util.HashMap;
import java.util.Map;

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
	public Map add(Map map) {
		// TODO Auto-generated method stub
		long a=Long.parseLong(map.get("n1").toString());
		long b= Long.parseLong(map.get("n2").toString());
		map.clear();
		map.put("RES",c.Sumation(a,b));
		return map;
	}
    
}
