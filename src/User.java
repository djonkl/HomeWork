import com.sun.jndi.cosnaming.IiopUrl;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.io.Serializable;

public class User
        implements Serializable {

    private String username;
    private Address address;


    public User() {}
    public String getUsername() {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

}
