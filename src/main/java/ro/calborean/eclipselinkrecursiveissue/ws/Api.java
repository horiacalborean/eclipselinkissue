package ro.calborean.eclipselinkrecursiveissue.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import ro.calborean.eclipselinkrecursiveissue.ws.repo.ParentEntityBean;
import ro.calborean.eclipselinkrecursiveissue.ws.repo.entities.ParentEntity;

@WebService
public class Api {

    @EJB
    ParentEntityBean bean;
    
    @WebMethod(operationName = "getData")
    public String getData() {
        ParentEntity p = new ParentEntity();
        bean.find(p);
        return "ok";
    }
    
}