
package Controller;

import Entity.Bashekim;
import Model.BashekimModel;
import java.util.List;


public class BashekimController {

    private BashekimModel model;

    public BashekimModel getBashekimodel() {
        if (this.model == null) {
            this.model = new BashekimModel();
        }
        return model;
    }

    public void setBashekimodel(BashekimModel bashekimodel) {
        this.model = bashekimodel;
    }

    public void create(int id, String poliklinik, String name) {
        Bashekim bashekim = new Bashekim(id, poliklinik, name);
        this.getBashekimodel().insert(bashekim);
    }

    public List<Bashekim> getList() {
        return this.model.getList();
    }

}
