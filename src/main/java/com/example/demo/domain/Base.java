import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "base")
public class Base {

    @Id
    private String id;
    private String name;
    private String owner;



    public Base() {
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
