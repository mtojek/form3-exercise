package pl.tojek.marcin.form3.model;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Organisation {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
